package be.pxl.generics.opdracht2;

public class Hoed<E> {
	
	private E dier;
	

	public Hoed(E dier){
		this.dier = dier;
	}
	
	public E kijk() {
		return this.dier;	
	}
	
}
