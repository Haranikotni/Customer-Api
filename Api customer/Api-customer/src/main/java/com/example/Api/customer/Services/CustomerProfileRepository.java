package com.example.Api.customer.Services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.example.Api.customer.Entity.CustomerProfile;

@EnableJpaRepositories
public interface CustomerProfileRepository extends CrudRepository<CustomerProfile,Integer>
{
    @Query("select u from CustomerProfile u")
    public List<CustomerProfile> getAllCustomers();

    public CustomerProfile findByUsername(String username);


    CustomerProfile findByCpid(Integer id);
}
