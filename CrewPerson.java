package object;

import java.util.Random;

public class CrewPerson {
	
	public int member = 1;
	
	public CrewPerson(RacingCar car) {
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member;
		car.setCrew(seatsFill);
		System.out.println("æ‚é‘O: " + car.getAcceleration() + "m/s^2");
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		System.out.println("æ‚Á‚½Œã: " + car.getAcceleration() + "m/s^2");
		System.out.println("æ‚ë‚¤‚Æ‚µ‚Ä‚¢‚él" + seatsFill + "l\n");
	}
	
	public void stepAccel(RacingCar car) {
		car.accel();
	}
	public void stepBrake(RacingCar car) {
		car.brake();
	}
	
}