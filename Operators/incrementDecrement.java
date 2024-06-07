public class incrementDecrement {
    public static void main(String[] args)
    {
        int x = 5;

        x--; //x - 1
        --x; //x - 1 
        x++; //x + 1
        ++x; //x + 1

        // Posição do incremento/decremento depende da ordem a ser usada

        int y, z = 4;

        //y = x++; //y=5 x=6;
        //x = 5;
        //y = ++x; //y=6 x=6;


        x = 5;
        y = z*x++; // y = 21; ?
        System.out.println(y); //y = 20

        x = 5;
        y = 4*++x; //y = 24;

        System.out.println(y); //y = 24;

    }
}
