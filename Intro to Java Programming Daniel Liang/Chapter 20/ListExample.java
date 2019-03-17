package chapter20;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		// Create an array list of favorite movies
		ArrayList<String> favoriteMovies = new ArrayList<>();
		String movieString;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of movies to insert in list: ");
		
		int numberOfMovies = scanner.nextInt();
		scanner.nextLine(); // Throw away the '\n' from the line that contained the list
		
		System.out.println();
		
		for(int i = 0; i < numberOfMovies; i++) {
			System.out.print("Enter movie: ");
			movieString = scanner.nextLine();
			
			// Insert into the list
			favoriteMovies.add(movieString);
			
		}
		
		scanner.close();
		
		System.out.println(); // blank space
		
		System.out.println("Favorite movies are: ");
		
		for(int j = 0; j < numberOfMovies; j++) {
			String movieTitle = favoriteMovies.get(j);
			
			System.out.println(movieTitle);
			
		}
		
	}

}
