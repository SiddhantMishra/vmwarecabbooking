package com.example.test.vmware.cabbooking.api;


import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.DriverOnBoardingResponse;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverOnBoardingController {


    @Autowired
    IDriverDetail driverDetail;

    @PostMapping ("/register")
    public ResponseEntity<DriverOnBoardingResponse> registerDriver(@RequestBody DriverOnBoarding driver)
    {
        //find details of user

        DriverOnBoardingResponse driverResponse=driverDetail.onBoardDriver(driver);
        return ResponseEntity.ok().body(driverResponse);
    }
}
