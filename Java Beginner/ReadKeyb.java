import java.lang.*;
import java.util.*;

class ReadKeyb
{
    // Read Keyboard using util library
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();

        System.out.println(x+y);

        scan.useRadix(2);
        int z = scan.nextInt();

        System.out.print(z);

        scan.close();
    }
}