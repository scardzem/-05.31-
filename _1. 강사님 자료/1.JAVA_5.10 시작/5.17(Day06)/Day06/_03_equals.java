package Day06;

public class _03_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit";
		String str2 = "bit";
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		System.out.println("---------------------------------");
		
		//문자열 비교 시 == 사용하게 될 경우
		//같은 객체를 참조하는 지 비교하게 됨
		if(str1 == str2) {
			System.out.println("같은 문자열 객체 참조");
		} else {
			System.out.println("다른 문자열 객체 참조");
		}
		System.out.println("---------------------------------");
		
		String str3 = new String("bit");
		
		if(str1 == str3) {
			System.out.println("같은 문자열 객체 참조");
		} else {
			System.out.println("다른 문자열 객체 참조");
		}
	}

}
