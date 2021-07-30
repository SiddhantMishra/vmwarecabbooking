package com.example.test.vmware.cabbooking.api;

import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.CabBookingResponse;
import com.example.test.vmware.cabbooking.service.IBookingDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class CabBookingController {


    @Autowired
    IBookingDetail cabBokingDetail;

    @GetMapping("/book")
    public ResponseEntity<CabBookingResponse> placeOrder(@RequestBody CabBooking cabBookingRequest)
    {
        //find details of user

        CabBookingResponse bookingResponse=cabBokingDetail.bookCab(cabBookingRequest);
        return ResponseEntity.ok().body(bookingResponse);
    }

}
