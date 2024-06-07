import java.util.*;

class stringExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        if (str.charAt(1) == 'b')
        {
            boolean binary = true;
            for (int i = 2; i < str.length(); i++)
            {
                if (str.charAt(i) != '0') {if (str.charAt(i) != '1') {binary = false;}}
            }
            System.out.println("Binary: " + binary);
        }
        else if (str.charAt(1) == 'x')
        {
            System.out.println("Hexa-Decimal");
        }
        else if (str.charAt(2) == '/' && str.charAt(5) == '/')
        {
            boolean calendar = true;
            for (int i = 0; i < 2; i++) {if (!Character.isDigit(str.charAt(i))) {calendar = false;}}
            for (int i = 3; i < 5; i++) {if (!Character.isDigit(str.charAt(i))) {calendar = false;}}
            for (int i = 6; i < 10; i++) {if (!Character.isDigit(str.charAt(i))) {calendar = false;}}

            if (calendar) {System.out.println("Calendar");}
        }
        else
        {
            System.out.println("None");
        }


        input.close();
    }
}