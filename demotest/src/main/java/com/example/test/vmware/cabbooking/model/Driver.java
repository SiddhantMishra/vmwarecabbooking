package com.example.test.vmware.cabbooking.model;


import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "driverdata")
@Data
public class Driver implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="drivername")
    private String drivername;
    @Column(name="phonenumber")
    private String phonenumber;
    @Column(name="cabtype")
    private String cabtype;
    @Column(name="passengercapacity")
    private int passengercapacity;
    @Column(name="location")
    private String location;
    @Column(name="experience")
    private double experience;




}