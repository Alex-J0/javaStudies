import java.util.*;

public class stringExercise2 {

    public static void main(String[] args)
    {
        //Create dynamic array list
        ArrayList<String> vetString = new ArrayList<>();

        //Create input to read user keyboard
        Scanner input = new Scanner(System.in);

        //Get size of vetString
        System.out.println("Type Size of Array: ");
        int vetTam = input.nextInt();
        
        //Fill vetString based on given size
        System.out.println("Type Words: ");
        for (int i = 0; i < vetTam; i++)
        {
            vetString.add(input.next());
        }

        //Create dynamic char array for equal letters
        ArrayList<Character> vetChar = new ArrayList<>();

        //Fill vetChar with word characters
        for (int i = 0; i < vetTam; i++)
        {
            String getWord = vetString.get(i);
            getWord = getWord.toLowerCase();
            
            //get first word letters
            if (i == 0)
            {
                for (int j = 0; j < getWord.length(); j++)
                {
                    vetChar.add(getWord.charAt(j));
                }
            }

            //compare other words' letters to see if they repeat or not
            else
            {
                for (int j = 0; j < vetChar.size();)
                {
                    boolean charRepeat = false;
                    for (int k = 0; k < getWord.length(); k++)
                    {
                        if (vetChar.get(j) == getWord.charAt(k))
                        {
                            charRepeat = true;
                        }
                    }
                    if (!charRepeat) {vetChar.remove(j);} else {j++;}
                }
            }
        }
        
        //remove repeated letters from vetChat
        for (int i = 0; i < vetChar.size();)
        {
            boolean repeat = false;
            for (int j = i + 1; j < vetChar.size(); j++)
            {
                if (vetChar.get(i) == vetChar.get(j)) {repeat = true;}
            }
            
            if (repeat) {vetChar.remove(i);} else {i++;}
        }

        //Raw output
        for (int i = 0; i < vetChar.size(); i++) {System.out.print(vetChar.get(i) + " ");}

        System.out.println();

        //Formatted output
        for (int i = 0; i < vetChar.size(); i++)
        {
            if (i == 0) {System.out.print("[" + '"' + "" + vetChar.get(i) + "" + '"'); if (vetChar.size() == 1) {System.out.print("]");} else {System.out.print(',');}}
            else if (i != vetChar.size() - 1) {System.out.print('"' + "" + vetChar.get(i) + "" + '"' + ",");}
            else {System.out.print('"' + "" + vetChar.get(i) + "" + '"' + "]");}
        }

        //int[] vetor = new int[vetTam]; <- Creating array with custom size

        input.close();
    }
    
}