package day10designpatternssolidprinciplles;

public class Singleton {
	private static Singleton singleton=null;
	
	private Singleton() {}
	
	public static Singleton getSingletonInstance()
	{
		if(singleton==null)  //1st time true
		{
		singleton=new Singleton();
		}
		return singleton;
	}
	
	public void display()
	{
		System.out.println("ExcelR");
	}
}
