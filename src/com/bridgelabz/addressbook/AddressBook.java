package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        System.out.println("\nContacts in Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}
