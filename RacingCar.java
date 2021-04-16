package object;

import java.util.Random;

public class RacingCar {
	protected Random rand = new Random();
	protected int price;
	protected int seats;
	protected double acceleration;
	
	public RacingCar(int r, int seats_, double acceleration_) {
		this.price = rand.nextInt(200) + r;
		this.seats = seats_;
		this.acceleration = acceleration_;
	}
	
	public void accel() {
		
	}
	public void brake() {
		
	}
	public int getPrice() {
		return this.price;
	}
	public int getSeats() {
		return this.seats;
	}
	public double getAcceleration() {
		return this.acceleration;
	}
	public void displayPerformance(String vehecleMaker) {
		System.out.println(vehecleMaker);
		System.out.println("‰¿Ši: " + String.format("%,d", price) + "‰~");
		System.out.println("’èˆõ”: " + seats + "l");
		System.out.println("‰Á‘¬“x: " + acceleration + "m/s^2\n");
	}
}