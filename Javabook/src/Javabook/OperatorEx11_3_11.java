package Javabook;

public class OperatorEx11_3_11 {
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n" , d , a , d -a );//'d'- 'a' = 3
		System.out.printf("'%c' - '%c' = %d%n",two , zero,two -zero);
		System.out.printf("'%c' = %d%n", a , (int) a);
		System.out.printf("'%c' = %d%n", d , (int) d);
		System.out.printf("'%c' = %d%n",zero, (int)zero);
		System.out.printf("'%c' = %d%n",two , (int) two);
	}
	//아스키 코드 0-48 ~ 9-57   A-65 ~ Z-90 /a -97 ~ z -122
}
