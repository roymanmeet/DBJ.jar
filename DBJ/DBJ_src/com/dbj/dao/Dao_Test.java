package com.dbj.dao;


import java.sql.Connection;
import java.sql.SQLException;

import com.dbj.connection.Connect;

class Dao_Test {
	
	public static void main(String args[]){
	
		try {
			Connection con=(Connection) Connect.dbcon("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/resell","root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	
	
	}
		
	}