import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String ans;
		do {
			Movie a = new Movie();
			System.out.println("Enter the title of a movie");
			a.setTitle(keyboard.nextLine());
			System.out.println("Enter the rating of the movie");
			a.setRating(keyboard.nextLine());
			System.out.println("Enter the tickets sold");
			a.setSoldTickets(keyboard.nextInt());
			keyboard.nextLine();
			System.out.println(a+"\nWould you like to continue");
			ans = keyboard.nextLine();
		} while(ans.equals("y"));
	}

}
