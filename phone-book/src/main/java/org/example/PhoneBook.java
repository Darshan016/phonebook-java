package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String,Contact> phoneBook;

    public PhoneBook(){
        phoneBook=new HashMap<>();
    }

    public void addcontact(String name, String phoneNumber){
       Contact contact=new Contact(name,phoneNumber);
       phoneBook.put(name,contact);
    }

    public Contact searchContact(String name){
        return phoneBook.get(name);
    }

    public void removeContact(String name){
        phoneBook.remove(name);
    }

    public void displaycontacts(){
        for(Contact contact:phoneBook.values()){
            System.out.println(contact.getName()+": "+contact.getPhoneNumber());
        }
    }
}
