package com.example.test.vmware.cabbooking.service;

import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.DriverOnBoardingResponse;

public interface IDriverDetail {
    DriverOnBoardingResponse onBoardDriver(DriverOnBoarding driverDetail);
}
