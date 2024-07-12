package day10abstractfactorypattern;

public class EquipmentManager {
	static Equipment equipment=null;
	
	static Equipment getEquipment(int equipmentChoice)
	{
		switch(equipmentChoice)
		{
		case 1 : equipment=new CricketEquipment();
				 break;
		case 2 : equipment=new FootballEquipment();
		 		 break;
		case 3 : equipment=new TennisEquipment();
		 		 break;
		case 4 : equipment=new SkatingEquipment();
		 		 break;
		}
		return equipment;
	}
	

}
