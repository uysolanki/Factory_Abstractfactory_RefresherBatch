package day10abstractfactorypattern;

public class GeneralManager {

	static CourtManager courtManager=null;
	static EquipmentManager equipmentManager=null;
	static SocialMediaManager socialMediaManager =null;
	static Court getCourt(int courtChoice)
	{
		return courtManager.getCourt(courtChoice);
	}
	
	static Equipment getEquipment(int equipmentChoice)
	{
		return equipmentManager.getEquipment(equipmentChoice);
	}

	public static SocialMediaServices getMediaServices(int mediaServiceChoice) {
		return socialMediaManager.getSocialMediaServices(mediaServiceChoice);
	}
}
