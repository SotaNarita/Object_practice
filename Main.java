package object;

public class Main {

	public static void main(String[] args) {
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();

		honda.displayPerformance("�z���_");
		nissan.displayPerformance("�j�b�T��");
		ferrari.displayPerformance("�t�F���[��");
		
		CrewPerson hondaRacer = new CrewPerson(honda);
		CrewPerson nissanRacer = new CrewPerson(nissan);
		CrewPerson ferrariRacer = new CrewPerson(ferrari);
		//RandomGenerate.carGenerate();
		
		honda.displayPerformance("�z���_");
		nissan.displayPerformance("�j�b�T��");
		ferrari.displayPerformance("�t�F���[��");

	}

}