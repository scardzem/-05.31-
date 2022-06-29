package Day01;

import java.util.Scanner;

public class _18_advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. 돈의 액수를 입금하세요
   			 입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
   			 출력 개수는 단위가 큰 것 순서로 계산합니다
   			 예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.*/
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int count;
		String printStr = "";
		
		count = money / 50000;
		printStr += "<오만원 " + count + "매, ";
		money -= count * 50000;
		
		
		count = money / 10000;
		printStr += "만원 " + count + "매, ";
		money -= count * 10000;
		
		count = money / 5000;
		printStr += "오천원 " + count + "매, ";
		money -= count * 5000;
		
		count = money / 1000;
		printStr += "천원 " + count + "매, ";
		money -= count * 1000;
		
		count = money / 500;
		printStr += "500원 " + count + "개, ";
		money -= count * 500;
		
		count = money / 100;
		printStr += "100원 " + count + "개, ";
		money -= count * 100;
		
		count = money / 50;
		printStr += "50원 " + count + "개, ";
		money -= count * 50;
		
		count = money / 10;
		printStr += "10원 " + count + "개> 입니다.";
		money -= count * 10;
		
		System.out.println(printStr);
	}

}
