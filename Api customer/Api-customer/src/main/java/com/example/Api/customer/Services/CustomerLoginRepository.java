package com.example.Api.customer.Services;
import org.springframework.data.repository.CrudRepository;

import com.example.Api.customer.Entity.CustomerLogin;

public interface CustomerLoginRepository extends CrudRepository<CustomerLogin,Integer>{

    public CustomerLogin findByEmail(String email);


}
