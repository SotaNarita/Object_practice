package object;

public class Main {

	public static void main(String[] args) {
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();

		honda.displayPerformance("ホンダ");
		nissan.displayPerformance("ニッサン");
		ferrari.displayPerformance("フェラーリ");
		
		ferrari.liftUpDown();
		ferrari.liftUpDown();
	}

}
