package stream.exam03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam {
	public static void main (String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/demo/test.txt");
		
			//1. 1문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			char c = 'C';
			writer.write(c);
			
			//2. 배열출력
			
			char[] arr = {'D','E','F'};
			writer.write(arr);
			
			//3. 문자열을 출력
			writer.write("홍길동");
			writer.write("FGH");
			
			//버퍼 지움
			writer.flush();
			
			//메모리 해제
			writer.close();
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
