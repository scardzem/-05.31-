package Day04;

public abstract class Phone {
	int price;
	
	Phone(int price) {
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println("������ : " + this.price);
	}
	
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
