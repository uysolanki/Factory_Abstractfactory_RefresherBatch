package day10factorypattern;

public class CourtManager {

	static Court court=null;
	static Court getCourt(int choice)
	{
		switch(choice)
		{
		case 1: court=new CricketCourt();
				break;
		case 2 : court=new FootballCourt();
				break;
		case 3 : court=new TennisCourt();
			    break;
		case 4 : court=new SkatingCourt();
	    		break;
		}
	return court;
	}
}
