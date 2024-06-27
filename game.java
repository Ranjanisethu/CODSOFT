import java.util.Scanner;
import java.util.Random;

public class game {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
boolean play = true;
int score = 0;
int round = 1;
System.out.println("Welcome to the Number Guessing Game!!!!!");
while(play) {
System.out.println("\nRound " + round);
int num = rand.nextInt(100) + 1;
int tries = 0;
int maxTries = 5;
boolean guessed = false;
while (tries < maxTries && !guessed) {
try {
System.out.print("Attempt " + (tries + 1) + "/" + maxTries + " - Guess the number (1-100): ");
int guess = Integer.parseInt(sc.nextLine());
tries++;
if (guess < 1 || guess > 1000) {
System.out.println("Your guess is out of bounds! Please guess a number between 1 and 100.");
} 
else if (guess < num) {
System.out.println("Too low! Try again.");
} 
else if (guess > num) {
System.out.println("Too high! Try again.");
} 
else {
System.out.println("Congratulations! You guessed the correct number " + num + " in " + tries + " attempts.");
guessed = true;
score += (maxTries - tries + 1); 
}
} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid number.");
}
}
if (!guessed) {
System.out.println("Sorry! You've used all " + maxTries + " attempts. The correct number was " + num + ".");
}
System.out.println("Your total score is: " + score);
round++;
System.out.print("Do you want to play another round? (yes/no): ");
String playInput = sc.nextLine().toLowerCase().trim();
play = playInput.equals("yes");
}
System.out.println("Thank you for playing the Number Guessing Game!!!!!");
System.out.println("Your final score is: " + score);
sc.close();
}
}

