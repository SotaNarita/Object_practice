package object;

public class RacingCar {
	protected int price;
	protected int seats;
	protected int acceleration;
	
	public void accel() {
		
	}
	public void brake() {
		
	}
	public void getPerformance() {
		System.out.println("���i: " + this.price + "�~");
		System.out.println("���: " + this.seats + "�l");
		System.out.println("�����x: " + this.acceleration + "m/s^2");
		System.out.println(" ");
	}
}