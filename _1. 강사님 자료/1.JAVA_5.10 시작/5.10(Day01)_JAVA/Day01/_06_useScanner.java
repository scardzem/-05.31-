package Day01;

import java.util.Scanner;

public class _06_useScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Scanner Ŭ���� ���
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while(true) {
			//���� �� �������� �Է°��� ���ڿ��� ����
			inputData = sc.nextLine();
			System.out.println(inputData);
			
			//���ڿ� �񱳴� equals �޼ҵ� ���
			if(inputData.equals("q")) {
				break;
			}
		}
	}

}
