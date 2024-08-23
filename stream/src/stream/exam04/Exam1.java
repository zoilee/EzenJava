package stream.exam04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam1 {

	public static void main(String[] args) {
		try {
			Reader reader = null;
			Writer writer = new FileWriter("c:/demo1/demo1.txt");
			String str = "This is a simple text written to a file";
			char[] data = new char[100];
			writer.write(str);
			writer.flush();
			writer.close();
			
			reader = new FileReader("c:/demo1/demo1.txt");
			while(true) {
				int num = reader.read(data);
				if(num == -1)break;
				for(int i=0; i<num;i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			System.out.println("");
			System.out.println("++++++++++++++++++++++++++++");
			reader = new FileReader("c:/demo1/demo2.txt");
			while(true) {
				int num = reader.read(data);
				if(num == -1)break;
				for(int i=0;i<num;i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
