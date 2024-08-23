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
			
			byte[] data = new byte[1024]; //���� ����Ʈ�� ������ �迭
			/*
			while(true) {
				int num = is.read(data); //���� ����Ʈ ����
				if(num == -1)break; //������ �� ������ while����
				os.write(data,0,num);
				
			}
			*/
			is.transferTo(os); //java 9 �̻󿡼� ����
			
			
			
			os.flush(); //���� ���� �ܷ� ����Ʈ�� ����ϰ� ���� ����
			os.close();
			is.close();
			
			System.out.println("���簡 �Ϸ� �Ǿ����ϴ�.");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
