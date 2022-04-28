package Loops;

public class DoWhileLoopEvenOdd {
    public static void main(String[] args) {
        int i = 1;
        int a;
        System.out.println("List of 10 Even and Odd Numbers");
        do {
            a = i % 2;
            if (a != 0) {
                System.out.println(" " + i + " Odd numbers  ");
            }
            else
            {

                System.out.println(" " + i +" even numbers " );
            }
            i++;
        }
        while (i<=20);


    }
}

