/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author aditya
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db 
{
	static Connection con = null;
	public static Connection getConnection() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?verifyServerCertificate=false&useSSL=true", "root", "1510");
			
		} 
		catch (SQLException e) 
		{
				e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
				e.printStackTrace();
		}

		return con;
	}
	
	public static void closeConnection()
	{
		try 
		{
			con.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
