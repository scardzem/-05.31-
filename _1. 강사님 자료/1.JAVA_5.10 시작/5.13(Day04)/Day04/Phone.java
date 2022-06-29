package Day04;

public abstract class Phone {
	int price;
	
	Phone(int price) {
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println("가격은 : " + this.price);
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
