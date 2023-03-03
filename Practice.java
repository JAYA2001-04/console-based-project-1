package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Practice {
	private static Scanner scan=new Scanner(System.in);
/*
 * 1.load the driver
 * 2.register the driver mysql
 * 3.create the connection
 * 4.create statement
 * 5.excecute querry and get the result set
 * 6.close connection
 * */
	
	public static Connection toConnectDb() throws SQLException {
		Connection connection= null;
		try {
			String userName = "root";
			String password = "Jaya@0123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",userName,password);
			Statement line=connection.createStatement();

		}
		catch(Exception expObj) {
			System.out.println(expObj);
		}
		return connection;
	}
	public static void toAccessData() throws SQLException,Exception {

		Connection connection =toConnectDb();
		Hotel mObj=new Hotel();
		Scanner scan=new Scanner(System.in);
		System.out.println("    **SWIGGY**  ");
		System.out.println("1.Add the restaurants");
		System.out.println("2.View the hotel");
		System.out.println("3.Search the restaurants");      
		System.out.println("4.Remove the hotel");
		System.out.println("5.Update the menu list");	
		int choice;
		do {
			choice=scan.nextInt();
			switch(choice) {

			case 1:
				System.out.println("    Insert Restaurant details  ");
				mObj.toAdd(connection);
				break;
			case 2:
				System.out.println("    Display restaurant details");
				mObj.toDisplayAll(connection);
				break;
			case 3:
				System.out.println("    Find Restaurant using HotelNum");
				mObj.toDisplayById(connection);
				break;
			case 4:
				System.out.println("    Delete the restaurant using HotelNum");
				mObj.toDeleteById(connection);
				break;
			case 5:
				System.out.println("    Update the restaurant using HotelNum");
				mObj.toUpdateById(connection);
				break;
			case 6:
				Jdbc.toCallLogout();
				break;
			case 7:
				break;
			}
		}while(choice!=7);
		connection.close();
	}//main method it is used  calling the login and log out method
	public static void main(String[] args) throws Exception, SQLException {
		System.out.println("Enter the username:");
		String userName=scan.next();
		System.out.println("Enter the password: ");
		String password=scan.next();
		Jdbc.toCheckLogin(userName, password);


	}






}