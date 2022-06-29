package Day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _22_List_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id", "bit");
		map.put("pw", "1111");
		map.put("name", "bit1");
		map.put("email", "aaa@naver.com");
		
		listMap.add(map);
		
		map = new HashMap<String, String>();
		
		map.put("id", "java");
		map.put("pw", "2222");
		map.put("name", "bit2");
		map.put("email", "bbb@naver.com");
		
		listMap.add(map);
		/*
			list
			{
				{
					"id" : "bit",
					"pw" : "1111",
					"name" : "bit1",
					"email" : "aaa@naver.com"	
				},
				{
					"id" : "java",
					"pw" : "2222",
					"name" : "bit2",
					"email" : "bbb@naver.com"	
				}
			}
		*/
		for(int i = 0; i < listMap.size(); i++) {
			System.out.println(listMap.get(i).get("id"));
		}
	}

}
