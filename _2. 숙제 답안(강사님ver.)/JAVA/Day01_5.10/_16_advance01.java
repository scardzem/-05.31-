package Day01;

import java.io.IOException;

public class _16_advance01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*1. 영문자를 입력받습니다
   			 소문자인지 대문자인지 판별하세요 (조건 연산자를 사용하세요)*/
		//입력된 키의 코드값 저장 (삼항조건연산자로 해결)
		int num = System.in.read();
		
		String str = num >= 65 && num <= 90 ? "대문자" : num >= 97 && num <= 122 ? "소문자" : "다시 입력하세요.";
		
		System.out.println(str);
	}

}
