package contentParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;


public class ContentParser {
	
	private String readLine = new String();
	private String wholeText = new String();
	private BufferedReader br = null;
	private int countSentences = 0;
	BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
	
	
	public ContentParser() {
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Dan\\Desktop\\lines.txt"));
			while ((readLine = br.readLine()) != null) {
				if (countSentences <= 199) {
					wholeText = wholeText + "\n" + readLine;
				}
			}

			String[] sentences = wholeText.split("\\.|\\!|\\?");
			ArrayList<String> aLSentences = new ArrayList<String>();
			for (int i = 0; i < sentences.length; i++) {
				if (i < 200) {
					aLSentences.add(sentences[i]);
				}
			}
			
			for (int i = 0; i <aLSentences.size(); i++) {
				String[] singleS = aLSentences.get(i).split("\\s");
				System.out.println(singleS[1]);
				System.out.println(singleS[singleS.length - 1]);
				if (singleS.length < 3) {
					System.out.println(0);
				}
				else {
					System.out.println(singleS.length -3);
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
		new ContentParser();

	}
}
