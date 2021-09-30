package com.company.onlineshopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> customerList = CustomerDetails.readCustomerDetailsFromFile();
    static List<String> productList = CustomerDetails.readProductDetailsFromFile();
    static List<OrderHistory> kart = new ArrayList<>();

    public static void main(String[] args) {
        CreateObj.getCustomerObj();
        CreateObj.getProductObj();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("---------Z-kart online shopping--------");
            System.out.println("1.SignUp");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.println("Enter the choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the emailId:");
                    String email = scan.nextLine();
                    if (!AccountCreation.checkAccount(email)) {
                        System.out.println("Account already exist...please login..");
                        return;
                    }
                    System.out.println("Enter your name:");
                    String name = scan.next();
                    System.out.println("Enter the password:");
                    String password = scan.next();
                    System.out.println("Confirm password:");
                    String confirmPass = scan.next();
                    if (!password.equals(confirmPass)) {
                        System.out.println("Password not matched!!");
                        return;
                    }
                    System.out.println("Enter the mobile number:");
                    String mobile = scan.next();
                    String newPass = "";
                    for (int j = 0; j < password.length(); j++) {
                        if (password.charAt(j) != 'z' && password.charAt(j) != 'Z') {
                            newPass += (char) (((int) password.charAt(j) + 1));
                        } else if (password.charAt(j) == 'z') {
                            newPass += "a";
                        } else if (password.charAt(j) == 'Z') {
                            newPass += "A";
                        } else if (password.charAt(j) == '9') {
                        newPass+="0";
                        }
                    }
                        Customer details = new Customer();
                        details.setName(name);
                        details.setEmailId(email);
                        details.setEncryptedPwd(newPass);
                        details.setMobileNo(mobile);
                        if (AccountCreation.createAccount(email, details)) {
                            System.out.println("Account created successfully!");
                        }
                        break;
                        case 2:
                            scan.nextLine();
                            System.out.println("Enter your emailId:");
                            String emailId = scan.nextLine();
                            System.out.println("Enter the password:");
                            String pass = scan.nextLine();
                            if (Login.accountLogin(emailId, pass)) {
                                System.out.println("Logged in successfully!!");
                            } else {
                                System.out.println("Account not exist....please create the account...");
                            }
                            Shopping.shopProduct(emailId);
                            System.out.println("Enter 1 to check order history or enter 2 to exit:");
                            int option = scan.nextInt();
                            if (option == 1) {
                                PrintOrderHistory.printHistory(emailId);
                            } else if (option == 2) {
                                return;
                            } else {
                                System.out.println("Ivalid option!!");
                            }
                            break;
                    }

            }
            // System.out.println(customerList);

            //System.out.println(productList);
        }
    }

