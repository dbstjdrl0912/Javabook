package Javabook;
public class ArrayEx1_5_1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;
		int[] score2 = { 50, 60, 70, 80, 90 };

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // int tmp = score [3] + score [4]

		for (int i = 0; i < 5; i++) {
			System.out.printf("score [%d]:%d%n", i, score[i]);
		}
		for (int j = 0; j < 5; j++) {
			System.out.printf("score2 [%d]:%d%n", j, score2[j]);
		}
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", -5, score[3]);
	}
}
