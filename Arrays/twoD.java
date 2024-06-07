import java.util.*;

public class twoD {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[input.nextInt()][input.nextInt()];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int x[] : matrix) {
            for (int y : x)
            {
                System.out.print(y);
            }
            System.out.println();
        }

        matrix = null; //Heap Matrix ixj gets collected, but matrix reference still exists

        matrix = new int[3][];
        matrix[0] = new int[3];
        matrix[1] = new int[4];
        matrix[2] = new int[3];

        matrix = null;

        matrix = new int[3][3];
        int[][] matrix2 = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i[] : matrix2) {
            for (int j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        int[][] matrixSoma = new int[3][3];
        int[][] matrixMult = new int[3][3];

        for (int i = 0; i < 3; i++) //Using 3 instead of .length for learning purposes
        {
            for (int j = 0; j < 3; j++)
            {
                matrixSoma[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        String[] stringArray = new String[input.nextInt()];

        for (int i = 0; i < stringArray.length; i++)
        {
            stringArray[i] = input.next();
        }

        for (int i = 0; i < stringArray.length; i++)
        {
            char aux = Character.toLowerCase(stringArray[i].charAt(0));
            for (int j = i + 1; j < stringArray.length; j++)
            {
                char aux2 = Character.toLowerCase(stringArray[j].charAt(0));
                if (aux2 < aux)
                {
                    String aux3 = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = aux3;
                }
            }
        }

        for (int i = 0; i < stringArray.length; i++)
        {
            System.out.println(stringArray[i]);
        }

        input.close();
    }
}
