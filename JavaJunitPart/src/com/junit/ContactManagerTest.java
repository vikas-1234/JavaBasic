package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactManagerTest {

	@Test
	@DisplayName("Should Create Contact")
	public void shouldCreateContact() {
		ContactManager contactManager=new ContactManager();
		contactManager.addContact("Vikas","Pandey", "9619582988");
		assertFalse(contactManager.getAllContacts().isEmpty());
		assertEquals(1, contactManager.getAllContacts().size());
		}

}
