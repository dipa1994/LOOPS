package Loops;

public class ForLoopEvenOdd {
    public static void main(String[] args) {
        int i = 20;
        System.out.println("List of 10 Even Numbers");
        for (int a = 1; a <= 20; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " even numbers ");
            }
        }
        System.out.println("List of 10 Odd Numbers ");
        for (int a = 1; a <= 20; a++)
        {
                if (a % 2 == 1)
            {
                    System.out.println(a + " Odd numbers ");
                }
            }
        }
    }








