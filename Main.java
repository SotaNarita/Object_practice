package object;

public class Main {

	public static void main(String[] args) {
		//�e�ԃC���X�^���X��
		Honda honda = new Honda();
		Nissan nissan = new Nissan();
		Ferrari ferrari = new Ferrari();
		//�e�Ԃ̏��\��
		honda.displayPerformance("�z���_");
		nissan.displayPerformance("�j�b�T��");
		ferrari.displayPerformance("�t�F���[��");
		//���[�T�[�̃C���X�^���X��
		CrewPerson hondaRacer = new CrewPerson(honda);
		CrewPerson nissanRacer = new CrewPerson(nissan);
		CrewPerson ferrariRacer = new CrewPerson(ferrari);
		//���[�T�[���������̊e�Ԃ̏��\��
		honda.displayPerformance("�z���_");
		nissan.displayPerformance("�j�b�T��");
		ferrari.displayPerformance("�t�F���[��");

	}
}
