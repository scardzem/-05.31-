package Day03;

public class Tiger extends Cat{
	Tiger() {
		this.race = "호랑이";
		System.out.println("호랑이 생성자 호출");
	}
	
	public void scratch() {
		System.out.println(this.race + "가 할퀸다.");
	}
}
