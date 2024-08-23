package stream.exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExam {

	public static void main(String[] args) {
		String oFilePath = "c:/demo/img01.jpg";
		String nFilePath = "c:/demo/newImg01.jpg";
		String oFilePath2 = "c:/demo/img02.jpg";
		String nFilePath2 = "c:/demo/newImg02.jpg";
		

		
		try {
			
			//입출력 스트림 생성
			
			
			FileInputStream fis = new FileInputStream(oFilePath);
			FileOutputStream fos = new FileOutputStream(nFilePath);
			
			//입출력 스트림에 버퍼 스트림 생성
			FileInputStream fis2 = new FileInputStream(oFilePath2);
			FileOutputStream fos2 = new FileOutputStream(nFilePath2);
			
			BufferedInputStream bis = new BufferedInputStream(fis2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			
			//버퍼를 사용하지 않고 복사
			long nonBufferTime = copy(fis, fos);
			System.out.println("버퍼 미사용 : "+nonBufferTime + "ns" );
			
			//버퍼를 사용해서 복사
			long bufferTime = copy(bis, bos);
			System.out.println("버퍼 사용 : "+bufferTime + "ns" );
			
			fis.close();
			fos.close();
			fis2.close();
			fos2.close();
			bis.close();
			bos.close();
			
			
		} catch (IOException e) {

			e.printStackTrace();
		} 
	}
	public static long copy(InputStream is, OutputStream os) throws IOException{
		//시작 시간 저장
		long start = System.nanoTime();
		
		//1바이트를 읽고 1타이트를 출력
		while(true) {
			int data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		os.flush();
		//끝난 시간 저장
		long end = System.nanoTime();
		//복사하는데 걸린 시간 리턴
		return (end - start);
	}
}
