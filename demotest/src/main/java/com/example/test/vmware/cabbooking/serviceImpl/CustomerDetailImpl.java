package com.example.test.vmware.cabbooking.serviceImpl;

import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.CustomerOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.CustomerOnBoardingResponse;
import com.example.test.vmware.cabbooking.model.Customer;
import com.example.test.vmware.cabbooking.repositories.ICabDetailsRepository;
import com.example.test.vmware.cabbooking.service.ICustomerDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import com.example.test.vmware.cabbooking.util.CustomerDetailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailImpl implements ICustomerDetail {

    @Override
    public CustomerOnBoardingResponse registerCustomer(CustomerOnBoarding userId) {
        return null;
    }
}
