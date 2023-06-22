package Internpe.Task2;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        Float n1 = sc.nextFloat();
        System.out.print("Enter Number 2: ");
        Float n2 = sc.nextFloat();
        System.out.print("Enter Number 3: ");
        Float n3 = sc.nextFloat();
        Float avg = (n1+n2+n3)/3.0f;
        System.out.print("Average of Three numbers is = "+avg);
    }
}
