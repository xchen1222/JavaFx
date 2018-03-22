import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class CSVReaderInJava {

	public static void main(String[] args) {
		//List<Book> books = readBooksFromCSV()
	}
	
	private static List<Book> readBooksFromCSV(String fileName){
		List<Book> books = new ArrayList<>() ; 
		Path pathtoFile = Paths.get(fileName) ; 
	
	try(BufferedReader br = Files.newBufferedReader(pathToFile,
			StandardCharsets.US_ASCII)) { 
		String line = br.readLine() ; 
		
		while (line != null) {
			
			String[] attributes = line.split(",") ; 
			
			Book book = createBook(attributes) ; 
			
			books.add(book) ;
			
			line = br.readLine(); 
			
		}
	} 
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}