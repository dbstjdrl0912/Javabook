package Javabook;
public class ArrayEx12_5_18 {
	public static void main (String[] args) {
		int [][] score = {
				{100,100,100}
					,{20,20,20}
					,{30,30,30}
						,{40,40,40}
					};
	int sum = 0;
		for (int i =0; i<score.length;i++) { // 종류별 분류의 길이 100/20/30/40
		for(int j=0; j<score[i].length;j++) { // 한종류안에 의 길이 100/100/100
			System.out.printf("score[%d][%d]=%d%n", i,j,score[i][j]);
		}
	}
		for(int [] tmp : score) {
			for (int i : tmp) {
				sum+= i;
			}
		}
		System.out.println("sum="+sum);
}
	}
	
