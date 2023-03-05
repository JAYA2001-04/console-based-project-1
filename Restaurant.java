package ConsoleBasedproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Restaurant {
	public static void main(String args[]) {
		//we create object to hotel class
		Hotel obj = new Hotel();
		Scanner scan = new Scanner(System.in);
		//in this cases we call the methods from hotel class using object
		int inputchoice;
		do {//int inputchoice; it gives error in while condition
            inputchoice = scan.nextInt();
			switch(inputchoice) {
			case 1:
				obj.insert();
				break;

			case 2:                //display the inserted details
				obj.display();
				break;

			case 3:
				obj.remove(obj);     //remove the particular restaurant details by using an unique id
				break;

			case 4:
				obj.search(obj);
				break;

			case 5:
				obj.update(obj);
				break;

			case 6:
				System.out.println("the number is not found chose 1 to 6");
				break;

			}
		}
		while(inputchoice!=6);
	}
}


