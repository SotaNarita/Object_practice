package object;

import java.util.Random;

public class CrewPerson {
	
	private int member = 1;
	private RacingCar car;
	
	public CrewPerson(RacingCar car_) {
		this.setCar(car_);
		Random randCrew = new Random();
		int seatsFill = randCrew.nextInt(car.getSeats()-1) + member; //�^�]��܂߉��l���Ԃɏ�邩������
		car.setCrew(seatsFill);
		//System.out.println("���O: " + car.getAcceleration() + "m/s^2"); //�l�����O�̉����x
		for(int i=0; i<seatsFill; i++) {
			car.setAcceleration(car.getAcceleration()*0.95);
		}
		//System.out.println("�������: " + car.getAcceleration() + "m/s^2"); // �l���������̉����x
		//System.out.println("������l��" + seatsFill + "�l\n");
	}
	public RacingCar getCar() {
		return this.car;
	}
	public void setCar(RacingCar car) {
		this.car = car;
	}

}