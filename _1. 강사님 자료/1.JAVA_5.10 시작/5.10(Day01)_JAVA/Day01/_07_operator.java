package Day01;

public class _07_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���������
		int num1 = 10;
		int num2 = 3;
		
		//num1�� num2 ���� ���� ���
		int result1 = num1 + num2;
		System.out.println("num1 + num2 = " + result1);
		System.out.println("-----------------------------");
		
		//num1�� num2 ���� ���� ���
		result1 = num1 - num2;
		System.out.println("num1 - num2 = " + result1);
		System.out.println("-----------------------------");
		
		//num1�� num2 ���� ���� ���
		result1 = num1 * num2;
		System.out.println("num1 * num2 = " + result1);
		System.out.println("-----------------------------");
		
		//num1�� num2 ������ ���� ���
		result1 = num1 / num2;
		System.out.println("num1 / num2 = " + result1);
		System.out.println("-----------------------------");
		
		//num1�� num2 ������ ���� ���
		//num1�� num2�� ���� ������ ǥ��
		result1 = num1 % num2;
		System.out.println("num1 % num2 = " + result1);
		System.out.println("-----------------------------");
		
		//2. ��ȣ������
		int num3 = 10;
		//������ �Ǽ��� ��ȣ�� ������ �� ���
		int num4 = -num3;
		System.out.println(num4);
		System.out.println("-----------------------------");
		
		//3. ���ڿ� ���� ������
		String str1 = "hello ";
		String str2 = "java";
		//+�����ڸ� �̿��Ͽ� �� ���� ���ڿ��� �ϳ��� ���ڿ��� ��ħ
		System.out.println(str1 + str2);
		
		//4. ���Կ�����
		int num5 = 10;
		int num6 = 3;
		
		//num5�� num5�� num6�� ���� ���� ����
		num5 += num6;
		//num5 == 13
		System.out.println(num5);
		System.out.println("-----------------------------");
		
		//num5�� num5�� num6�� �� ���� ����
		//13 - 3
		num5 -= num6;
		//num5 = 10
		System.out.println(num5);
		System.out.println("-----------------------------");
		
		//num5�� num5�� num6�� ���� ���� ����
		//10 * 3
		num5 *= num6;
		//num5 = 30
		System.out.println(num5);
		System.out.println("-----------------------------");
		
		//num5�� num5�� num6�� ���� ���� ����
		//30 / 3
		num5 /= num6;
		//num5 = 10
		System.out.println(num5);
		System.out.println("-----------------------------");
		
		//num5�� num5�� num6�� ���� ������ ���� ����
		//10 % 3
		num5 %= num6;
		//num5 = 1
		System.out.println(num5);
		System.out.println("-----------------------------");
		
		//4. ����������
		//++ : �ش� ������ 1������Ų ���� ����
		//-- : �ش� ������ 1���ҽ�Ų ���� ����
		//���� ����������
		//����� ����Ǳ� ���� ������ ����ȴ�
		int num7 = 100;
		//num7 = 101
		System.out.println(++num7);
		//num7 = 100
		System.out.println(--num7);
		System.out.println("-----------------------------");
		
		//���� ����������
		//����� ����ǰ� �� �� ������ ����ȴ�
		//num7 = 100
		System.out.println(num7++);
		//num7 = 101
		System.out.println(num7--);
		//num7 = 100
		System.out.println(num7);
		System.out.println("-----------------------------");
		
		//5. �񱳿�����
		//�񱳿����ڴ� �� ���� ���� ���Ͽ� true, false�� �����ϴ� ������
		int num8 = 10;
		int num9 = 20;
		
		//�񱳿����ڿ� ������ ���� �����ִ� ����� �ǿ����ڰ� ��
		//num8 < num9 : num8�� num9���� ���� ���� ��
		// == : ���� ������ ��
		boolean result2 = num8 == num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// < : ���� ������ ��
		result2 = num8 < num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// > : ū ������ ��
		result2 = num8 > num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// <= : �۰ų� ���� ������ ��
		result2 = num8 <= num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// >= : ũ�ų� ���� ������ ��
		result2 = num8 >= num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// != : �ٸ� ������ ��
		result2 = num8 != num9;
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		//6. ��������
		// && : �� ���� ��� true���� true ����(AND ����)
		result2 = (num8 < 30) && (num9 < 20);
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		result2 = (num8 < 30) && (num9 < 30);
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// || : �� ���� �ϳ��� true���� true ����(OR ����)
		result2 = (num8 < 30) || (num9 < 20);
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		// ! : ���� �� ���� �ݴ� ��(NOT ����)
		result2 = !(num8 < 30);
		System.out.println(result2);
		System.out.println("-----------------------------");
		
		//7. ���� �񱳿�����
		//?���� ���� ���¿� ���� ���� ������
		//?���� ������ true�� ��� :�� ���� ��
		//?���� ������ false�� ��� :�� ������ ��
		int result3 = (10 > 30) ? 100 : -100;
		System.out.println(result3);
		System.out.println("-----------------------------");
	}

}
