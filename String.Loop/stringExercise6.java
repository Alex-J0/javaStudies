import java.util.*;

public class stringExercise6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        do{
            i = i * i;
        } while (i < 100);

        System.out.println(i);

        int [] array = {0, 1, 2, 3, 4};

        for (int j : array)
        {
            System.out.print(array[j]);
            for (int k : array)
            {
                System.out.print(array[j]+array[k]);
            }
            System.out.println();
        }

        input.close();
    }
}
