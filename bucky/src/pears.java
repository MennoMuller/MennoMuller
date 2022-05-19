import java.util.Scanner;

public class pears {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number: ");
        fnum = bucky.nextDouble();
        System.out.println("Enter second number: ");
        snum = bucky.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
