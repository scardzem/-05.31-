package Day06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _15_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util 패키지는 java.lang패키지와 다르게
		//기본제공되지 않으므로 import 필요
		Date now = new Date();
		
		//출력형식 지정 시 각각 년, 월, 일, 시, 분, 초에 맞는 형식으로 지정해야 된다.
		//년 -> yyyy
		//월 -> MM
		//일 -> dd
		//시 -> hh
		//분 -> mm
		//초 -> ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println("현재 날짜와 시간은 : " + sdf.format(now));
		//Date객체를 .toString()으로 문자열 치환 시 날짜와 시간을 영문으로 표시
		System.out.println(now.toString());
	}

}
