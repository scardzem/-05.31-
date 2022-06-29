package Day01;

import java.util.Scanner;

public class _19_advance04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. 369게임을 작성합니다.
   		  	 1~99까지의 정수를 입력받고
   		  	 3,6,9중 하나가 있으면 "박수짝"을 출력하고
   			 2개가 있으면 "박수짝짝"을 출력하세요
   			 예를 들어 13은 "박수짝"
   			 36인 경우는 "박수짝짝"을 출력하면 됩니다.*/
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		// num = 81
		
		if(num >= 1 && num <= 99) {
			// tenNum = 8;
			int tenNum = num / 10;
			// oneNum = 81 - 8 * 10;
			// oneNum = 1;
			int oneNum = num - tenNum * 10;
			int count = 0;
			String printStr = "";
			
			if(tenNum > 0 && tenNum % 3 == 0) {
				count++;
			}
			
			if(oneNum > 0 && oneNum % 3 == 0) {
				count++;
			}
			
			if(count == 1) {
				System.out.println("박수짝");
			} else if(count == 2) {
				System.out.println("박수짝짝");
			} else {
				System.out.println("어느 자리수에도 3의 배수가 없습니다.");
			}
			
			printStr = count == 1 ? "박수짝" : count == 2 ? "박수짝짝" : "어느 자리수에도 3의 배수가 없습니다.";
			System.out.println(printStr);
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
