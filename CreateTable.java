package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	static final String DB_URL = "jdbc:mysql://localhost:3306/MovieDB";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {
	     
	      try{
	    	  
	    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      		      
	         String sql = "CREATE table Movies (name varchar(200) not NULL, actor varchar(100) not NULL, actress varchar(100) not NULL, director varchar(100) not NULL, year_of_release INTEGER not NULL, PRIMARY KEY ( name ))";
	         stmt.executeUpdate(sql);
	         System.out.println("Table created successfully...");   	  
	      } catch (Exception e) {
	         e.printStackTrace();
	      } 
	   }

}
