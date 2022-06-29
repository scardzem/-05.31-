package Day07;

import java.io.FileInputStream;
import java.io.InputStream;

public class _02_InputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("D:/lecture/JAVA/test.db");
		
		while(true) {
			int data = is.read();
			
			//read() 메소드가 -1 반환 시
			//파일의 끝에 도달
			if(data == -1) {
				break;
			}
			
			System.out.println(data);
		}
		
		is.close();
	}

}
