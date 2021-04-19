package object;

import java.util.Random;

public class RacingCar {
	private Random randPrice = new Random();
	private int price = randPrice.nextInt(2000000);
	private int seats;
	private int crew = 0;
	private double acceleration;
	
	public RacingCar(int r, int seats_, double acceleration_) {
		this.setPrice(this.price + r);
		this.setSeats(seats_);
		this.setAcceleration(acceleration_);
	}
	
	public void accel() {
		//メソッドの内容は未定
	}
	public void brake() {
		//メソッドの内容は未定
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price_) {
		this.price = price_;
	}
	
	public int getSeats() {
		return this.seats;
	}
	
	public void setSeats(int seats_) {
		this.seats = seats_;
	}
	
	public int getCrew() {
		return this.crew;
	}
	
	public void setCrew(int crew_) {
		this.crew = crew_;
	}
	
	public double getAcceleration() {
		return this.acceleration;
	}
	
	public void setAcceleration(double acceleration_) {
		this.acceleration = acceleration_;
	}
	//車の詳細情報表示するメソッド
	public void displayPerformance(String vehecleMaker) {
		System.out.println(vehecleMaker);
		System.out.println("価格: " + String.format("%,d", price) + "円");
		System.out.println("定員数: " + seats + "人");
		System.out.println("乗員数: " + crew + "人");
		System.out.println("加速度: " + String.format("%.3g", acceleration) + "m/s^2\n");
	}
}