import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // Variables
        String yNResponse = "";
        boolean done = false;

        // do while loop for prompt for player to play again; recycled from rock, paper, scissors program
        do
        {
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll;

            System.out.println("Do you want to play again [Y/N]: ");
            yNResponse = in.nextLine();
            if (yNResponse.equalsIgnoreCase("N"))
            {
                done = true;
            }
            else if (!yNResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Invalid Response;");
            }
            else if (yNResponse.equalsIgnoreCase("Y"))
            // as soon as the player confirms that they want to play, the program automatically roll two initial dice
            {
                System.out.println("First Die: " + die1);
                System.out.println("Second Die: " + die2);
                crapsRoll = die1 + die2;
                System.out.println("Die Sum: " + crapsRoll);
                // if the initial dice add up to 2, 3, or 12, then the player craps out
                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                {
                    System.out.println("You crapped out!");
                }
                // else, if their sum is 7 or 11, they automatically win and the program prompts the player to play again
                else if (crapsRoll == 7 || crapsRoll == 11)
                {
                    System.out.println("You win with a natural!");
                }
                else
                {
                    // if the sum is anything else, that that is the point to match
                    int point = crapsRoll;
                    System.out.println(point + " is the point to match!");
                    // while the system fails to roll the match point or a sum of 7, it will stay in the loop
                    while(true)
                    {
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        System.out.println("First Die: " + die1);
                        System.out.println("Second Die: " + die2);
                        crapsRoll = die1 + die2;
                        System.out.println("Die Sum: " + crapsRoll);
                        if(crapsRoll == point)
                        {
                            System.out.println("You win!");
                            break;
                        }
                        else if(crapsRoll == 7)
                        {
                            System.out.println("You lose!");
                            break;
                        }
                    }
                }
            }
        }while(!done);
    }
}