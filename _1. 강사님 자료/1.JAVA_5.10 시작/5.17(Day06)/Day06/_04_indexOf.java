package Day06;

public class _04_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello java";
		String str2 = "hello python";
		
		if(str1.indexOf("java") != -1) {
			System.out.println(str1.indexOf("java"));
			System.out.println("�ش� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
		System.out.println("-------------------------------------");
		
		if(str2.indexOf("java") != -1) {
			System.out.println(str1.indexOf("java"));
			System.out.println("�ش� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}
	}

}
