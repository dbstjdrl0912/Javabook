package Javabook;
import java.util.Scanner;

public class FlowEx29_4_29_32 {

	public static void main(String[] args) {
//		for(int i=1; i<=100;i++) {
//				System.out.printf("i=%d",i);
//				
//				int tmp = i;
//				
//				do {
//					if (tmp % 10 % 3==0 && tmp %10 != 0) {
//						System.out.print("짝");
//					}
//				}while ((tmp /= 10) != 0);
//				System.out.println();
//		}
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
			System.out.println("(1) square ");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (!(1 <=menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셧씁니다.(종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu + "번입니다.");
		}
		}

	}

