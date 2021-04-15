package object;

public class Ferrari extends RacingCar {
	int vehecleHeight = 90;
	boolean frontUp = false;
	public Ferrari() {
		super.price = 10000000;
		super.seats = 2;
		super.acceleration = 5;
	}
	public void liftUpDown() {
		if (!frontUp) {
			acceleration *=0.8;
			frontUp = true;
			System.out.println("ˆ—‘O‚ÌÔ‚: " + vehecleHeight + "mm");
			vehecleHeight += 40;
			System.out.println("ˆ—Œã‚ÌÔ‚: " + vehecleHeight + "mm\n");
		} else {
			acceleration = 5;
			frontUp = false;
			System.out.println("ˆ—‘O‚ÌÔ‚: " + vehecleHeight + "mm");
			vehecleHeight -= 40;
			System.out.println("ˆ—Œã‚ÌÔ‚: " + vehecleHeight + "mm\n");
		}
	}
}
