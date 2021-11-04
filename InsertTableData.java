package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTableData {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/MovieDB";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {
	      
	      try{
	    	  
	    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      		      
	         String sql = "insert into  Movies (name , actor , actress , director , year_of_release) values"
	         		+ "('Rab Ne Bana Di Jodi','Shah Rukh Khan', 'Anushka Sharma','Aditya Chopra',2008),"
	         		+ "('Jab Tak Hai Jaan','Shah Rukh Khan', 'Anushka Sharma','Yash Chopra',2012),"
	         		+ "('Jab Harry Met Sejal','Shah Rukh Khan', 'Anushka Sharma','Imtiaz Ali',2017),"
	         		+ "('Sultan','Salman Khan', 'Anushka Sharma','Ali Abbas Zafar',2016)";
	         stmt.executeUpdate(sql);
	         System.out.println("Data Inserted successfully...");   	  
	      } catch (Exception e) {
	         e.printStackTrace();
	      } 
	   }

}
