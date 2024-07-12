package day10factorypattern;

public class SkatingCourt implements Court
{

	@Override
	public int getCourtPrice() {
		return 1000;
	}

	@Override
	public String getCourtName() {
		return "Skating Court";
	}

}
