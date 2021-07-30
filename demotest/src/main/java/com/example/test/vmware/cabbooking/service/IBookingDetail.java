package com.example.test.vmware.cabbooking.service;

import com.example.test.vmware.cabbooking.entity.request.CabAttachment;
import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.response.CabAttachmentResponse;
import com.example.test.vmware.cabbooking.entity.response.CabBookingResponse;

public interface IBookingDetail {


    CabBookingResponse bookCab(CabBooking bookingRequest);
}
