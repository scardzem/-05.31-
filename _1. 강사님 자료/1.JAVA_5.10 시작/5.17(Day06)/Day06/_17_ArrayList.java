package Day06;

import java.util.ArrayList;
import java.util.List;

public class _17_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		//list = ["java", "JDBC", "Servlet/JSP"];
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		//List는 배열과 다르게 끼어넣는 형식의 객체 추가
		//list = ["java", "JDBC", "DataBase", "Servlet/JSP"];
		//int[] intArr = [1, 2, 3];
		//intArr[1] = 4;
		//intArr = [1, 4, 3];
		list.add(2, "DataBase");
		list.add("MyBatis");
		
		System.out.println("ArrayList list의 사이즈는 : " + list.size());
		System.out.println("------------------------------------\n");
		
		String str = list.get(2);
		System.out.println(str);
		System.out.println("------------------------------------\n");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 째에 저장된 객체 : " + list.get(i));
		}
		System.out.println("------------------------------------\n");
		
		list.remove(2);
		System.out.println("ArrayList list의 사이즈는 : " + list.size());
		System.out.println("------------------------------------\n");		
	}

}
