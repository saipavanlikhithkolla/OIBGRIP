import java.util.Random;
import java.util.Scanner;
public class Number{
    static int guess;
    static int number;
    static int point=0;
    public static void numbergame(){
        Scanner sc=new Scanner(System.in);
        number=1+(int)(Math.random());
        int a=5,i;
        System.out.println("WELCOME TO NUMBER GUESSING GAME:");
        System.out.println("RULES MUST BE FOLLOWED ARE:\n 1.Choose number between 1-100\n 2.Only 5 attempts are there for guessing");
        System.out.println("-------------------------------------------------------------------------------");
        for(i=0;i<a;i++)
        {
            System.out.println("ENTER A NUMBER: ");
            guess=sc.nextInt();
            if(number==guess){
                System.out.println("CONGRATULATIONS! YOU WIN");
                System.out.println("------------------------------------------------------------------------");
                rounds();
                break;
            }
            else if(number>guess&&i!=a-1)
            {
                System.out.println("THE NUMBER IS GREATER THAN "+guess);
                System.out.println("-------------------------------------------------------------------------");
            }
            else if(number<guess&&i!=a-1)
            {
                System.out.println("THE NUMBER IS LESSER THAN "+guess);
                System.out.println("--------------------------------------------------------------------------");
            }
        }
        if(i==a){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("YOU TRIED WELL BUT UNFORNUTELY THE LIMIT EXCEEDS");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("THE NUMBER IS "+number);
            System.out.println("--------------------------------------------------------------------------");
            rounds();
        }
    }
    public static void rounds(){
        System.out.println("DO YOU WANT TO PLAY AGAIN \n ENTER 1.YES \n ENTER 2.NO");
        System.out.println("-------------------------------------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(b==1){
            numbergame();
        }
        else{
            System.out.println("THANKYOU FOR PLAYING");
            if(number==guess){
                point++;
                System.out.println("TOTAL NUMBER OF ATTEMPTS"+point);
                System.out.println("-----------------------------------------------------------------");
            }
            else{
                System.out.println("YOUR POINTS "+point);
                System.out.println("------------------------------------------------------------------");
            }
            System.out.println("TOTAL SCORE :"+point*2);
            System.out.println("--------------------------------------------------------------------");
        }
    }
    public static void main(String[] args){
        numbergame();
    }
}