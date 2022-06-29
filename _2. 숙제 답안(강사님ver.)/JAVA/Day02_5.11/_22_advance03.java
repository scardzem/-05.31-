package Day02;

public class _22_advance03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.*/
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				int numAB = a * 10 + b;
				int numBA = b * 10 + a;
				if (numAB + numBA == 99) {
					System.out.println("A는  " + a + ", B가 : " + b + "일 때");
				}
			}
		}
	}

}
