package com.example.test.vmware.cabbooking.serviceImpl;

import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.DriverOnBoardingResponse;
import com.example.test.vmware.cabbooking.model.Customer;
import com.example.test.vmware.cabbooking.repositories.ICabDetailsRepository;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import com.example.test.vmware.cabbooking.util.CustomerDetailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverDetailImpl implements IDriverDetail {


    @Override
    public DriverOnBoardingResponse onBoardDriver(DriverOnBoarding driverDetail) {
        return null;
    }
}
