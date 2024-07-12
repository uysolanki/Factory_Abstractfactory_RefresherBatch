package day10factorypattern;

public class TennisCourt implements Court
{

	@Override
	public int getCourtPrice() {
		return 900;
	}

	@Override
	public String getCourtName() {
		return "Tennis Court";
	}

	
}
