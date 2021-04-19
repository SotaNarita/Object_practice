package object;

public class Ferrari extends RacingCar {
	
	int vehecleHeight = 90;
	boolean frontUp = false;
	
	public Ferrari() {
		super(9000000, 2, 5);
	}


	public void liftUpDown() {
		if (!frontUp) {
			setAcceleration(getAcceleration() * 0.8);
			frontUp = true;
			System.out.println("処理前の車高: " + vehecleHeight + "mm");
			vehecleHeight += 40;
			System.out.println("処理後の車高: " + vehecleHeight + "mm");
			System.out.println("現在の加速度: " + getAcceleration() + "m/s^2\n");
		} else {
			setAcceleration(getAcceleration() * 1.25);
			frontUp = false;
			System.out.println("処理前の車高: " + vehecleHeight + "mm");
			vehecleHeight -= 40;
			System.out.println("処理後の車高: " + vehecleHeight + "mm");
			System.out.println("現在の加速度: " + getAcceleration() + "m/s^2\n");
		}
	}
}
