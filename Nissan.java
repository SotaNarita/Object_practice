package object;

public class Nissan extends RacingCar{

	public Nissan() {
		super(3000000, "�j�b�T��", 4, 4.2, 3, 52.8);
		this.setAcceleration(getAcceleration() * 0.6);
	}
}