package chap18.lecture.filterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
//		fos.write('한');
		//char은 2byte. write는 4 바이터를 갖지만 그 중 읽을 수 있는 건 1 바이트라 문제가 생김.
		
		osw.write('한');
		
		osw.close();
		fos.close();
	}
}
