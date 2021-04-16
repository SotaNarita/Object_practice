package object;

public class Nissan extends RacingCar{

	public Nissan() {
		super(3000000, 4, 4);
	}
	
	public static Nissan nissanGenerate() {
		Nissan nissan = new Nissan();
		return nissan;
	}
}
