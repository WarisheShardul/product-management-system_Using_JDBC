package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.CustomerClass1;
import com.product.dto.CustomerDto;

public class CustomerDao1 {
	 CustomerClass1 customerClass1=new CustomerClass1();
     Connection connection=null;
     
// TO SAVE THE DATA     
     public CustomerDto saveCustomer(CustomerDto customer) {
    	 
    	 Connection connection = null;
		try {
			connection = customerClass1.getconnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 String sql="INSERT INTO customer VALUES(?,?,?)";
    	 
    	 
    	 try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getAddress());
			
			preparedStatement.execute();
			
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	 return customer;
     }



       //TO UPDATE THE DATA
     public boolean UpdateCustomerbyId(int id, String address) {
    	 Connection connection = customerClass1.getconnection();
    	 
    	 String sql="Update customer SET address=? WHERE Id=?";
    	 int i=0;
    	 
    	 try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
		    preparedStatement.setString(1,address);
			preparedStatement.setInt(2, id);
			i=preparedStatement.executeUpdate();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	 if(i>0) {
    		 return true;
    	 }else {
    		 return false;
    	 }
    	}

     //TO DELETE THE CUSTOMER DATA

    public boolean deleteCustomerbyId(int id) {
    Connection	connection=customerClass1.getconnection(); 
    	
    	String sql="DELETE FROM customer WHERE Id=?";
    	int i=0;
    	try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			i=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally {
    		try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	if(i>0) {
   		 return true;
   	 }else {
   		 return false;
   	 }
    }
    	
    // TO GETALL CUSTOMER 
    
    	public CustomerDto getAll(CustomerDto customer) {
    		connection=customerClass1.getconnection();
    		String sql="SELECT * FROM customer";
    		
    		try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next()){
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println("----//----");
					
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    		return customer;
    	}
    	

}
