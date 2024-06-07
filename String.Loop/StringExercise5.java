import java.util.*;

public class StringExercise5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Day: ");
        int day = input.nextInt();

        System.out.println("Type Month: ");
        int month = input.nextInt();

        System.out.println("Type Website: ");
        String website = input.next();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }

/*         switch (website.substring(website.lastIndexOf('.'), website.length())) {
            case value:
                
                break;
        
            default:
                break;
        } */

        String type = website.substring(website.lastIndexOf('.'), website.length());
        System.out.println(type);

        input.close();
    }
}
