package Day06;

public class ContractWorker extends Employee {
	int workday; // �������� �Ѵ� ���� Ƚ��
	
	public ContractWorker(int num, String name, double pay, int workday) {
		super(num, name, pay);
		this.workday=workday;
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("�ϱ� : " + pay);
		System.out.println("���� �ϼ� : " + workday);
	}
	
	public double getMonthPay() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + pay * workday);
	
		return pay * workday ;
	}	
}
