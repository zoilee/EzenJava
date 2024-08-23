package stream.exam03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam {
	public static void main (String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/demo/test.txt");
		
			//1. 1���ھ� ���
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			char c = 'C';
			writer.write(c);
			
			//2. �迭���
			
			char[] arr = {'D','E','F'};
			writer.write(arr);
			
			//3. ���ڿ��� ���
			writer.write("ȫ�浿");
			writer.write("FGH");
			
			//���� ����
			writer.flush();
			
			//�޸� ����
			writer.close();
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
