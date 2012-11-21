package simpleFileParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileParser {

	private String readLine = new String();
	private BufferedReader br = null;
	private int count = 0;
	private int newLineCount = 0;
	
	public SimpleFileParser() {
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Dan\\Desktop\\lines.txt"));
			while ((readLine = br.readLine()) != null) {
				if (count < 20) {
					readLine = readLine.replaceAll("[\\p{Punct}|\\d]", "");
					String[] splits = readLine.split("\\s");
					String[] newLines = readLine.split("\\n");
					if (newLineCount < splits.length) {
					for (String words: newLines) {
						newLineCount++;
					}
					System.out.println(splits[newLineCount-1]);
					}
					else {
						System.out.println(splits[splits.length-1]);
					}
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
		new SimpleFileParser();

	}

}
