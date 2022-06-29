package Day04;

public class _06_inheritTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자식객체 생성
		//SmartPhone 형태이면서 Phone의 형태도 가지고 있음
		SmartPhone smartPhone = new SmartPhone();
		
		//2. 부모객체에 자식객체 삽입
		//자식객체는 부모객체의 형태도 띄고 있기 때문에
		//부모객체의 형태로 형변환이 발생하여 부모객체의 형태로 사용 가능
		Phone phone = (Phone)smartPhone;
		
		//3. 형 변환된 부모객체의 사용
		//부모객체로 형 변환되었기 때문에 자식객체의 멤버는 사용 불가능
		phone.showPrice();
		//phone.showSize();
		
		//자식객체는 자식객체 그대로 사용 가능
		smartPhone.showSize();
	}

}
