package Javabook;
import java.util.Scanner;

public class FlowEx24_4_25 {

	public static void main(String[] args) {
		int num = 0, sum =0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		sc.close();
		num = Integer.parseInt(tmp);
		
	while (num != 0 ) {
		sum += num % 10;
		System.out.printf( "sum=%3d  num=%d\n", sum ,num);
		sum += num%10;
	}
	System.out.println("각 자리 수의 합 " + sum);
	}

}
