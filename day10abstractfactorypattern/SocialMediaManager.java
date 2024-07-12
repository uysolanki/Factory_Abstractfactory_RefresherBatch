package day10abstractfactorypattern;

public class SocialMediaManager {
	static SocialMediaServices socialMediaServices=null;
	
	static SocialMediaServices getSocialMediaServices(int socialMediaChoice)
	{
		switch(socialMediaChoice)
		{
		case 1 : socialMediaServices=new Photgrapher();
				 break;
		case 2 : socialMediaServices=new Vloger();
		 		 break;
		
		}
		return socialMediaServices;
	}
}
