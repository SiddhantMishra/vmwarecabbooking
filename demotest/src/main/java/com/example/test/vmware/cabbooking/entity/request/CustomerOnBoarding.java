package com.example.test.vmware.cabbooking.entity.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Data
public class CustomerOnBoarding implements Serializable {

    private String customerPhoneNumber;
    private String location;
    private String name;
}
