package com.contact.managment.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    private String id;

    private String name;

    private String phoneNumber;

    private LocalDateTime dateCreated = LocalDateTime.now();

}
