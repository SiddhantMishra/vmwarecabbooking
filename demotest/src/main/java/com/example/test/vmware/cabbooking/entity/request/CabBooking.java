package com.example.test.vmware.cabbooking.entity.request;


import com.example.test.vmware.cabbooking.entity.CabType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
public class CabBooking implements Serializable {

    private int customerPhoneNumber;
    private int xSourceLocation;
    private int ySourceLocation;
    private int xDestinationLocation;
    private int yDestinationLocation;
    private CabType cabType;
    private int noOfPassenger;


}
