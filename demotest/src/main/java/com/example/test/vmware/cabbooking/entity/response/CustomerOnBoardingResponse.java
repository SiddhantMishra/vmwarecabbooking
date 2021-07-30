package com.example.test.vmware.cabbooking.entity.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Data
public class CustomerOnBoardingResponse implements Serializable {

    private String customerId;
    private String customerPhoneNumber;
    private String location;
    private String name;
}
