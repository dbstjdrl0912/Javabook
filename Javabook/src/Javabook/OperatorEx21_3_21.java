package Javabook;

public class OperatorEx21_3_21 {
	public static void main (String[] args) { 
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
		System.out.printf("'0'== 0 \t %b%n", '0'== 0);
		System.out.printf("'A' == 65  \t %b%n", 'A'==65);
		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 !='B');
	}
	// %b- boolean \t- 탭  %n - 문자열변경   예시. %19.17f > 19문자의 소수점 17개
}
