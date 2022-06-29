package Day07;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _01_OutputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FileOutputStream 객체 생성 시 파일이 저장될 위치와 파일명 지정
		//입출력스트림 사용 시 예외처리 필수로 동반
		OutputStream os = new FileOutputStream("D:/lecture/JAVA/test.db");
		
		byte[] arr = {10, 20, 30};
		
		os.write(arr);
		
		os.flush();
		os.close();
	}

}
