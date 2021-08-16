package inh;

public class SingleLevelInh {

	public static void main(String[] args) {

		
		//Car --> 1 [ consumeBattery ] 
		//Dzire ==> 2 [ consumeBatery , petrolFuel ] 
		
		Dzire d = new Dzire();
		d.consumeBattery();
		d.petrolFuel();
	}
}

class Car {
	void consumeBattery() {
		System.out.println("car::battery()");
	}
}

class Dzire extends Car{
	void petrolFuel() {
		System.out.println("Dzire::petrolFuel()");
	}
}