package Day03;

public class Cat extends Mammal{
	Cat() {
		//super.Mammal();
		this.race = "����̰�";
		System.out.println("����̰� ������ ȣ��");
	}
	
	public void howling() {
		System.out.println(this.race + "��(��) �Ͽ︵�� �Ѵ�.");
	}
}
