package MyPackage;
import java.util.Scanner;

public class Hotel {

	public void Hotels() {
		String hotel1="A2B";
		String hotel2="BALAJI BHAVAN";
		String hotel3="SARAVANA BHAVAN";
		String hotel4="VASANTHA BHAVAN";
		String hotel5="SAYEE BHAVAN";
	}
	
	public void switchHotels(int choice) {
		System.out.print("The selected hotel is:");
		switch(choice) {
		case 1:
			System.out.println("A2B");
			break;
		case 2:
			System.out.println("Balaji Bhavan");
			break;
		case 3:
			System.out.println("Saravana Bhavan");
			break;
		case 4:
			System.out.println("Vasantha Bhavan");
			break;
		case 5:
			System.out.println("Vignesh Bhavan");
			break;
		default:
			System.out.println("Sayee Restaurant");
			break;
		}
	}
	public static void main(String[] args) {
//		String hotel1="A2B";
		// TODO Auto-generated method stub
//		System.out.println("HotelName:"+hotel1);
		Hotel choose=new Hotel();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		choose.switchHotels(choice);
	}

}
