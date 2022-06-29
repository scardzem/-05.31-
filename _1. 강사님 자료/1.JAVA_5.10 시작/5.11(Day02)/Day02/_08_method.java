package Day02;

public class _08_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		int result;
		double result2;
		
		result = cal.add(10, 3);
		System.out.println("10 + 3의 결과 : " + result);
		
		result2 = cal.devide(10, 3);
		System.out.println("10 / 3의 결과 : " + result2);
		
		int[] scores = {100, 85, 75};
		int result3;
		//배열을 sum 메소드의 매개변수로 전달
		result3 = cal.sum(scores);
		System.out.println("점수의 총 합은 : " + result3);
	}
}
