package Day02;

import java.util.Scanner;

public class _21_advance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. 가위 바위 보 게임을 만듭니다
   			 컴퓨터는 난수로 생성하고 사용자는 문자열로 입력받습니다
   			 10번 진행하고 승 패 비김 을 출력하세요*/
		Scanner sc = new Scanner(System.in);
		String strNum = "";
		int num = 0;
		int randomNum = 0;
		
		for(int i = 0; i < 10; i++) {
			randomNum = (int)(Math.random() * 3);
			
			System.out.print("가위, 바위, 보 중 하나 입력");
			strNum = sc.nextLine();
			
			if(strNum.equals("가위")) {
				num = 0;
			} else if(strNum.equals("바위")) {
				num = 1;
			} else if(strNum.equals("보")) {
				num = 2;
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			
			if(num == randomNum) {
				System.out.println("비김");
			} else if(num == 0) {
				if(randomNum == 1) {
					System.out.println("패");
				} else {
					System.out.println("승");
				}
			} else if(num == 1) {
				if(randomNum == 2) {
					System.out.println("패");
				} else {
					System.out.println("승");
				}
			} else if(num == 2) {
				if(randomNum == 0) {
					System.out.println("패");
				} else {
					System.out.println("승");
				}
			}
		}
	}

}
