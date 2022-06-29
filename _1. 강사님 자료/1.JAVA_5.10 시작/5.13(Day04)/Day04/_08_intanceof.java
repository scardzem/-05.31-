package Day04;

public class _08_intanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp1 = new SmartPhone();
		
		//부모객체에 자식객체를 삽입할 때는 
		//부모객체의 형태에 자식객체의 형태가 숨겨진 상태로 생성됨
		Phone p1 = sp1;
		
		//부모객체의 형태로만 생성됨
		Phone p2 = new Phone();
		
		//p1은 자식객체의 형태가 숨겨진 상태이기 때문에
		//자식객체로의 형변환 가능
		if(p1 instanceof SmartPhone) {
			System.out.println("스마트폰의 형태입니다.");
		} else {
			System.out.println("스마트폰의 형태가 아닙니다.");
		}
		System.out.println("-------------------------------");
		
		//p2는 부모객체의 형태만 가지고 있기 때문에 자식객체로의 형변환 불가능
		if(p2 instanceof SmartPhone) {
			System.out.println("스마트폰의 형태입니다.");
		} else {
			System.out.println("스마트폰의 형태가 아닙니다.");
		}
		System.out.println("-------------------------------");
		
		SmartPhone sp2 = (SmartPhone)p1;
		
		if(sp2 instanceof SmartPhone) {
			System.out.println("스마트폰의 형태입니다.");
		} else {
			System.out.println("스마트폰의 형태가 아닙니다.");
		}
	}

}
