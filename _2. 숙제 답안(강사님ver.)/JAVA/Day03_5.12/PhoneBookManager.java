package Day03;

import java.util.Scanner;

public class PhoneBookManager {
	public static PhoneInfo phoneInfo = new PhoneInfo();
	public static String name;
	public static String phoneNumber;
	public static String birthDay;
	
	public static void showMenu() {
		System.out.println("--선택하세요--");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
	}
	
	public static void readData() {
		phoneInfo.name = name;
		phoneInfo.phoneNumber = phoneNumber;
		phoneInfo.birthDay = birthDay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			showMenu();
			
			System.out.print("선택 : ");
			String chk = sc.nextLine();
			
			if(chk.equals("2")) {
				break;
			} else if(!chk.equals("1")) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			System.out.print("이름 입력 : ");
			name = sc.nextLine();
			System.out.print("전화번호 입력 : ");
			phoneNumber = sc.nextLine();
			System.out.print("생년월일 입력 : ");
			birthDay = sc.nextLine();
			
			System.out.println("----------------------------------");
			
			readData();
			
			phoneInfo.showPhoneInfo();
		}
	}

}
