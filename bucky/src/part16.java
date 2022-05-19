import java.util.Scanner;

public class part16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna("Null-chan");
        System.out.println("Enter name of first girlfriend here: ");
        String temp = input.nextLine();
        tunaObject.setGirlName(temp);
        tunaObject.saying();
    }
}
