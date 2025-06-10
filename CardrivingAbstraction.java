package xyz;

abstract class caar{
	abstract void start();
	abstract void drive();
	abstract void stop();
}
class  drivercar extends  caar{
	void start() {
		System.out.println("the car is starting");
	}
	void drive() {
		System.out.println("the car is driven by the driver ");
	}
	void stop() {
		System.out.println("car stopped");
	}
	
}
public class CardrivingAbstraction {
	public static void main(String [] args) {
		caar mycar=new drivercar();
		mycar.start();
		mycar.drive();
		mycar.stop();
	}

}
