package day10factorypattern;

import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String customerName=sc.next();
		System.out.println("Enter Mobile Number");
		Long mobileNo=sc.nextLong();
		
		System.out.println("Court Options");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("4. Skating");
		int choice=sc.nextInt();
		
		Court court=CourtManager.getCourt(choice);
		
		System.out.println("Name : " + customerName);
		System.out.println("Mobile : " + mobileNo);
		System.out.println("Court Type : " + court.getCourtName());
		System.out.println("Total bill : " + court.getCourtPrice());

		

	}

}
