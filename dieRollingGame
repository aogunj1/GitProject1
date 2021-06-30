package gitProject1;

import java.util.Random;
import java.util.Scanner;

public class dieRollingGame {

	public static void main(String[] args) {
		//Six sided die rolling game. Die rolls and keeps track od how many tries it takes you to guess correctly.System.out.println("Pick a number between 0-5");
				System.out.println("pick a number between 0-5.");
						Scanner scanner = new Scanner(System.in);
						Random random = new Random();
						 int randNum = 0;
						 int myNum = 0;
						 int tryCounter = 0;
						
						do 
						{
						randNum = random.nextInt(6);
						myNum = scanner.nextInt();
						System.out.println("it rolled " + randNum);
						tryCounter++;
						}
						while(randNum != myNum);
						
						System.out.println("You got it ");
						System.out.println("You guessed " + myNum);
						System.out.println("Die rolled " + randNum);
						System.out.println("it took you " + tryCounter + " tries ");
						getCount(tryCounter);

	}
	public static void getCount(int tryCounter) 
	{
	if(tryCounter < 5) {
		System.out.println("Great Job!");
	}
	else if (tryCounter < 10 && tryCounter > 5) 
	{
		System.out.println("nice try");
	}
	else if (tryCounter > 15) {
		System.out.println("Yikes");
	}

		}
}
