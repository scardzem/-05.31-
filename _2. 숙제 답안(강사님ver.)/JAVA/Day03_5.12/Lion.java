package Day03;

public class Lion extends Cat{
	Lion() {
		this.race = "사자";
		System.out.println("사자 생성자 호출");
	}
	
	public void hunt() {
		System.out.println(this.race + "가 사냥을 한다.");
	}
}
