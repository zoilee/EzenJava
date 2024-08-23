package stream.exam03;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExam {

	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			reader = new FileReader("c:/demo/test.txt");
			while(true) {
				//1. 한문자씩 읽기
				int data = reader.read();
				if(data == -1)break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
		
			//2. 문자 배열로 읽기
			reader = new FileReader("c:/demo/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num;i++) {
					System.out.println(data[i]);
				}
			}
			reader.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
