import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String yNResponse = "";
        boolean done = false;

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
            {
                System.out.println("First Die: " + die1);
                System.out.println("Second Die: " + die2);
                crapsRoll = die1 + die2;
                System.out.println("Die Sum: " + crapsRoll);

                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                {
                    System.out.println("You crapped out!");
                }
                else if (crapsRoll == 7 || crapsRoll == 11)
                {
                    System.out.println("You win with a natural!");
                }
                else
                {
                    int point = crapsRoll;
                    System.out.println(point + " is the point to match!");

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