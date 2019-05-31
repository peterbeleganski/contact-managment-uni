package com.contact.managment.university.service;

import com.contact.managment.university.model.Contact;
import com.contact.managment.university.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ContactService {

    private final ContactRepository contactRepository;

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(String id) {
        contactRepository.deleteById(id);
    }

    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    public Contact getById(String id) throws Exception {
        return contactRepository.findById(id).orElseThrow(Exception::new);
    }

}
