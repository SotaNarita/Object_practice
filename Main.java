package object;

public class Main {

	public static void main(String[] args) {
		//各車インスタンス化
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();
		//各車の情報表示
		honda.displayPerformance("ホンダ");
		nissan.displayPerformance("ニッサン");
		ferrari.displayPerformance("フェラーリ");
		//レーサーのインスタンス化
		CrewPerson hondaRacer = new CrewPerson(honda);
		CrewPerson nissanRacer = new CrewPerson(nissan);
		CrewPerson ferrariRacer = new CrewPerson(ferrari);
		//レーサーが乗った後の各車の情報表示
		honda.displayPerformance("ホンダ");
		nissan.displayPerformance("ニッサン");
		ferrari.displayPerformance("フェラーリ");

	}
}
