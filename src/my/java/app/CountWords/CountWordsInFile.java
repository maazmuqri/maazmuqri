package my.java.app.CountWords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CountWordsInFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		ArrayList <String> wordlist = new ArrayList<String>();
		try {
			
			ResourceBundle resourceBundle= ResourceBundle.getBundle("inputFile");
		    BufferedReader bufferInput = new BufferedReader(new FileReader (resourceBundle.getString("filename")));
		    String strLine;
		    String word ="";
		    while ((strLine = bufferInput.readLine()) !=null)
		    {
		    	for(int i=0; i<strLine.length(); i++)
		    	{
		    		if(strLine.charAt(i) != ' ')
		    		{
		    			word=word+strLine.charAt(i);	
		    		}
		    		else if( i == (strLine.lastIndexOf(strLine)))
		    		{
		    			word=word+strLine.charAt(i);
		    			wordlist.add(word);
		    			
		    			System.out.println("Hi...");
		    		}
		    		else
		    		{
		    			//word=word+strLine.charAt(i);
		    			wordlist.add(word);
		    			word="";
		    		}
		    	}
		    }
		    System.out.println(wordlist);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
