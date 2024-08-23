import java.util.*;
public class java{
    public static void main (String args[]){
        Scanner sim = new Scanner(System.in);
        Random sim1 = new Random();
        System.out.println("SELECT THE LETTER WHERE YOU WANT TO PLACE YOUR FIRST MOVE BELOW:");
        System.out.println("             ");
        System.out.println(" a | b  |  c");
        System.out.println("-------------");
        System.out.println("d  | e  |  f ");
        System.out.println("-------------");
        System.out.println("g  | h  |  i ");
        String a = sim.next();
        a = "x";
        
        int z = sim1.nextInt();
        z = 0;
        System.out.println();
        System.out.println("SELECT THE LETTER WHERE YOU WANT TO PLACE YOUR SECOND MOVE:");

        System.out.println(a+" |  b  |  c");
        System.out.println("-------------");
        System.out.println("d  | e  |  f ");
        System.out.println("-------------");
        System.out.println("g  | h  |  "+z);
        String b = sim.next();
        b="x";
        int y = sim1.nextInt();
        y = 0;
        System.out.println();
        System.out.println("SELECT THE LETTER WHERE YOU WANT TO PLACE YOUR FINAL MOVE:");

        System.out.println(  a+"  | "+b+" | c  ");
        System.out.println("-------------");
        System.out.println("d  | "+y+" |  f ");
        System.out.println("-------------");
        System.out.println("g  | h  |  "+z);
        String c = sim.next();
        c="x";
        
        int x = sim1.nextInt();
        x = 0;
        
        System.out.println("YOU WiN!!!");

        System.out.println(  a+"  | "+b+"  |  "+c);
        System.out.println("-------------");
        System.out.println("d  | "+y+"  |  f ");
        System.out.println("-------------");
        System.out.println( x+"  | h  |  "+z);

        System.out.println("WINNER!!!!");
        
        


    }
}