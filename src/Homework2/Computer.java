package Homework2;

public class Computer {
public String brand;
public String monitor;
public String keyboard;
public static int ram;
public int price;

public void setinfo(String br,String mon,String key,int ram,int pri) {
	brand = br;
	monitor = mon;
	keyboard = key;
	this.ram = ram;
	price = pri;
	
}
public void display() {
	System.out.println("Brand : "+ brand );
	System.out.println("Monitor : "+ monitor );
	System.out.println("Keyboard : "+ keyboard );
	System.out.println("Ram : "+ ram );
	System.out.println("Price : "+ price );
	
	}
public static void enddisplay() {
	System.out.println("Home work done");
}
public Computer() {}

Computer(String br,String mon,String key,int ram,int pri){
	brand = br;
	monitor = mon;
	keyboard = key;
	this.ram = ram;
	price = pri;
	
	
}


}
