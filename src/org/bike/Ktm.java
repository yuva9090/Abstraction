package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("1.75L");
		
	}

	@Override
	public void speed() {
		System.out.println("150km/hr");
		
	}
	public static void main(String[] args) {
		Ktm i = new Ktm();
		i.cost();
		i.speed();
	}
	

}
