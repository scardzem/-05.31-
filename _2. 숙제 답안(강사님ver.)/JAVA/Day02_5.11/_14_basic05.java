package Day02;

public class _14_basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. 1부터 10까지 곱해서 
			 그 결과를 출력하는 프로그램을 작성하세요*/
		int result = 1;
		
		for(int i = 1; i <= 10; i++) {
			result *= i;
		}
		
		System.out.println("결과 값은 : " + result);
	}

}
