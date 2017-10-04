package be.pxl.generics.opdracht2;

public class Hoed<E> {

	private E dier;
	private boolean first = true;

	public Hoed(E dier) {
			this.dier = dier;
	}
	public E kijk() {
		
		if(first) {
			first = false;
			return null;
		}else {
			return this.dier;
		}
	}
}
