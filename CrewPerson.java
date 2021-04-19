package object;

import java.util.Random;

public class CrewPerson {
	
	public int member = 1;
	
	public CrewPerson(RacingCar car) {
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member;
		car.setCrew(seatsFill);
		System.out.println("乗る前: " + car.getAcceleration() + "m/s^2");
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		System.out.println("乗った後: " + car.getAcceleration() + "m/s^2");
		System.out.println("乗ろうとしている人" + seatsFill + "人\n");
	}
	
	public void stepAccel(RacingCar car) {
		car.accel();
	}
	public void stepBrake(RacingCar car) {
		car.brake();
	}
	
}