package com.example.Api.customer.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Customer_Login")
public class CustomerLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Email is Mandatory!")
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank(message = "password is Mandatory!")
    @Size(min = 3, max = 10, message = "Length of password must inbetween 3 and 10")
    private String password;
    private String role;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customerLogin")
    @JsonBackReference
    private CustomerProfile customer;

    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;

    }
}
