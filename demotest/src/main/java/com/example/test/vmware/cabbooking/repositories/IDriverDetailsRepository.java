package com.example.test.vmware.cabbooking.repositories;

import com.example.test.vmware.cabbooking.model.Customer;
import com.example.test.vmware.cabbooking.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverDetailsRepository extends JpaRepository<Driver, String> {

    Driver findAddressDataByFirstName(String userId);
}
