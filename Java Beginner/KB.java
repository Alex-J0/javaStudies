//lang is basic mandatory package. Even when not imported, it is imported.
import java.lang.*;
import java.util.*;

class KB
{
    
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       // System.in = keyboard
       int a, b, c;

       System.out.println("Enter 2 Numbers");
       a = s.nextInt();
       b = s.nextInt();
       c = a+b;

       System.out.println("Sum is " + c);

       String name;
       System.out.println("What's your name?");
       name = s.next();
       System.out.println("Welcome " + name);
    }
}