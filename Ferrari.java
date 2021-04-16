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
			System.out.println("処理前の車高: " + vehecleHeight + "mm");
			vehecleHeight += 40;
			System.out.println("処理後の車高: " + vehecleHeight + "mm");
			System.out.println("現在の加速度: " + acceleration + "m/s^2\n");
		} else {
			acceleration = 5;
			frontUp = false;
			System.out.println("処理前の車高: " + vehecleHeight + "mm");
			vehecleHeight -= 40;
			System.out.println("処理後の車高: " + vehecleHeight + "mm");
			System.out.println("現在の加速度: " + acceleration + "m/s^2\n");
		}
	}
	
	public static Ferrari ferrariGenerate() {
		Ferrari ferrari = new Ferrari();
		return ferrari;
	}
}
