package Day03;

public class SamsungTv extends Tv {
	String ai;
	
	SamsungTv(String com, int pri, int si, String a) {
		this.company = com;
		this.price = pri;
		this.size = si;
		this.ai = a;
	}
	
	void turnOnAi() {
		System.out.println("«œ¿Ã ∫ÚΩ∫∫Ò");
	}
}
