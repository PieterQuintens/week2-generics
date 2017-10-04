package be.pxl.generics.opdracht3;

public class WorkingPlaceUtility {
	public static int getScore(WorkingPlace<? extends Bike> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
