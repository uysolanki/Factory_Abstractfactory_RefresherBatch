package day10abstractfactorypattern;

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
		int courtChoice=sc.nextInt();
		Court court=GeneralManager.getCourt(courtChoice);
		
		System.out.println("Equipment Options");
		System.out.println("1. Cricket Equipments");
		System.out.println("2. Football Equipments");
		System.out.println("3. Tennis Equipments");
		System.out.println("4. Skating Equipments");
		int equipmentChoice=sc.nextInt();
		Equipment equipment= GeneralManager.getEquipment(equipmentChoice);
		
		
		System.out.println("Media Services");
		System.out.println("1. Photographer");
		System.out.println("2. Vlogger");
		
		int mediaServiceChoice=sc.nextInt();
		SocialMediaServices socialMediaServices= GeneralManager.getMediaServices(mediaServiceChoice);
		
		
		System.out.println("Name : " + customerName);
		System.out.println("Mobile : " + mobileNo);
		System.out.println("Court Type : " + court.getCourtName());
		System.out.println("Court Price : " + court.getCourtPrice());
		System.out.println("Equipment Price : " + equipment.getEquipmentPrice());
		System.out.println("Social Media Services Price : " + socialMediaServices.getServicePrice());
		System.out.println("Total Price : " + (court.getCourtPrice()+equipment.getEquipmentPrice()+socialMediaServices.getServicePrice()));

		

	}

}
