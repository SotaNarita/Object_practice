package object;

public class Ferrari extends RacingCar {
	
	public Ferrari() {
		super(9000000, 2, 5);
	}
	
	int vehecleHeight = 90;
	boolean frontUp = false;

	public void liftUpDown() {
		if (!frontUp) {
			acceleration *=0.8;
			frontUp = true;
			System.out.println("�����O�̎ԍ�: " + vehecleHeight + "mm");
			vehecleHeight += 40;
			System.out.println("������̎ԍ�: " + vehecleHeight + "mm");
			System.out.println("���݂̉����x: " + acceleration + "m/s^2\n");
		} else {
			acceleration = 5;
			frontUp = false;
			System.out.println("�����O�̎ԍ�: " + vehecleHeight + "mm");
			vehecleHeight -= 40;
			System.out.println("������̎ԍ�: " + vehecleHeight + "mm");
			System.out.println("���݂̉����x: " + acceleration + "m/s^2\n");
		}
	}
	
	public static Ferrari ferrariGenerate() {
		Ferrari ferrari = new Ferrari();
		return ferrari;
	}
}
