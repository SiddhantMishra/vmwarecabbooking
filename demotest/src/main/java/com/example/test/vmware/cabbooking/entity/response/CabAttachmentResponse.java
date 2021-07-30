package com.example.test.vmware.cabbooking.entity.response;

import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Data
public class CabAttachmentResponse implements Serializable {

    private int cabId;
    private String registrationNumber;
    private String driverPhoneNumber;
    private String driverName;
    private int driverId;
    private CabType cabType;
    private int passengerCapacity;


}
