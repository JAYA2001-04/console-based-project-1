package ConsoleBasedproject;
//In this program we acting has a Restaurant management(eg:Swiggy)to add restaurant details.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	/*to hide the details we use private attributes
	 * resName
	 * resId
	 * resownerName
	 * location
	 * rating
	 * veg_nonVeg
	 */
	private String resName;
	private int resId;
	private String resOwnername;
	private float rating;
	private String location;
	private String veg_nonveg;
	private static Scanner scan = new Scanner(System.in);
	/*we create list to add restaurant details
	 * ArrayList implements list interface
	 * methods-->add,remove,set,get
	 */
	List<Hotel> restaurant = new ArrayList<Hotel>();
	/*Hotel()-->no parameter constructor is defined--->to display the details to the user
	 * Hotel(resname,resownername,resId,location,rating,veg_nonveg)-->parameterized constructor is defined
	 * 
	 * this keyword-->if the attributes and parameter names are same we use this keyword
	 * we can access attributes with in the class
	 */
	public Hotel() {
		System.out.println("1.Add the Restaurant ");
		System.out.println("2.Display all the Restaurant ");
		System.out.println("3.Delete the Restaurant ");
		System.out.println("4.Search the Restaurant");
		System.out.println("5.Update the Restaurant name");
		
	}
	public Hotel(String resName,int resId,String resOwnername,float rating,String location,String veg_nonveg){
		this.resName= resName;
		this.resId =resId ;
		this.resOwnername = resOwnername;
		this.rating = rating;
		this.location = location;
		this.veg_nonveg = veg_nonveg;
	}
	// Here we use encapsulation methods to set the input we use setter and getter to get the input
	public String getresName() {
		return resName;
	}
	public void setresName(String resName) {//to set the input
		this.resName = resName;
	}
	
	public int getresId() {//to get the the output from setter
		return resId;
	}
	public void setresId(int resId) {
		this.resId = resId;
	}
	public String getresOwnername() {
		return resOwnername;
	}
	public void setresownername(String resOwnername) {
		this.resOwnername = resOwnername;
	}
    
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getVeg_nonveg() {
		return veg_nonveg;
	}
	public void setVeg_nonveg(String veg_nonveg) {
		this.veg_nonveg = veg_nonveg;
	}
	//@override
	public String toString() {
		return resName + " "+ resId +" "+ resOwnername+" "+rating+" "+location+" "+veg_nonveg;
    }
	/*add all the restaurant details in this method
	 *listname.add(new classname(parameters))
	 */
	public void insert() {
		System.out.println("insert the restaurant details");
		System.out.print("Enter the restaurant name ");
		String resname = scan.next();
		System.out.print("Enter the Restaurant Id ");
		int resId = scan.nextInt();
		System.out.print("Enter the Restaurant Owner name ");
		String resOwnername = scan.next();
		System.out.print("Enter the Restaurant rating ");
		float rating = scan.nextFloat();
		System.out.print("Enter the Restaurant location ");
		String location = scan.next();
		System.out.print("Enter the Restaurant veg or nonveg ");
		String veg_nonveg = scan.next();
		restaurant.add(new Hotel(resname,resId,resOwnername,rating,location,veg_nonveg));
		System.out.println("Restaurant deatils are added");
	}
	//Here we display the inserted restaurant details by using iterator 
	public void display() {
		System.out.println("Display the restaurant details");
		Iterator<Hotel> restaurantlist = restaurant.iterator();
		while(restaurantlist.hasNext()) {
			System.out.println(restaurantlist.next());
		}
		//System.out.println(resList);
	}
	/*here we take unique id number to remove the hotel details
	 *if the id is not their it will print "Hotel is not found"
	 *if id is found --> remove the hotel details
	 */
	public void remove(Hotel obj) {
		System.out.println("Delete the details");
		boolean flag = false;
		System.out.println("enter the Hotel Id to delete");
		int delId = scan.nextInt();
		Iterator<Hotel> restaurantlist1 = restaurant.iterator();
		while(restaurantlist1.hasNext()) {
			obj = restaurantlist1.next();//current element store in obj
			if(obj.getresId()==delId) {
				flag = true;
				restaurant.remove(obj);
				System.out.println("Deleted Successfully");
				break;
			}
		}
		if(flag == false) {
			System.out.println("Restaurant Id is not found");
		}
	}
	/*search the hotel using id number
	if the id is not their it will print -->hotel is not found
	if id is found-->it display the details searched details
	 */
	public void search(Hotel obj) {
		System.out.println("Search the Restaurant details");
		boolean flag1 = false;
		System.out.println("enter the Hotel Id to Search");
		int foundId = scan.nextInt();
		Iterator<Hotel> restaurantlist2 = restaurant.iterator();
		while(restaurantlist2.hasNext()) {
			obj = restaurantlist2.next();
			if(obj.getresId()==foundId) {
				flag1 = true;
				System.out.println("Found Successfully");
				break;
			}
		}
		if(flag1 == false) {
			System.out.println("Restaurant Id is not found");
		}
	}
	//to update the details using id
	//which index you want set ctr value,add the details
	public void update(Hotel obj) {
		System.out.println("update the restaurant details");
		boolean flag2 = false;
		System.out.println("Enter the restaurant no to update");
		int updateId = scan.nextInt();
		Iterator<Hotel> restaurantlist3 = restaurant.iterator();
		int ctr = -1;
		while(restaurantlist3.hasNext()) {
			ctr++;
			obj = restaurantlist3.next();//it has all details
			if(obj.getresId() == updateId) {
				flag2 = true;
				System.out.println("Enter the restaurant name");
				String resname = scan.next();
				System.out.println("Enter the Restaurant id");
			    int resId=scan.nextInt();
				System.out.println("Enter the Restaurant ownername ");
				String resOwnername=scan.next();
				System.out.println("Enter the Restaurant rating");
				float rating=scan.nextFloat();
				System.out.println("Enter the Restaurant location");
				String location = scan.next();
				System.out.println("Enter the Restaurant veg or nonveg");
				String veg_nonveg = scan.next();
				restaurant.set(ctr,new Hotel(resname,resId,resOwnername,rating,location,veg_nonveg));
				break;
			}
		}
		if(flag2 == false) {
			System.out.println("not updated");
		}
	}
}
