package Loops;

public class WhileLoopEvenOdd {
    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println("List of 10 Even and Odd Numbers");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(" " + i + " is even number ");
            } else {
                System.out.println(" " + i + " is Odd number ");
            }
            i++;
        }

    }
}

