package object;

public class Ferrari extends RacingCar {
	
	int vehecleHeight = 90;
	boolean frontUp = false; //現在車高が上がっているかどうかの判定に必要
	
	public Ferrari() {
		super(9000000, "フェラーリ", 2, 4.8, 4, 48.6);
	}

	//車高上げるまたは下げるメソッド
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
