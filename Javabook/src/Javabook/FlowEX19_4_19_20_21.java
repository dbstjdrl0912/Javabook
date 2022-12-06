package Javabook;

public class FlowEX19_4_19_20_21 {

	public static void main(String[] args) {
//4-19
//		for(int i=1;i<=3; i++)
//			for (int j=1;j<=3;j++)
//				for (int k=1;k<=3;k++)
//					System.out.println(""+i+j+k);
//	4-20
//		for(int i=1;i<=5;i++) {
//			for (int j=1 ; j<=5;j++) {
//				System.out.printf("[%d,%d]",i,j);
//			}
//			System.out.println();
//		}
//	4-21
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
	}

}
