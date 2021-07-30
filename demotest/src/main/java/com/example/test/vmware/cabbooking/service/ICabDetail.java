package com.example.test.vmware.cabbooking.service;

import com.example.test.vmware.cabbooking.entity.request.CabAttachment;
import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.response.CabAttachmentResponse;

public interface ICabDetail {

    public CabAttachmentResponse addCab(CabAttachment cab);
}
