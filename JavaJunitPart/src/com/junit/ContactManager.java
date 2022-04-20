package com.junit;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class ContactManager {
	Map<String, Contact> contactList=new ConcurrentHashMap<String, Contact>();
	
	public void addContact(String firstName, String lastName, String phoneNumber) {
		Contact contact=new Contact(firstName, lastName, phoneNumber);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact),contact);
				
		
		
	}
	
	public Collection<Contact> getAllContacts(){
		return contactList.values();
	}

	

	private void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
		if (contactList.containsKey(generateKey(contact))) 
			throw new RuntimeException("Contact Already Exist");
		
	}

	private void validateContact(Contact contact) {
		// TODO Auto-generated method stub
		contact.validateFirstName();
		contact.validatelastName();
		contact.validatePhoneNUmber();
	}
	
	private String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
	}

}
