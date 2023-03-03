package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* here we are creating method to add ,display,delete,search,update and inside we can give Query*/


public class Hotel {
	private static Scanner scan =new Scanner(System.in);
	public void toAdd(Connection connection) throws SQLException {
		PreparedStatement addAll=connection.prepareStatement("INSERT INTO hotel values(?,?,?,?,?,?)");
		System.out.println("Enter the restaturant id: ");
		addAll.setInt(1,scan.nextInt());
		System.out.println("Enter the restaturant Name: ");
		addAll.setString(2,scan.next());
		System.out.println("Enter the owner name: ");
		addAll.setString(3, scan.next());
		System.out.println("Enter the location: ");
		addAll.setString(4, scan.next());
		System.out.println("Enter the rating: ");
		addAll.setFloat(5, scan.nextFloat());
		System.out.println("Enter the foodType: ");
		addAll.setString(6, scan.next());
		int insertValues=addAll.executeUpdate();
		System.out.println(insertValues+" inserted values");
		}
	
	public void toDisplayAll(Connection connection) throws SQLException,Exception {
		Statement inputDisplay=connection.createStatement();
		ResultSet view=inputDisplay.executeQuery("SELECT * FROM hotel");
		while(view.next()) {
			System.out.println("restaturant id= "+view.getInt(1)+", restaturant name= "+view.getString(2)+", Owner name= "+view.getString(3)+", Location= "+view.getString(4)+", Rating= "+view.getFloat(5)+", Food type= "+view.getString(6));	
		}

	}
	public void toDisplayById(Connection connection) throws SQLException {
		PreparedStatement displayId = connection.prepareStatement("SELECT * FROM hotel WHERE restaturantId = ?");
		System.out.println("Enter the restaurant id to Display");
		int id = scan.nextInt();
		displayId.setInt(1,id);
		ResultSet view = displayId.executeQuery();
		while(view.next()) {
			System.out.println("restaturant ID= "+view.getInt(1)+", restaturant name= "+view.getString(2)+", Owner name= "+view.getString(3)+", Location= "+view.getString(4)+", Rating= "+view.getFloat(5)+", Food type= "+view.getString(6));
		}
	}
	public void toDeleteById(Connection connection) throws SQLException {
		PreparedStatement delete = connection.prepareStatement("DELETE FROM hotel WHERE restaturantId= ?");
		System.out.println("Enter the restaurant id to Delete");
		int id = scan.nextInt();
		delete.setInt(1,id);
		int deleteValue = delete.executeUpdate();
		System.out.println(deleteValue + "record deleted");
	}
	public void toUpdateById(Connection connection) throws SQLException,Exception {
		         //recrdnum
				//what are the fields valules
				//set to pstmt 
				//execute --> executeUpdate --> 
				PreparedStatement update=connection.prepareStatement("Update hotel set foodType=? where restaturantId= ?");
				System.out.println("Enter the hotel Id: ");
				update.setInt(2, scan.nextInt());
				System.out.println("Enter the food type: ");
				update.setString(1, scan.next());
				int updateValues=update.executeUpdate();
				System.out.println(updateValues+" record updated successfully");
				
			}




	

}