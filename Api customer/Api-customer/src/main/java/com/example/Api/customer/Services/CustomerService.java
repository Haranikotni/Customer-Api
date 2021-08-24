package com.example.Api.customer.Services;

import java.util.List;

import com.example.Api.customer.Entity.CustomerLogin;
import com.example.Api.customer.Entity.CustomerProfile;

public interface CustomerService {
    CustomerProfile createCustomer(CustomerProfile customer);
    List<CustomerProfile> getCustomers();
    void deleteCustomer(Integer id);
    CustomerProfile getCustomerById(Integer id);
    CustomerProfile LoginCustomer(String email, String password);
    CustomerLogin getCustomerByemail(String email);
    
}
