package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {

	private long id;
	private String title;
	private String genre;
	
	private static final File file = new File("src/movie/movies.txt");
	
	public Movie(String title, String genre) {
		this.id = Instant.now().getEpochSecond();
		this.title = title;
		this.genre = genre; 
	}
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre; 
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true); // true -> append (추가)
		
		fw.write(this.toFileString() + "\n");
		fw.close();
	}
	
	
	
	private String toFileString() {
		
		return String.format("%d,%s,%s", id,title,genre);
	}

	public static ArrayList<Movie> finAll() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		BufferedReader br = null;
		String line = null;
		
		
		try {
			
			br = new BufferedReader (new FileReader(file));
			
			while( (line = br.readLine()) != null) {
			
				
				String[] temp = line.split(",");
				
				Movie movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				
				movies.add(movie);
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	return movies;
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)", id, title, genre);
	}
}
