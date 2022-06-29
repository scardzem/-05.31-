package Day04;

//Taxi는 Vihicle를 상속받았기 때문에
//Taxi의 형태이면서 Vihicle의 형태도 가지고 있음
public class Taxi extends Vihicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
