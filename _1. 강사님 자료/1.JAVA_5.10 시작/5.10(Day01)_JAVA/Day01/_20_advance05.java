package Day01;

import java.util.Scanner;

public class _20_advance05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
   			 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요. : ");
		int x = sc.nextInt();
		
		System.out.print("y 값을 입력하세요. : ");
		int y = sc.nextInt();
		
		System.out.print("z 값을 입력하세요. : ");
		int z = sc.nextInt();
		
		String printStr = (x + y > z) && (x + z > y) && (y + z > x) ? "삼각형 가능" : "삼각형 불가능"; 
		
		System.out.println(printStr);
	}

}
