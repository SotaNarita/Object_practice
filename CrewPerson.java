package object;

import java.util.Random;

public class CrewPerson {
	
	private int member = 1;
	private RacingCar car;
	
	public CrewPerson(RacingCar car_) {
		this.setCar(car_);
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member; //運転手含め何人が車に乗るかを決定
		car.setCrew(seatsFill);
		//System.out.println("乗る前: " + car.getAcceleration() + "m/s^2"); //人が乗る前の加速度
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		//System.out.println("乗った後: " + car.getAcceleration() + "m/s^2"); // 人が乗った後の加速度
		//System.out.println("乗った人数" + seatsFill + "人\n");
	}
	public RacingCar getCar() {
		return this.car;
	}
	public void setCar(RacingCar car) {
		this.car = car;
	}

}