package day10factorypattern;

public class CricketCourt implements Court
{

	@Override
	public int getCourtPrice() {
		return 700;
	}
	
	@Override
	public String getCourtName() {
		return "Cricket Court";
	}

}
