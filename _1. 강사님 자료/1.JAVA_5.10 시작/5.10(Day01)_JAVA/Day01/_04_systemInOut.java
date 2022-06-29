package Day01;

import java.io.IOException;

public class _04_systemInOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 시스템 출력
		String str1 = "hello java";
		int num1 = 10;
		
		//줄 바꿈없이 출력
		System.out.print(str1);
		//출력 후 줄바꿈
		System.out.println(str1);
		//형식문자열을 이용한 출력
		System.out.printf("%d\n", num1);
		System.out.printf("%s", str1);
	}

}
