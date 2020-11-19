package com.javatar.website.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private int id;
    @Size(min = 1, max = 50)
    private String firstname;
    @Size(min = 1, max = 50)
    private String lastname;
    @NotBlank(message = "mail not empty")
    private String mail;
    @NotBlank
    @NotBlank(message = "mail not empty")
    private String password;
}
