package Day01;

import java.io.IOException;

public class _17_advance02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*2. 영문자를 입력받습니다
   			 소문자는 대문자로, 대문자는 소문자로 변경해서 출력하세요 
   			(조건 연산자를 사용하세요)
   			(아스키테이블/유니코드테이블을 참조하면 됩니다)*/
		int num = System.in.read();
		
		char ch = num >= 65 && num <= 90 ? (char)(num + 32) : num >= 97 && num <= 122 ? (char)(num - 32) : '-';
		
		System.out.println(ch);
	}

}
