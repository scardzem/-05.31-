package Day03;

public class Cat extends Mammal{
	Cat() {
		//super.Mammal();
		this.race = "고양이과";
		System.out.println("고양이과 생성자 호출");
	}
	
	public void howling() {
		System.out.println(this.race + "가(이) 하울링을 한다.");
	}
}
