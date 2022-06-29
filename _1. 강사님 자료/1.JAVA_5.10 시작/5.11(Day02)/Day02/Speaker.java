package Day02;

public class Speaker {
	int volumn = 0;
	
	void volumnUp() {
		volumn++;
		System.out.println("볼륨을 " + volumn + "으로 올립니다.");
	}
	
	void volumnDown() {
		volumn--;
		System.out.println("볼륨을 " + volumn + "으로 줄입니다.");
	}
}
