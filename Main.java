package object;

public class Main {

	public static void main(String[] args) {
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();

		honda.displayPerformance("�z���_");
		nissan.displayPerformance("�j�b�T��");
		ferrari.displayPerformance("�t�F���[��");
		
		ferrari.liftUpDown();
		ferrari.liftUpDown();
	}

}
