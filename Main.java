package object;

public class Main {

	public static void main(String[] args) {
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();

		honda.getPerformance();
		nissan.getPerformance();
		ferrari.getPerformance();
	}

}
