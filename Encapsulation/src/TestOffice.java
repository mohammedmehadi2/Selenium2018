
public class TestOffice {

	public static void main(String[] args) {
		Office apple = new Office();
		Office banana = new Office();
		banana.setEmplId(2);
		
		
		
		
apple.setEmplId(1);
apple.setEmplName("Steve Jobs");

System.out.println( apple.getEmplName() + " " + apple.getEmplId() );
	}

}
