package Day04;

public class CalMinus extends Calculator {
	int chk;
	//부모의 클래스에 존재하는 메소드를 재정의
	//부모의 클래스에 존재하는 메소드와 형태가 완전 동일
	@Override
	//어노테이션 : 어떤 클래스나 메소드, 또는 필드가
	//    	    어떤 역할을 하는지 등을 컴파일러에게 알려줌
	//          컴파일 속도 향상
	public int calculate(int a, int b) {
		if(chk == 1) {
			return super.calculate(a, b);
		} else {
			return a - b;
		}
	}
	
	@Override
	public int calculate(int a, int b, int c) {
		if(chk == 1) {
			return super.calculate(a, b, c);
		} else {
			return a - b - c;
		}
	}
}
