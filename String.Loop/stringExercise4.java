import java.util.*;

public class stringExercise4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String website = input.next();
        int tam = website.indexOf(':');
        String protocol = website.substring(0, tam);
        String type;

        if (website.contains(".com"))
        {
            type = ".com";
        } else if (website.contains(".gov"))
        {
            type = ".gov";
        } else if (website.contains(".org"))
        {
            type = ".org";
        } else if (website.contains(".net"))
        {
            type = ".net";
        } else if (website.contains(".biz"))
        {
            type = ".biz";
        } else
        {
            type = "invalid";
        }

        System.out.println(protocol);
        System.out.println(type);

        input.close();
    }
}
