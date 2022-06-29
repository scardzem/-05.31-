package Day06;

public class ContractWorker extends Employee {
	int workday; // 비정규직 한달 일한 횟수
	
	public ContractWorker(int num, String name, double pay, int workday) {
		super(num, name, pay);
		this.workday=workday;
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("일급 : " + pay);
		System.out.println("일한 일수 : " + workday);
	}
	
	public double getMonthPay() {
		System.out.println("이름 : " + name);
		System.out.println("월급 : " + pay * workday);
	
		return pay * workday ;
	}	
}
