package Day03.com.test;

//default ���� ������
public class A {
	//�ʵ�� �޼ҵ带 ���� ���� ������ �׽�Ʈ
	//default ���� ������
	int num1 = 1;
	//public ���� ������
	public int num2 = 10;
	//private ���� ������
	private int num3 = 20;
	
	//default ���� ������
	void method1() {}
	//public ���� ������
	public void method2() {}
	//private ���� ������
	private void method3() {}
	
	//�����ڸ� ���� ���� ������ �׽�Ʈ
	//1. public ���� ������
	public A() {
		
	}
	
	//2. default ���� ������
	A(int a) {
		
	}
	
	A(int b, int c) {
		
	}
	
	A(String str1, String str2) {
		
	}
	
	//3. private ���� ������
	private A(String str) {
		
	}
	
}
