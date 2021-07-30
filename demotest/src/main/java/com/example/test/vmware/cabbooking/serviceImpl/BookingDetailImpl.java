package com.example.test.vmware.cabbooking.serviceImpl;

import com.example.test.vmware.cabbooking.entity.request.CabAttachment;
import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.response.CabAttachmentResponse;
import com.example.test.vmware.cabbooking.entity.response.CabBookingResponse;
import com.example.test.vmware.cabbooking.model.Customer;
import com.example.test.vmware.cabbooking.repositories.ICabDetailsRepository;
import com.example.test.vmware.cabbooking.service.IBookingDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import com.example.test.vmware.cabbooking.util.CustomerDetailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDetailImpl implements IBookingDetail {

    @Override
    public CabBookingResponse bookCab(CabBooking bookingRequest) {
        return null;
    }
}
