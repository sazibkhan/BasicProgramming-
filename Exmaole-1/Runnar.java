package abstractTest;

public class Runnar {

	public static void main(String[] args) {
		
		MobileUser mu;
		
		mu=new Korim();
		mu.sendMassage();
		
		
		mu=new Rohim();
		mu.sendMassage();
		
		Korim korim=new Korim();
	}

}
