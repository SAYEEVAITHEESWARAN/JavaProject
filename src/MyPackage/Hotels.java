package MyPackage;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
public class Hotels extends Items {
	String[] hotels= {"Vasantha Bhavan","Saravana Bhavan","A2B","B2B","Lakshmi Bhavan"};
	public void hotel() {
		System.out.println("Hotel List:");
		for(String hotel:hotels) {
			System.out.println(hotel);
		}
		System.out.println();
		System.out.println("Item List:");
		for(String item:items) {
			System.out.println(item);
		}
	}
	
	public void getData(int price, int qty) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hotel name:");
		String hotelName=sc.nextLine();
		boolean contains=false;
		String temp;
		for(int i=0;i<hotels.length;i++) {
			temp=hotels[i];
			if(hotelName.toUpperCase().equals(temp.toUpperCase())) {
				contains=true;
			}
		}
		if(contains) {
			System.out.println("Hotel Available:"+hotelName);
			Items.item();
			Items.price();
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Pongal");
				System.out.println("Rs.75");
				
				break;
			case 2:
				System.out.println("Dosai");
				System.out.println("Rs.90");
				break;
			case 3:
				System.out.println("Idli");
				System.out.println("Rs.55");
				break;
			case 4:
				System.out.println("Parota");
				System.out.println("Rs.75");
				break;
			case 5:
				System.out.println("Poori");
				System.out.println("Rs.85");
				break;
			default:
				System.out.println("Onum illa da loose");
			}
		}
		else {
			System.out.println("Hotel Not Available:"+hotelName);
		}
		}
	
	
	public void qty(Scanner sc) {
		System.out.println("Enter the quantity:");
		int qty=sc.nextInt();
	}
	
	public void findHotel() {
		Scanner sc=new Scanner(System.in);
		String result = "";
		boolean contains = false;
		System.out.println("Enter the hotel:");
		String hotel=sc.nextLine();
		String temp;
		for(int i=0;i<hotels.length;i++) {
			temp=hotels[i];
		if(hotel.equals(temp)) {
			contains = true;
			break;
		}
		}
		if(contains) {
			System.out.println("Hotel  Available:"+hotel);
		}
			else {
				System.out.println("Hotel Not Available:"+hotel);
			}
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotels hotelList=new Hotels();
		hotelList.getData(0, 0);
//		hotelList.findHotel();
	}

}
