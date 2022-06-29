package Day02;

//1. 클래스 생성(객체의 설계도 만듬)
public class Tv {
	//객체의 속성 값들
	String company = "Samsung";
	int price;
	int size = 47;
	int weight = 2000;
	Speaker speaker = new Speaker();
	
	//기본 생성자 메소드 생략되어 있는 상태로 클래스가 만들어짐	
	//생성자 메소드에서 객체 속성 값들을 초기화 가능
	public Tv() {
		company = "LG"; 
		price = 30000000;
		System.out.println("Tv 객체 생성");
	}
	
	//사용자 정의 생성자 메소드
	//전달받은 인자 값으로 속성 값을 초기화할 수 있다.
	public Tv(String com, int pri) {
		company = com;
		price = pri;
		System.out.println("사용자 정의 생성자 호출");
	}
	
	public Tv(String com, int pri, int si) {
		this(com, pri);
		System.out.println("사용자 정의 생성자2 호출");
	}
	
	//객체의 동작들 == 메소드
	void turnOn() {
		System.out.println("전원을 켠다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끈다.");
	}
	
	void changChannel() {
		System.out.println("채널을 변경한다.");
	}
	
//	void changeVolumn() {
//		System.out.println("볼륨을 조절한다.");
//	}
	
	void volumnUp() {
		speaker.volumnUp();
	}
	
	void volumnDown() {
		speaker.volumnDown();
	}
}
