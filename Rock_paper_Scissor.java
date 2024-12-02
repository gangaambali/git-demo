import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class Rock_paper_Scissor
{
    public static void main(String args[])
    {
        //0--->Rock
        //1--->paper
        //2--->Scissor
while(true)
{
    Scanner s= new Scanner(System.in);
    System.out.print("Enter 0 for rock 1 for paper and 2 for scissor: ");
    int userinput=s.nextInt();
    
    Random random=new Random();
    int computerinput=random.nextInt(3);
    System.out.println("user choice: "+userinput);

    if(userinput < 3) 
    {
        if(userinput==computerinput)
            {
                System.out.println("Draw");
            }
        else if(userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1)
            {
                System.out.println("You win!!");
            }
        else
            {
                System.out.println("Computer win!");
            }

        if(computerinput==0)
        {
            System.out.println("computer choice:Rock");
        }
        else if(computerinput==1)
        {
            System.out.println("computer choice:Paper");
        }
        else if(computerinput==2)
        {
            System.out.println("computer choice:Scissor");
        }

           System.out.println();
     }
    else
        {
            System.out.println("Invalid input.. Try again");
        }    
    }


    }
}



