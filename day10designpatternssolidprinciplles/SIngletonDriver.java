package day10designpatternssolidprinciplles;

public class SIngletonDriver {

	public static void main(String[] args) {
		Singleton s[]=new Singleton[100];
		for(int i=0;i<s.length;i++)
		{
			s[i]=Singleton.getSingletonInstance();
		}
		
		System.out.println(s[0]==s[88]);
		System.out.println(s[17]==s[67]);
		System.out.println(s[24]==s[81]);
		
		System.out.println("*******************");
		Person p[]=new Person[100];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Person();
		}
		
		System.out.println(p[0]==p[88]);
		System.out.println(p[17]==p[67]);
		System.out.println(p[24]==p[81]);
	}

}
