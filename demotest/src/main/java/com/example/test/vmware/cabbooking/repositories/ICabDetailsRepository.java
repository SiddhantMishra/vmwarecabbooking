package com.example.test.vmware.cabbooking.repositories;

import com.example.test.vmware.cabbooking.model.Cab;
import com.example.test.vmware.cabbooking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICabDetailsRepository extends JpaRepository<Cab, String> {

    Cab findCabByRegistrationnumber(String regNum);

}
