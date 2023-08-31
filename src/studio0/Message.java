package studio0;

import java.util.Scanner;

public class Message {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);  

        System.out.println("Say something to your group mates:");
        String messageToTeam = scan.nextLine();
        System.out.println("Lily says: " + messageToTeam);
	}
}
