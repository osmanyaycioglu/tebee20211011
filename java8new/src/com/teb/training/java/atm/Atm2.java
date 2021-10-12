package com.teb.training.java.atm;

import java.util.List;
import java.util.Scanner;

import com.teb.training.java.atm.business.CustomerManager;
import com.teb.training.java.atm.business.ICustomerProcess;
import com.teb.training.java.atm.common.LoginException;
import com.teb.training.java.atm.data.CustomerStorage;
import com.teb.training.java.atm.data.ICustomerStorage;
import com.teb.training.java.atm.models.Customer;

public class Atm2 {

    public static void main(final String[] args) {
        ICustomerStorage customerStorageLoc = new CustomerStorage();
        CustomerManager customerManagerLoc = new CustomerManager(customerStorageLoc);
        List<ICustomerProcess> customerProcessesLoc = customerManagerLoc.getCustomerProcesses();
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Bankamıza hoş geldiniz");
            root:
            while (true) {
                scannerLoc.nextLine();
                System.out.println("username:");
                String username = scannerLoc.nextLine();
                System.out.println("password:");
                String password = scannerLoc.nextLine();
                Customer customerLoc = null;
                try {
                    customerLoc = customerManagerLoc.login(username,
                                                           password);
                } catch (LoginException eLoc) {
                    System.out.println(eLoc.getMessage());
                    continue root;
                }
                menu:
                while (true) {
                    System.out.println(customerLoc.getName() + " " + customerLoc.getSurname() + " hoş geldiniz.");
                    int i = 0;
                    for (i = 0; i < customerProcessesLoc.size(); i++) {
                        ICustomerProcess cpLoc = customerProcessesLoc.get(i);
                        System.out.println((i + 1)
                                           + "-"
                                           + cpLoc.menuProvider()
                                                  .get());
                    }
                    System.out.println(++i + "-Çıkış");
                    System.out.println("seçiminiz : ");
                    int nextIntLoc = scannerLoc.nextInt();
                    if (nextIntLoc > customerProcessesLoc.size()) {
                        break menu;
                    }
                    ICustomerProcess iCustomerProcessLoc = customerProcessesLoc.get(nextIntLoc - 1);
                    customerManagerLoc.executeProcess(iCustomerProcessLoc,
                                                      customerLoc,
                                                      scannerLoc);
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

}
