package object;

public class Nissan extends RacingCar{

	public Nissan() {
		super(3000000, "�j�b�T��", 4, 4.2, 4, 51.5);
		this.setAcceleration(getAcceleration() * 0.6);
	}
}