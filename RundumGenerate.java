package object;

import java.util.Random;

public class RundumGenerate {
	public static void carGenerate() {
		Random rand = new Random();
		int l = rand.nextInt(29) + 1;
		int m = rand.nextInt(29) + 1;
		int n = rand.nextInt(29) + 1;
		Honda hondaArray[] = new Honda[l];
		Nissan nissanArray[] = new Nissan[m];
		Ferrari ferrariArray[] = new Ferrari[n];
		int priceSum = 0;
		for(int i=0; i<l; i++) {
			hondaArray[i] = new Honda();
			priceSum += hondaArray[i].price;
		}
		for(int j=0; j<m; j++) {
			nissanArray[j] = new Nissan();
			priceSum += nissanArray[j].price;
		}
		for(int k=0; k<n; k++) {
			ferrariArray[k] = new Ferrari();
			priceSum += ferrariArray[k].price;
		}
		System.out.println("�z���_�̑䐔��" + l + "��");
		System.out.println("�j�b�T���̑䐔��" + m + "��");
		System.out.println("�t�F���[���̑䐔��" + n + "��");
		System.out.println((l+m+n) + "��̍��v���z��" + String.format("%,d", priceSum) + "�~");
		System.out.println((l+m+n) + "��̕��ϋ��z��" + String.format("%,d", (priceSum/l+m+n)) + "�~");
		}
}
