package day10abstractfactorypattern;

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
