package object;

public class Nissan extends RacingCar{

	public Nissan() {
		super(3000000, 4, 4);
		this.setAcceleration(getAcceleration() * 0.6);
	}
}
