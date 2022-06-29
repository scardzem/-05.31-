package Day04;

public class _01_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungTv samsungTv = new SamsungTv();
		System.out.println("------------------------------");
		
		//protected로 선언된 필드나 메소드는
		//같은 패키지내의 클래스에서 사용가능
		Tv tv = new Tv();
		tv.company = "제조사없음";
		System.out.println(tv.company);
	}

}
