package object;

public class Ferrari extends RacingCar {
	
	int vehecleHeight = 90;
	boolean frontUp = false; //���ݎԍ����オ���Ă��邩�ǂ����̔���ɕK�v
	
	public Ferrari() {
		super(9000000, "�t�F���[��", 2, 4.8, 4, 48.6);
	}

	//�ԍ��グ��܂��͉����郁�\�b�h
	public void liftUpDown() {
		if (!frontUp) {
			setAcceleration(getAcceleration() * 0.8);
			frontUp = true;
			System.out.println("�����O�̎ԍ�: " + vehecleHeight + "mm");
			vehecleHeight += 40;
			System.out.println("������̎ԍ�: " + vehecleHeight + "mm");
			System.out.println("���݂̉����x: " + getAcceleration() + "m/s^2\n");
		} else {
			setAcceleration(getAcceleration() * 1.25);
			frontUp = false;
			System.out.println("�����O�̎ԍ�: " + vehecleHeight + "mm");
			vehecleHeight -= 40;
			System.out.println("������̎ԍ�: " + vehecleHeight + "mm");
			System.out.println("���݂̉����x: " + getAcceleration() + "m/s^2\n");

		}
	}
}
