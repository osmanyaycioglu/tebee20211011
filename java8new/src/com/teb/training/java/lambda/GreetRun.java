package com.teb.training.java.lambda;

import java.util.Scanner;

import com.teb.training.java.Person;

public class GreetRun {

    public static void main(final String[] args) {
        String stringLoc = "test";
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);
        personLoc.setWeight(95);

        try (Scanner scannerLoc = new Scanner(System.in)) {
            IGreet greetLoc = null;
            System.out.println("1-English");
            System.out.println("2-Turkish");
            System.out.println("choose:");
            int consoleInputLoc = scannerLoc.nextInt();
            switch (consoleInputLoc) {
                case 1:
                    greetLoc = new IGreet() {

                        @Override
                        public String greet(final Person personParam) {
                            personLoc.setName("ali");
                            System.out.println("ENG : " + stringLoc);
                            return "Hello " + personParam.getName() + " " + personParam.getSurname();
                        }
                    };
                    break;
                case 2:
                    greetLoc = new IGreet() {

                        @Override
                        public String greet(final Person personParam) {
                            personLoc.setName("ali");
                            System.out.println("TR : " + stringLoc);
                            return "Merhaba " + personParam.getName() + " " + personParam.getSurname();
                        }
                    };
                    break;
                default:
                    return;
            }
            String greetStrLoc = greetLoc.greet(personLoc);
            System.out.println(greetStrLoc);
        } catch (IllegalArgumentException | NullPointerException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }


        //        try (Scanner scannerLoc = new Scanner(System.in)) {
        //            IGreet greetLoc = null;
        //            System.out.println("1-English");
        //            System.out.println("2-Turkish");
        //            System.out.println("choose:");
        //            int consoleInputLoc = scannerLoc.nextInt();
        //            switch (consoleInputLoc) {
        //                case 1:
        //                    greetLoc = new GreetENG();
        //                    break;
        //                case 2:
        //                    greetLoc = new GreetTR();
        //                    break;
        //                default:
        //                    return;
        //            }
        //            String greetStrLoc = greetLoc.greet(personLoc);
        //            System.out.println(greetStrLoc);
        //        } catch (IllegalArgumentException | NullPointerException eLoc) {
        //            eLoc.printStackTrace();
        //        } catch (Exception eLoc) {
        //            eLoc.printStackTrace();
        //        }

        //        IGreet greetLoc = null;
        //        Scanner scannerLoc = null;
        //        try {
        //            scannerLoc = new Scanner(System.in);
        //            System.out.println("1-English");
        //            System.out.println("2-Turkish");
        //            System.out.println("choose:");
        //            int consoleInputLoc = scannerLoc.nextInt();
        //            switch (consoleInputLoc) {
        //                case 1:
        //                    greetLoc = new GreetENG();
        //                    break;
        //                case 2:
        //                    greetLoc = new GreetTR();
        //                    break;
        //                default:
        //                    return;
        //            }
        //            String greetStrLoc = greetLoc.greet(personLoc);
        //            System.out.println(greetStrLoc);
        //        } catch (Exception eLoc) {
        //            eLoc.printStackTrace();
        //        } finally {
        //            if (scannerLoc != null) {
        //                scannerLoc.close();
        //            }
        //        }

    }
}
