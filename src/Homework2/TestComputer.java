package Homework2;

public class TestComputer {

	public static void main(String[] args) {
		Computer Computer1 = new Computer();
		Computer1.setinfo("Samsung", "Samsung", "Atech", 256, 10000);
		Computer1.display();
		
		Computer Computer2 = new Computer();
		Computer2.setinfo("HP", "HP", "Btech", 256, 10000);
		Computer2.display();
		
		Computer Computer3 = new Computer("Apple", "Apple", "Ctech", 256, 20000);
		Computer3.display();
		
		Computer.enddisplay();


	}

}
