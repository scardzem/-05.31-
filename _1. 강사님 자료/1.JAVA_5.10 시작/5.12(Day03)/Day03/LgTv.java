package Day03;

//LgTvŬ�����̸鼭 TvŬ������ ���µ� ����
public class LgTv extends Tv{
	String voiceCall;
	//Tv Ŭ������ ��ӹ޾� �Ʒ��� �ʵ� ����
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
		System.out.println("��ο� ����");
	}
}
