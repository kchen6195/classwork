import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HighScore {

	public static void main(String[] args) 
	{
		List<Book> books = readBooksFromCSV("books.csv");
		
		for(Book b: books)
		{
			System.out.println(b);
		}
	}
	private static List<Book> readBooksFromCSV(String fileName)
	{
		List<Book> scores = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while(line!= null)
			{
				  String[] attributes = line.split(",");
				  
				  Score score = createScore(attributes);
	                scores.add(score);
	                line = br.readLine();
	               

			}
		 } catch (IOException ioe) {
			  ioe.printStackTrace();
		 
		}
		 return scores;
	}
	private static Score createScore(String[] metadata) {
		 String name = metadata[0];
		 int score = Integer.parseInt(metadata[1]);
		  return new Score(name, score);

	}
}
class Score {
	 private String name;
	 private int score;
	 
	 public Score(String name, int score) {
		 this.name = name;
		   this.score = score;
}
	    public String getName() {
	    	   return name;
	    }
	    public void setName(String name) { 
	    	 this.name = name;
	    }
	    public int getScore() {
	    	return score;
	    }
	    public void setPrice(int score) {
	    	this.score = score;
	    	
	    }
	    @Override
	    public String toString()
	    {
	    	return "Book [name=" + name + ", Score=" + score  + "]";
	    }
}



