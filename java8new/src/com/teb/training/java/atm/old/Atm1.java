package com.teb.training.java.atm.old;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.teb.training.java.atm.models.Customer;

public class Atm1 {

    public static void main(final String[] args) {
        Map<String, Customer> mapLoc = new HashMap<>();
        mapLoc.put("osmany",
                   new Customer().setName("osman")
                                 .setSurname("yaycıoğlu")
                                 .setUsername("osmany")
                                 .setAmount(1000)
                                 .setPassword("1234"));
        mapLoc.put("aliveli",
                   new Customer().setName("ali")
                                 .setSurname("veli")
                                 .setUsername("aliveli")
                                 .setAmount(5000)
                                 .setPassword("1234"));
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Bankamıza hoş geldiniz");
            root:
            while (true) {
                scannerLoc.nextLine();
                System.out.println("username:");
                String username = scannerLoc.nextLine();
                System.out.println("password:");
                String password = scannerLoc.nextLine();
                Customer customerLoc = mapLoc.get(username);
                if (customerLoc == null) {
                    System.out.println("Böyle bir user yok : " + username);
                    continue root;
                }
                if (!password.equals(customerLoc.getPassword())) {
                    System.out.println("Password eşleşmedi : " + username);
                    continue root;
                }
                menu:
                while (true) {
                    System.out.println(customerLoc.getName() + " " + customerLoc.getSurname() + " hoş geldiniz.");
                    System.out.println("1-Para çekme");
                    System.out.println("2-Para yatırma");
                    System.out.println("3-Hesap görüntüleme");
                    System.out.println("4-Hesap görüntüleme");
                    System.out.println("5-Çıkış");
                    System.out.println("seçiminiz : ");
                    int nextIntLoc = scannerLoc.nextInt();
                    switch (nextIntLoc) {
                        case 1: {
                            System.out.println("Çekeceğiniz miktar : ");
                            int withdrawLoc = scannerLoc.nextInt();
                            int amountLoc = customerLoc.getAmount();
                            customerLoc.setAmount(amountLoc - withdrawLoc);
                            break;
                        }
                        case 2: {
                            System.out.println("Yatıracağınız miktar : ");
                            int depositLoc = scannerLoc.nextInt();
                            int amountLoc = customerLoc.getAmount();
                            customerLoc.setAmount(amountLoc + depositLoc);
                            break;
                        }
                        case 3: {
                            System.out.println("Hesabınızda : " + customerLoc.getAmount() + " TL var.");
                            break;
                        }
                        case 4: {
                            System.out.println("Havale edeceğiniz miktar : ");
                            int withdrawLoc = scannerLoc.nextInt();
                            int amountLoc = customerLoc.getAmount();
                            customerLoc.setAmount(amountLoc - withdrawLoc);
                            break;
                        }
                        default:
                            break menu;
                    }
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

}
