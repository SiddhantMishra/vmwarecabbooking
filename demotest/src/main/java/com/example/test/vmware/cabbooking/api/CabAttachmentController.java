package com.example.test.vmware.cabbooking.api;


import com.example.test.vmware.cabbooking.entity.request.CabAttachment;
import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.request.DriverOnBoarding;
import com.example.test.vmware.cabbooking.entity.response.CabAttachmentResponse;
import com.example.test.vmware.cabbooking.service.ICabDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab")
public class CabAttachmentController {

    @Autowired
    ICabDetail cabAttachment;

    @GetMapping("/attach")
    public ResponseEntity<CabAttachmentResponse> registerCab(@RequestBody CabAttachment cab)
    {
        //find details of user

        CabAttachmentResponse cabAttachmentResponse=cabAttachment.addCab(cab);
        return ResponseEntity.ok().body(cabAttachmentResponse);
    }
}
