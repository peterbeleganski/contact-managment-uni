package com.contact.managment.university.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContactDto {

    private String name;

    private String phoneNumber;

    private LocalDateTime dateCreated;

}
