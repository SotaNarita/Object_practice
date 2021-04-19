package object;

import java.util.Random;

public class CrewPerson {
	
	public int member = 1;
	
	public CrewPerson(RacingCar car) {
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member;//車に乗る人数決定
		car.setCrew(seatsFill);
		System.out.println("乗る前: " + String.format("%.3g", car.getAcceleration()) + "m/s^2");//人が車に乗る前の加速度表示
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		System.out.println("乗った後: " + String.format("%.3g", car.getAcceleration()) + "m/s^2");//人が車に乗った後の加速度表示
		System.out.println("乗った人数" + seatsFill + "人\n");
	}
	
	public void stepAccel(RacingCar car) {
		car.accel();
	}
	public void stepBrake(RacingCar car) {
		car.brake();
	}
	
}