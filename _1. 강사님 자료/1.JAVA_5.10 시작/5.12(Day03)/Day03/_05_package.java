package Day03;

import java.util.Scanner;

//같은 패키지내의 클래스 아닐 경우 import구문 사용
//import구문 사용 시 명확히 사용할 클래스를 지정하거나
import Day03.com.test.test;
//패키지내의 모든 클래스를 지정할 수 있다.
//import Day03.com.test.*;
//import 단축키 ctrl + shif + o

public class _05_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test.num);
		
		Scanner sc = new Scanner(System.in);
	}

}
