package object;

public class RacingCar {
	protected int price;
	protected int seats;
	protected int acceleration;
	
	public void accel() {
		
	}
	public void brake() {
		
	}
	public int getPrice() {
		return this.price;
	}
	public int getSeats() {
		return this.seats;
	}
	public int getAcceleration() {
		return this.acceleration;
	}
	public void displayPerformance(String vehecleMaker) {
		System.out.println(vehecleMaker);
		System.out.println("���i: " + price + "�~");
		System.out.println("�����: " + seats + "�l");
		System.out.println("�����x: " + acceleration + "m/s^2\n");
	}
}