package Day04;

public class SmartPhone extends Phone {
	int size;
	
	SmartPhone(int price) {
		super(price);
	}
	
	public void showSize() {
		System.out.println("Å©±â´Â : " + this.size);
	}
}
