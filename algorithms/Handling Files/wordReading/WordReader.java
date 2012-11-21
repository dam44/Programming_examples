package wordReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordReader {

	String readWord = new String();
	public WordReader() {
		BufferedReader br = null;
		int count = 0;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Dan\\Desktop\\words.txt"));
			while ((readWord = br.readLine()) != null) {
				if (count < 10) {
				System.out.println(readWord);
				count++;
				}
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (br != null)br.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new WordReader();

	}

}
