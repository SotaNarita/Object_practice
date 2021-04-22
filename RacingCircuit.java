package object;

public class RacingCircuit {
	private double straightLength1 = 2000;
	private double straightLength2 = 3500;
	private double curveLength1 = 1500;
	private double curveLength2 = 1000;
	private double time=0;
	public static double timeUnit = 0.1;
	double remainingVelocity;
	double raceTimeArray[][] = new double[4][4];
	
	//�J�[���[�X���J�n���郁�\�b�h
	public void raceStart() {
		//���[�X�J�[�C���X�^���X��
		RacingCar carArray[] = {new Honda(), new Nissan(), new Ferrari(), new Toyota()};
		//���[�T�[�C���X�^���X�����ĎԂɏ悹��
		CrewPerson hondaRacer = new CrewPerson(carArray[0]);
		CrewPerson nissanRacer = new CrewPerson(carArray[1]);
		CrewPerson ferrariRacer = new CrewPerson(carArray[2]);
		CrewPerson toyotaRacer = new CrewPerson(carArray[3]);
		
		//���ꂼ��̎Ԃ̐��\��\��
		for(int i = 0; i<carArray.length;i++) {
			carArray[i].displayPerformance();
		}
		//��P�����ʉߎ��̃^�C���v��
		for(int i = 0; i<carArray.length;i++) {
			this.goStraight(straightLength1, carArray[i]);
			raceTimeArray[0][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "�̑�P�������߂��Ẵ^�C����" + String.format("%.3g", this.getTime()) + "�b");
		}
		System.out.println();
		//��P�R�[�i�[�ʉߎ��̃^�C���v��
		for(int i = 0; i<carArray.length;i++) {
			this.goCurve(curveLength1, carArray[i]);
			raceTimeArray[1][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "�̑�P�R�[�i�[���߂��Ẵ^�C����" + String.format("%.3g", this.getTime()) + "�b");
		}
		System.out.println();
		//��Q�����ʉߎ��̃^�C���v��
		for(int i = 0; i<carArray.length;i++) {
			this.goStraight(straightLength2, carArray[i]);
			raceTimeArray[2][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "�̑�2�������߂��Ẵ^�C����" + String.format("%.3g", this.getTime()) + "�b");
		}
		System.out.println();
		//��Q�R�[�i�[�ʉߎ��̃^�C���v��
		for(int i = 0; i<carArray.length;i++) {
			this.goCurve(curveLength2, carArray[i]);
			raceTimeArray[3][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "�̑�2�R�[�i�[���߂��Ẵ^�C����" + String.format("%.3g", this.getTime()) + "�b");
		}
		System.out.println();
		//�^�C���̍��v
		double fullTime[]= {0, 0, 0, 0};
		double ranking=100000;
		String rank1Name=null;
		for (int i=0; i<carArray.length;i++) {
			for (int j=0; j<raceTimeArray[i].length; j++) {
				fullTime[i]+=raceTimeArray[j][i];
			//��ԑ��������Ԃ𒲂ׂ�
			}
			if (ranking>fullTime[i]) {
				ranking = fullTime[i];
				rank1Name = carArray[i].getCarName();
			}
			System.out.println(carArray[i].getCarName() + "�͍��v��" + String.format("%.4g", fullTime[i]) + "�b");
		}
		System.out.println("\n1�ʂ�" + String.format("%.4g", ranking) + "�b��" + rank1Name + "!");
	}

	//�������̉^�]���������\�b�h
	private void goStraight(double straightLength, RacingCar car) {
		//�c��̋���
		remainingVelocity = straightLength;
		this.setTime(0);
		double d = this.traveledVelocity(car);
		for (remainingVelocity = straightLength; remainingVelocity>=0; remainingVelocity -= d) {
			d = this.traveledVelocity(car);
			this.setTime(this.getTime()+timeUnit);
			if (remainingVelocity !=0 ) {	
			if (car.getBrakePower() <=3) {//�u���[�L�\�͂̎ア��
				if (remainingVelocity > straightLength*0.1) {
					car.accel();
					} else {
						car.brake();
					}
				} else {
				if(remainingVelocity > straightLength*0.05) {//�u���[�L�\�͂̋�����
					car.accel();
				} else {
					car.brake();
					}
				}
			}	
		}	
	}
	//�J�[�u���̉^�]���������\�b�h
	private void goCurve(double curveLength, RacingCar car) {
		this.setTime(0);
		double d = this.traveledVelocity(car);
		for (remainingVelocity = curveLength; remainingVelocity>=0; remainingVelocity -= d) {
			d = this.traveledVelocity(car);
			this.setTime(time+0.1);
			if (remainingVelocity>300) {
				if (car.getSpeed() < car.getTopSpeed()*0.5) {
					car.accel();
					} else {
						car.brake();
					}
			} else {
				car.accel();
			}
		}
	}
	
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}

	//�i�񂾋�����\�����\�b�h
	private double traveledVelocity(RacingCar car) {
		double unit1;
		if(car.getSpeed()==car.getTopSpeed()) {
			unit1 = 0;
		} else {
			 unit1 = 0.5*timeUnit*timeUnit*car.getAcceleration();
		}
			double traveledVelocity = unit1+car.getSpeed()*timeUnit;
			return traveledVelocity;
	}
}