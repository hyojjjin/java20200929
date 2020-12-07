package chap18.textbook.s180405;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = is.read(readBytes)) != -1) {
			//read is 파일에 있는 것을 읽어서 배열 readBytes에 적는다.
		
			os.write(readBytes, 0, readByteNo);
		}
		
		
		os.flush();
		is.close();
		os.close();
		//Reader, Writer 사용해서 파일 복사
		
		System.out.println("복사가 잘 되었습니다.");
		
	}

}
