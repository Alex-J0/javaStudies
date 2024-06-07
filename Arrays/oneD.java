import java.util.*;

class oneD
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] a = new int[input.nextInt()];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        for (int i = 0; i < a.length; i++)
        {
            vetor.add(input.nextInt());
        }

        for (int i = vetor.size() - 1, j = 0; i >= 0; i--)
        {
            a[j] = vetor.get(i);
            j++;
        }

        for (int i = 0; i < a.length; i++) 
        {
            System.out.println(a[i]);
        }

        for (int x : vetor)
        {
            System.out.print(x);
        }
        
        input.close();
    }
}