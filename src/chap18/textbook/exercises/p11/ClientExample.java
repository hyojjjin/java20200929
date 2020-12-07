package chap18.textbook.exercises.p11;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;



public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.12", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath =
				""
				
				File file = new File(filePath);
		
		String fileName = file.getName();
		//작성
		
		ㅊ
		
		System.out.println("[파일 보내기 시작]" + fileName);
		//작성
		
		
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		
		
		fis.close();
		os.close();
		socket.close();
		
	}

}
