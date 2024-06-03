import java.lang.*;
import java.util.*;

public class programSecond {
    public static void main(String args[])
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("May I know your name?");;
        name = scan.next();

        System.out.println("Welcome " + name + "!");

        scan.close();
    }    
}
