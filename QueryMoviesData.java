package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class QueryMoviesData {
	 static final String DB_URL = "jdbc:mysql://localhost/moviedb";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String QUERY1 = "SELECT * FROM movies";
	   static final String name="Salman Khan";
	   static final String QUERY2 = "SELECT * FROM movies where actor='"+name+"'";

	   public static void main(String[] args) {

	      try{
	    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY1);
	         System.out.println("Without Parameters:");     
	         while(rs.next()){
	            //Display values
	            System.out.print("Movie Name: " + rs.getString("Name"));
	            System.out.print(", Actor: " + rs.getString("Actor"));
	            System.out.print(", Actress: " + rs.getString("Actress"));
	            System.out.print(", Director: " + rs.getString("Director"));
	            System.out.println(", Year of Release: " + rs.getInt("year_of_release"));
	            
	         }
	         ResultSet rs1 = stmt.executeQuery(QUERY2);
	         System.out.println("With Parameters:");     
	         while(rs1.next()){
	            //Display values
	            System.out.print("Movie Name: " + rs1.getString("Name"));
	            System.out.print(", Actor: " + rs1.getString("Actor"));
	            System.out.print(", Actress: " + rs1.getString("Actress"));
	            System.out.print(", Director: " + rs1.getString("Director"));
	            System.out.println(", Year of Release: " + rs1.getInt("year_of_release"));
	            
	         }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
