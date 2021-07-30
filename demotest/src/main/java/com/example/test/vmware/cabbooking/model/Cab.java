package com.example.test.vmware.cabbooking.model;


import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cabdata")
@Data
public class Cab implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="drivername")
    private String drivername;
    @Column(name="driverphonenumber")
    private String driverPhoneNumber;
    @Column(name="registrationnumber")
    private String registrationnumber;
    @Column(name="cabtype")
    private String cabtype;
    @Column(name="passengercapacity")
    private int passengercapacity;

}