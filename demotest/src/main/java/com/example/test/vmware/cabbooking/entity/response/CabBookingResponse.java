package com.example.test.vmware.cabbooking.entity.response;


import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class CabBookingResponse implements Serializable {

    private int cabId;
    private int customerId;
    private int xSourceLocation;
    private int ySourceLocation;
    private int xDestinationLocation;
    private int yDestinationLocation;
    private CabType cabType;
    private int noOfSeatsAvailable;
    private String registrationNumber;
    private String driverName;
    private String driverPhoneNumber;


}
