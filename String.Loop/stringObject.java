//import java.lang.*;

class stringObject
{
    public static void main(String[] args)
    {
        int a = 10, x = 12;
        float b = 12.55f;
        char c = 'A';
        String e = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);

        b = (float)(12.55 * 2); //converted value to float

        System.out.println(a + b + " " + c);
        System.out.printf("Hello\nNext Line\n%d %f %c\n", a, b, c);
        System.out.printf("Hello\nNext Line\n%1$d %2$x %3$f %4$c\n", a, x, b, c);
        System.out.printf("%05d\n", a);

        a = -10;
        b = 12.34567f;

        System.out.printf("%(d\n", a);
        System.out.printf("%(f\n", b);
        System.out.printf("%+d\n", x);
        System.out.printf("%.2f\n", b);
        System.out.printf("%s\n", e);

        String palavra = "palavra";
        char letra = palavra.charAt(0);

        System.out.println(letra);
        System.out.println(palavra.charAt(1));

        char word[] = {'H', 'e', 'l', 'l', 'o'};
        int vetor[] = {0, 1, 2, 3};

        System.out.println(word[1]);
        System.out.println(vetor[2]);

        String palavra2 = new String(word, 0, 2);

        System.out.println(palavra2);

        palavra2 = null; // No more references, collected by garbage collector

        String str1 = new String("palavra");
        String str2 = new String("palavra");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str1 = "A7";
        System.out.println(str1.matches("[a-zA-Z][0-9]"));
        
/*         for (int i = 0; i < str2.length(); i++)
        {
            char l = str2.charAt(i);
            System.out.println(l == 'a');
        } */

        str1 = null;
        str2 = null;
        //Garbage collector collects object "palavra"


        
    }
}