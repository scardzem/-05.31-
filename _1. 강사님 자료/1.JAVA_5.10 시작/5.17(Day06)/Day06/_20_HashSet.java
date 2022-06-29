package Day06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _20_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		//�ߺ��� ���� �ȵ�
		set.add("java");
		set.add("MyBatis");
		
		
		System.out.println("�� ��ü �� : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str1 = iterator.next();
			if(str1.equals("MyBatis")) {
				System.out.println(str1);
			}
		}
		
		set.remove("JDBC");
		
		System.out.println("�� ��ü �� : " + set.size());
		
		iterator = set.iterator();
		for(String str : set) {
			System.out.println(str);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��� ����");
		} else {
			System.out.println("��� ���� ����");
		}
	}

}
