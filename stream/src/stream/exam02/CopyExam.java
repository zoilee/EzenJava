package stream.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {

	public static void main(String[] args) {

		String oFilename = "c:/demo/img01.jpg";
		String nFilename = "c:/demo/nimg001.jpg";
		
		try {
			InputStream is = new FileInputStream(oFilename);
			OutputStream os = new FileOutputStream(nFilename);
			
			byte[] data = new byte[1024]; //읽은 바이트를 저장할 배열
			/*
			while(true) {
				int num = is.read(data); //읽은 바이트 리턴
				if(num == -1)break; //파일을 다 읽으면 while종료
				os.write(data,0,num);
				
			}
			*/
			is.transferTo(os); //java 9 이상에서 가능
			
			
			
			os.flush(); //내부 버퍼 잔류 바이트를 출력하고 버퍼 삭제
			os.close();
			is.close();
			
			System.out.println("복사가 완료 되었습니다.");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
