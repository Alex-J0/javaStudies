//import java.lang.*;

public class literals {
   public static void main(String args[])
   {
        //Literals also have data type;
        int x;
        x = 5 * 3; //Integer Literal

        double y;
        y = 153.75; //Double literal

        System.out.println(10); //Dec
        System.out.println(0b1010); //Bin
        System.out.println(012); //Octal
        System.out.println(0XA); //Hex


        //All decimal floating point numbers are doubles by default

        float z=15.5f; //Must convert to float

        x=999_999_999; //_ is allowed -> "," are not
        //etc
   } 
}
