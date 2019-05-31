package com.contact.managment.university.controller;

import com.contact.managment.university.model.Contact;
import com.contact.managment.university.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    private final ModelMapper modelMapper;

    @GetMapping("/contacts")
    public List<Contact> all() {
        return contactService.getAll();
    }

    @GetMapping("/contact/{id}")
    public Contact getById(@PathVariable String id) throws Exception {
        return contactService.getById(id);
    }

}
