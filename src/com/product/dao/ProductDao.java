package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.ProductClass;
import com.product.dto.ProductDto;

public class ProductDao {
	ProductClass productClass=new ProductClass();
	Connection connection=null;
	
//	TO SAVE THE DATA
	public ProductDto saveProduct(ProductDto product) {
		
		Connection connection=productClass.getconnection();
		String sql="INSERT INTO product VALUES(?,?,?)";
		
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setInt(3, product.getPrice());
			
			preparedStatement.execute();
			
			
	        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
		
	}
	
	
//	TO UPDATE THE DATA
	
	public boolean UpdateProductbyId(int id,String name) {
		Connection connection=productClass.getconnection();
		
		String sql="Update product SET name=? WHERE id=?";
		int i=0;
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, name);
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
	
//	TO DELETE THE PRODUCT DATA
	
	public boolean deleteProductbyId(int id) {
		Connection connection=productClass.getconnection();
		
		String sql="DELETE FROM product WHERE Id=?";
		int i=0;
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
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
	
//	TO GETALL PRODUCT
	
	public ProductDto getAll(ProductDto product) {
		connection=productClass.getconnection();
		String sql="SELECT * FROM product";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(3));
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
		return product;
	}
}
