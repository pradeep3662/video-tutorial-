package OopsConceptpart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bmw b=new bmw();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		System.out.println("***********");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("***********");
       Car c1= new bmw();
       c.start();
		c.stop();
		c.refuel();
	}

}
