package be.pxl.generics.opdracht3;

public class TestWorkingPlace {
	public static void main(String[] args) {
		Car car = new Car();
		CircularSaw circularSaw = new CircularSaw();
		Bike bike = new Bike();
		
		WorkingPlace werkplaats = new WorkingPlace<>();
		//WorkingPlace<Motorized> Werkplaats2 = new WorkingPlace<>();
		//WorkingPlace<Vehicle> wp = new WorkingPlace<>();
		
		werkplaats.startFixing(car);
		//werkplaats.startFixing(circularSaw);
		werkplaats.startFixing(bike);
	}
}
