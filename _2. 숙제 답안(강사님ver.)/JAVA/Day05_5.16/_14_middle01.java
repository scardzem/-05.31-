package Day05;

import java.util.Scanner;

public class _14_middle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calc[] calc = new Calc[4];
		calc[0] = new Add();
		calc[1] = new Sub();
		calc[2] = new Mul();
		calc[3] = new Div();
		
		System.out.print("정수를 입력하세요.");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 선택(+ - * /)");
		String op = sc.nextLine();
		System.out.print("정수를 입력하세요.");
		int b = Integer.parseInt(sc.nextLine());
		
		switch(op) {
			case "+" :
				calc[0].setValue(a, b);
				System.out.println(a +  " + " + b + " = " + calc[0].calculate());
				break;
			case "-" :
				calc[1].setValue(a, b);
				System.out.println(a +  " - " + b + " = " + calc[1].calculate());
				break;
			case "*" :
				calc[2].setValue(a, b);
				System.out.println(a +  " * " + b + " = " + calc[2].calculate());
				break;
			case "/" :
				calc[3].setValue(a, b);
				System.out.println(a +  " / " + b + " = " + calc[3].calculate());
				break;
		}
	}

}
