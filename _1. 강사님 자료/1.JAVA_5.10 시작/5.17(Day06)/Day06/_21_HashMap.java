package Day06;

import java.util.HashMap;
import java.util.Map;

public class _21_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<키 값의 타입, 밸류 값의 타입>
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id", "bit");
		map.put("pw", "1111");
		map.put("name", "bit1");
		map.put("email", "aaa@naver.com");
		/*
			map
			{
				"id" : "bit",
				"pw" : "1111",
				"name" : "bit1",
				"email" : "aaa@naver.com"				
			}
		*/
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		
		System.out.println("저장된 객체의 총 개수 : " + map.size());
		
		map.remove("name");
		System.out.println("저장된 객체의 총 개수 : " + map.size());
	}

}
