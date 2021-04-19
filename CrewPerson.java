package object;

import java.util.Random;

public class CrewPerson {
	
	public int member = 1;
	
	public CrewPerson(RacingCar car) {
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member;//�Ԃɏ��l������
		car.setCrew(seatsFill);
		System.out.println("���O: " + String.format("%.3g", car.getAcceleration()) + "m/s^2");//�l���Ԃɏ��O�̉����x�\��
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		System.out.println("�������: " + String.format("%.3g", car.getAcceleration()) + "m/s^2");//�l���Ԃɏ������̉����x�\��
		System.out.println("������l��" + seatsFill + "�l\n");
	}
	
	public void stepAccel(RacingCar car) {
		car.accel();
	}
	public void stepBrake(RacingCar car) {
		car.brake();
	}
	
}