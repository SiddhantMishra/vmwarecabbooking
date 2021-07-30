package com.example.test.vmware.cabbooking.entity.response;

import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Data

public class DriverOnBoardingResponse implements Serializable {

    private String driverId;
    private String registrationNumber;
    private String driverName;
    private String driverPhoneNumber;
    private CabType cabType;
    private int passengerCapacity;
    private String location;
    private double experience;
}
