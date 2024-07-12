package day10factorypattern;

public class FootballCourt implements Court 
{

	@Override
	public int getCourtPrice() {
		return 800;
	}
	@Override
	public String getCourtName() {
		return "Football Court";
	}

}
