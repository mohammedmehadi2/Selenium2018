package Inheritancepac;

public class Sub extends Super {
	static Sub c = new Sub();
	public static void main(String[]args) {
		
	    Sub a;
		a = new Sub();
		a.methodofsupersuper();
		

		Sub.c.methodofsupersuper();
	}

}
