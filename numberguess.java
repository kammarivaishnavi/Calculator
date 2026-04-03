import java.util.Random;
import java.util.Scanner;

public class numberguess{
    public static void main(String[] args) {
        int count = 0;
        int tries=5;
        Random rand=new Random();
        Scanner scanner=new Scanner(System.in);
        int randomnumber=rand.nextInt(50)+1;
        //here if we dont use the while loop first becuse of we are printing which numbre is genereted by system so we can known that
        // the random number which is generated....👇🏻
        //System.out.println("generated random number is"+randomnumber);
        while(true){
        System.out.println("enetr number between (1-50):");
        count++;
        if(count==tries){
            System.out.println("you have reached the limit try later...!!!!!!!");
            //System.out.println("here you guessed the number in  "+count + "tries");
            break;
            
        }
        //System.out.println("enetr number between (1-50):");
       int playerguess=scanner.nextInt();
       
        if (playerguess==randomnumber){
        System.out.println("yupp !! you win");
        System.out.println("here you guessed the number in  "+count + "tries");
        
       }
       
       else if(randomnumber > playerguess){
        System.out.println("nope number is higher");
       }
       else{
       System.out.println("nope it is lower guess");
       }
    }
    scanner.close();
 }
}

