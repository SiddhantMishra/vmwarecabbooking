package com.example.test.vmware.cabbooking.serviceImpl;

import com.example.test.vmware.cabbooking.entity.request.CabAttachment;
import com.example.test.vmware.cabbooking.entity.request.CabBooking;
import com.example.test.vmware.cabbooking.entity.response.CabAttachmentResponse;
import com.example.test.vmware.cabbooking.exception.CabDetailNotFoundException;
import com.example.test.vmware.cabbooking.model.Cab;
import com.example.test.vmware.cabbooking.model.Customer;
import com.example.test.vmware.cabbooking.repositories.ICabDetailsRepository;
import com.example.test.vmware.cabbooking.service.ICabDetail;
import com.example.test.vmware.cabbooking.service.IDriverDetail;
import com.example.test.vmware.cabbooking.util.CabDetailUtil;
import com.example.test.vmware.cabbooking.util.CustomerDetailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabDetailImpl implements ICabDetail {


    @Autowired
    CabDetailUtil cabUtil;

    @Autowired
    ICabDetailsRepository cabRepository;

    @Override
    public CabAttachmentResponse addCab(CabAttachment cab) {

        Cab cabDetail=cabRepository.findCabByRegistrationnumber(cab.getRegistrationNumber());
        if(cabDetail==null) //cab is already registered
        {
            //cabRepository.set
        }
        else
        {
            //cab is already registered
            throw new CabDetailNotFoundException();
        }
        //generate cab id in util class


        return null;
    }
}
