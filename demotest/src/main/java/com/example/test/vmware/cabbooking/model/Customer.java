package com.example.test.vmware.cabbooking.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customerdata")
@Data
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="customername")
    private String customername;
    @Column(name="phonenumber")
    private String phonenumber;
    @Column(name="location")
    private String location;




}