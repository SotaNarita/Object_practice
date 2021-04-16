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
		System.out.println("ホンダの台数は" + l + "台");
		System.out.println("ニッサンの台数は" + m + "台");
		System.out.println("フェラーリの台数は" + n + "台");
		System.out.println((l+m+n) + "台の合計金額は" + String.format("%,d", priceSum) + "円");
		System.out.println((l+m+n) + "台の平均金額は" + String.format("%,d", (priceSum/l+m+n)) + "円");
		}
}
