package com.product.service;

import com.product.dao.CustomerDao1;
import com.product.dto.CustomerDto;

public class CustomerService {
    CustomerDao1 customerDao=new CustomerDao1();
    
    
    public CustomerDto saveCustomer(CustomerDto customer) {
    	return customerDao.saveCustomer(customer);
    	
    }
    
    public boolean UpdateCustomerbyId(int id, String address) {
		return customerDao.UpdateCustomerbyId(id, address);
		
    }
    
    public boolean deleteCustomerbyId(int id) {
    	return customerDao.deleteCustomerbyId(id);
    	
    }
    
    public CustomerDto getAll(CustomerDto i) {
    	return customerDao.getAll(i);
    }
    public void getAll(int i) {
   //    	TODO Auto-generated method stub
    }
}
