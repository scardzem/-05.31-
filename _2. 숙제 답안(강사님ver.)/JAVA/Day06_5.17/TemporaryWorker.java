package Day06;

public class TemporaryWorker extends Employee {//�ӽ���
	double pay;
	
	public TemporaryWorker(int num, String name, double pay) {
		super(num, name, pay);
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("���� : " + pay);
	}
	
	public double getMonthPay() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + pay / 12);
		return pay / 12;
	}
	
	
}