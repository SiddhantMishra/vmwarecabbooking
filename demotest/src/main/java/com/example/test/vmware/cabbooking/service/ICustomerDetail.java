package com.example.test.vmware.cabbooking.service;

import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.CustomerOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.CustomerOnBoardingResponse;

public interface ICustomerDetail {
    CustomerOnBoardingResponse registerCustomer(CustomerOnBoarding userId);
}
