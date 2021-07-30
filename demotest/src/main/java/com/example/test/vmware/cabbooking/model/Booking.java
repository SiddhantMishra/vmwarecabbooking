package com.example.test.vmware.cabbooking.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bookedorderdata")
@Data
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;



}