package Day03;

//LgTv클래스이면서 Tv클래스의 형태도 포함
public class LgTv extends Tv{
	String voiceCall;
	//Tv 클래스를 상속받아 아래의 필드 포함
	/*
	 * String company;
		int price;
		int size;
	*/
	
	LgTv(String com, int pri, int si, String voice) {
		this.company = com;
		this.price = pri;
		this.size = si;
		this.voiceCall = voice;
	}
	
	void turnVoiceCall() {
		System.out.println("헬로우 구글");
	}
}
