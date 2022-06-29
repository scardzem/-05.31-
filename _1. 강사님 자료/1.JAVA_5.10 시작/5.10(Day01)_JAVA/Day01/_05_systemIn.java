package Day01;

import java.io.IOException;

public class _05_systemIn {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//2. 시스템 입력
		int keyCode;
		
		//반복문 괄호안의 내용이 참이면 계속 반복
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			//입력된 키코드 값이 소문자 q일 때 반복문 종료
			if(keyCode == 113) {
				break;
			}
		}
	}

}
