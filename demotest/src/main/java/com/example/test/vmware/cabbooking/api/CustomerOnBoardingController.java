package com.example.test.vmware.cabbooking.api;


import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.CustomerOnBoarding;
import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.CustomerOnBoardingResponse;
import com.example.test.vmware.cabbooking.service.ICustomerDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerOnBoardingController {

    @Autowired
    ICustomerDetail customerRegistration;

    @GetMapping("/register")
    public ResponseEntity<CustomerOnBoardingResponse> registerCustomer(@RequestBody CustomerOnBoarding customer)
    {
        //find details of user

        CustomerOnBoardingResponse customerReg=customerRegistration.registerCustomer(customer);
        return ResponseEntity.ok().body(customerReg);
    }
}
