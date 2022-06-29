package Day03;

public class Mammal {
	String race;
	
	Mammal() {
		System.out.println("포유류 생성자 호출");
	}
	
	public void calve() {
		System.out.println(race + "가(이) 새끼를 낳는다");
	}
}
