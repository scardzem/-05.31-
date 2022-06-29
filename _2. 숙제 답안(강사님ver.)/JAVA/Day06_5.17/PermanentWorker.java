package Day06;

public class PermanentWorker extends Employee{
	double bonus;
	
	public PermanentWorker(int num, String name, double bonus, double pay) {
		super(num, name, pay);
		this.bonus = bonus;
	}
	
	public void ShowEmployeeInfo() {
		super.ShowEmployeeInfo();
		System.out.println("연봉 : " + pay);
		System.out.println("보너스 : " + bonus);
	}
	
	
	public double getMonthPay() {	
		System.out.println("이름 : " + name);
		System.out.println("월급 : " + (pay + bonus) / 12);
		
		return (pay + bonus) / 12 ;
	}
}
