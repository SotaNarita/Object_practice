package object;

import java.util.Random;

public class RacingCar {
	private Random randPrice = new Random();
	private String carName;
	private int price = randPrice.nextInt(2000000);
	private int seats;
	private int crew = 0;
	private double acceleration;
	private double brakePower;
	private double speed = 0;
	private double topSpeed;

	//コンストラクタ設定(価格の最低値、加速度、ブレーキ能力、最高速)
	public RacingCar(int r, String carName_, int seats_, double acceleration_, double brakePower_, double topSpeed_) {
		this.setPrice(this.price + r);
		this.setCarName(carName_);
		this.setSeats(seats_);
		this.setAcceleration(acceleration_);
		this.setBrakePower(brakePower_);
		this.setTopSpeed(topSpeed_);
	}
	//アクセルを踏んだ時の動作
	public void accel() {
		if(speed<topSpeed) {
			speed+=(acceleration*0.1);
			if(speed>topSpeed) {
				speed=topSpeed;
			}
		}
	}
	//ブレーキを踏んだ時の動作
	public void brake() {
		if(speed>0) {
			speed-=(brakePower*0.1);
			if(speed<0) {
				speed=0;
			}
		}
	}
	//以下getterおよびsetter
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName_) {
		this.carName = carName_;
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
	
	public double getBrakePower() {
		return brakePower;
	}
	public void setBrakePower(double brakePower) {
		this.brakePower = brakePower;
	}

	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	//性能表示するメソッド
	public void displayPerformance() {
		System.out.println(carName);
		System.out.println("価格: " + String.format("%,d", price) + "円");
		System.out.println("定員数: " + seats + "人");
		System.out.println("乗員数: " + crew + "人");
		System.out.println("加速度: " + String.format("%.3g", acceleration) + "m/s^2\n");
	}

}