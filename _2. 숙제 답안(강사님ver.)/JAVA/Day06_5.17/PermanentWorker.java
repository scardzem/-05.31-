package Day06;

public class PermanentWorker extends Employee{
	double bonus;
	
	public PermanentWorker(int num, String name, double bonus, double pay) {
		super(num, name, pay);
		this.bonus = bonus;
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("���� : " + pay);
		System.out.println("���ʽ� : " + bonus);
	}
	
	
	public double getMonthPay() {	
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + (pay + bonus) / 12);
		
		return (pay + bonus) / 12 ;
	}
}
