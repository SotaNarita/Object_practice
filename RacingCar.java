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

	//�R���X�g���N�^�ݒ�(���i�̍Œ�l�A�����x�A�u���[�L�\�́A�ō���)
	public RacingCar(int r, String carName_, int seats_, double acceleration_, double brakePower_, double topSpeed_) {
		this.setPrice(this.price + r);
		this.setCarName(carName_);
		this.setSeats(seats_);
		this.setAcceleration(acceleration_);
		this.setBrakePower(brakePower_);
		this.setTopSpeed(topSpeed_);
	}
	//�A�N�Z���𓥂񂾎��̓���
	public void accel() {
		if(speed<topSpeed) {
			speed+=(acceleration*0.1);
			if(speed>topSpeed) {
				speed=topSpeed;
			}
		}
	}
	//�u���[�L�𓥂񂾎��̓���
	public void brake() {
		if(speed>0) {
			speed-=(brakePower*0.1);
			if(speed<0) {
				speed=0;
			}
		}
	}
	//�ȉ�getter�����setter
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
	
	//���\�\�����郁�\�b�h
	public void displayPerformance() {
		System.out.println(carName);
		System.out.println("���i: " + String.format("%,d", price) + "�~");
		System.out.println("�����: " + seats + "�l");
		System.out.println("�����: " + crew + "�l");
		System.out.println("�����x: " + String.format("%.3g", acceleration) + "m/s^2\n");
	}

}