package chap18.textbook.exercises.p07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class AddlineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로를 수정하세요.

		String filePath = "src/chap18/textbook/exercises/p07/AddlineNumberExample.java";

		// 작성 위치

//		FileInputStream fis = new FileInputStream(filePath);
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		String data;
		int a = 0;
//			byte[] readBytes = new byte[101];
		while ((data = br.readLine()) != null) {
			a++;
//				System.out.println(a + ": " + (char)data);
			System.out.println(a + ": " + data);
		}

		br.close();
		fr.close();

	}
}
//
//}
//
//
//int readByteNo;
//
//byte[] readBytes = new byte[100];
//while((readByteNo = fis.read(readBytes)) != -1) {
//	fos.write(readBytes, 0, readByteNo);
//}
//
//fos.flush();
//fos.close();
//fis.close();
//모르겠엉.
