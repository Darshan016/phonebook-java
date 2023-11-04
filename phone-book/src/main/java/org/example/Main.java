package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("menu");
            System.out.println("1. add contact");
            System.out.println("2. remove contact");
            System.out.println("3. display contacts");
            System.out.println("4. search contacts");
            System.out.println("5. exit");

            System.out.println("enter ur choice");
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("enter contact name");
                    String name=scanner.nextLine();
                    System.out.println("enter phonenumber");
                    String pn=scanner.nextLine();
                    phoneBook.addcontact(name,pn);
                    System.out.println("contact added successfully");
                    break;
                case "2":
                    System.out.println("available contacte");
                    phoneBook.displaycontacts();
                    System.out.println("---------------------");
                    System.out.println("enter contact name to remove");
                    String nameToDelete = scanner.nextLine();
                    phoneBook.removeContact(nameToDelete);
                    System.out.println("deleted successfully");
                    System.out.println("available contacts");
                    phoneBook.displaycontacts();
                    System.out.println("--------------------");
                    break;
                case "3":
                    System.out.println("your contacts");
                    phoneBook.displaycontacts();
                    System.out.println("----------------------");
                    break;
                case "4":
//                    phoneBook.displaycontacts();
                    System.out.println("-------------------");
                    System.out.println("enter contact name to get details");
                    String nameToSearch=scanner.nextLine();
                    Contact contact=phoneBook.searchContact(nameToSearch);
                    phoneBook.searchContact(nameToSearch);
                    if(contact!=null){
                        System.out.println("name: "+contact.getName()+" phone number: "+contact.getPhoneNumber());
                        System.out.println("-------------------------------------------------");
                    }else{
                        System.out.println("contact not found");
                    }
                    break;
                case "5":
                    System.out.println("goodbye");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("invalid operation");
            }
        }
    }
}