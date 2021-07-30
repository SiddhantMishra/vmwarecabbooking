package com.example.test.vmware.cabbooking.entity.request;

import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;



@Getter
@Setter
@Data
public class CabAttachment implements Serializable {

    private String registrationNumber;
    private CabType cabType;
    private int passengerCapacity;
    private String driverName;
    private String driverPhoneNumber;



}
