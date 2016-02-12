package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	String url="jdbc:mysql://localhost:3306/";
    String Driver="com.mysql.jdbc.Driver";
    String dbname="ecommerce";
    String username="root";
    String password="";
    Connection con;
    public DBConnection() {
		try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
            con = DriverManager.getConnection(url+dbname,username,password);
        }catch(Exception e){e.printStackTrace();}  
		System.out.println("const");
	}
   

}
