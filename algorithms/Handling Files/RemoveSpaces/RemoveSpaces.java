package RemoveSpaces;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveSpaces {
	
	private String readWord = new String();
	private ArrayList<String> wordList = new ArrayList<String>();
	
	public RemoveSpaces(){
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {

			br = new BufferedReader(new FileReader("C:\\Users\\Dan\\Desktop\\somewords.txt"));
			while ((readWord = br.readLine()) != null) {
				readWord = readWord.replaceAll("\\s", "");
				wordList.add(readWord);
			}
			Collections.sort(wordList);
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Dan\\Desktop\\4letterwords2.txt"));
			for (String word: wordList) {
				bw.write(word);
				bw.newLine();
			}
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if (br != null)br.close();
				if (bw != null)bw.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
	
	
	public static void main(String[] args) {
		new RemoveSpaces();
	}
	
	
}
