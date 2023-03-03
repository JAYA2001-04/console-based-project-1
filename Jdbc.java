package Jdbc;
//In this program we acting has a Restaurant management(eg:Swiggy)to add restaurant details.

import java.sql.SQLException;

public class Jdbc {
	/*to hide the details we use private attributes
	 * restaturantName
	 * restaturantId
	 * ownerName
	 * location
	 * rating
	 * food type
	 * to login we will give as name and password
	 */

	private String restaturantName;
	private String ownerName;
	private String location;
	private float rating;
	private String foodType;
	private int restaturantId;
	private static String NAME= "Jayashree";
	private static String SECRET= "Jaya@01";
	
	//attribute name is in private so we can access getter and setter method using encapsulation
	
	public String getrestaturantName() {
		return restaturantName;
	}
	public void setrestaturantName(String shopName) {
		this.restaturantName = shopName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getrestaturantId() {
		return restaturantId;
	}
	public void setrestaturantId(int hotelId) {
		this.restaturantId = hotelId;
	}
	//we have created method to login
	public static void toCheckLogin(String username, String password) throws SQLException,Exception {
		if(NAME.equals(username) && SECRET.equals(password)){
			System.out.println("Login successfully");
			Practice.toAccessData();
		}
		else {
			System.out.println("UserName or Password is incorrect");
		}
	}
	//	//we have created method to logout
	public static void toCallLogout() {
		System.out.println("Logged Out Successfully");
	}
	

}


	