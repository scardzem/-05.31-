package Day07;

import java.io.Writer;
import java.io.FileWriter;

public class _03_Writer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("D:/lecture/JAVA/test.txt");
		
		String str = "hello java";
		
		writer.write(str, 6, 4);
		
		writer.flush();
		writer.close();
	}

}
