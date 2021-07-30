package com.example.test.vmware.cabbooking.repositories;

import com.example.test.vmware.cabbooking.model.Booking;
import com.example.test.vmware.cabbooking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICabBookingDetailsRepository extends JpaRepository<Booking, String> {

    Booking findAddressDataByFirstName(String userId);
}
