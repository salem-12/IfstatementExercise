import java.util.Scanner;
    public class IfStatementExercise
    {
        public static void main(String[] args)
        {
            int number = 10;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            number = scan.nextInt();
            scan.close();4

            if(number >= 0)
            {
                System.out.println(number+" is positive number");
            }
            else if(number <= 0)
            {
                System.out.println(number+" is negative number");
            }
            else
                {
                System.out.println("Application finished.");
            }
        }
    }

