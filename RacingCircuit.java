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
	
	//カーレースを開始するメソッド
	public void raceStart() {
		//レースカーインスタンス化
		RacingCar carArray[] = {new Honda(), new Nissan(), new Ferrari(), new Toyota()};
		//レーサーインスタンス化して車に乗せる
		CrewPerson hondaRacer = new CrewPerson(carArray[0]);
		CrewPerson nissanRacer = new CrewPerson(carArray[1]);
		CrewPerson ferrariRacer = new CrewPerson(carArray[2]);
		CrewPerson toyotaRacer = new CrewPerson(carArray[3]);
		
		//それぞれの車の性能を表示
		for(int i = 0; i<carArray.length;i++) {
			carArray[i].displayPerformance();
		}
		//第１直線通過時のタイム計測
		for(int i = 0; i<carArray.length;i++) {
			this.goStraight(straightLength1, carArray[i]);
			raceTimeArray[0][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "の第１直線を過ぎてのタイムは" + String.format("%.3g", this.getTime()) + "秒");
		}
		System.out.println();
		//第１コーナー通過時のタイム計測
		for(int i = 0; i<carArray.length;i++) {
			this.goCurve(curveLength1, carArray[i]);
			raceTimeArray[1][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "の第１コーナーを過ぎてのタイムは" + String.format("%.3g", this.getTime()) + "秒");
		}
		System.out.println();
		//第２直線通過時のタイム計測
		for(int i = 0; i<carArray.length;i++) {
			this.goStraight(straightLength2, carArray[i]);
			raceTimeArray[2][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "の第2直線を過ぎてのタイムは" + String.format("%.3g", this.getTime()) + "秒");
		}
		System.out.println();
		//第２コーナー通過時のタイム計測
		for(int i = 0; i<carArray.length;i++) {
			this.goCurve(curveLength2, carArray[i]);
			raceTimeArray[3][i] += this.getTime();
			System.out.println(carArray[i].getCarName() + "の第2コーナーを過ぎてのタイムは" + String.format("%.3g", this.getTime()) + "秒");
		}
		System.out.println();
		//タイムの合計
		double fullTime[]= {0, 0, 0, 0};
		double ranking=100000;
		String rank1Name=null;
		for (int i=0; i<carArray.length;i++) {
			for (int j=0; j<raceTimeArray[i].length; j++) {
				fullTime[i]+=raceTimeArray[j][i];
			//一番早かった車を調べる
			}
			if (ranking>fullTime[i]) {
				ranking = fullTime[i];
				rank1Name = carArray[i].getCarName();
			}
			System.out.println(carArray[i].getCarName() + "は合計で" + String.format("%.4g", fullTime[i]) + "秒");
		}
		System.out.println("\n1位は" + String.format("%.4g", ranking) + "秒で" + rank1Name + "!");
	}

	//直線時の運転を示すメソッド
	private void goStraight(double straightLength, RacingCar car) {
		//残りの距離
		remainingVelocity = straightLength;
		this.setTime(0);
		double d = this.traveledVelocity(car);
		for (remainingVelocity = straightLength; remainingVelocity>=0; remainingVelocity -= d) {
			d = this.traveledVelocity(car);
			this.setTime(this.getTime()+timeUnit);
			if (remainingVelocity !=0 ) {	
			if (car.getBrakePower() <=3) {//ブレーキ能力の弱い車
				if (remainingVelocity > straightLength*0.1) {
					car.accel();
					} else {
						car.brake();
					}
				} else {
				if(remainingVelocity > straightLength*0.05) {//ブレーキ能力の強い車
					car.accel();
				} else {
					car.brake();
					}
				}
			}	
		}	
	}
	//カーブ時の運転を示すメソッド
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

	//進んだ距離を表すメソッド
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