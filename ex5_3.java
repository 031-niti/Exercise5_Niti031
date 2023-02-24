import java.util.Scanner;
public class ex5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r : ");
        int r = input.nextInt();
        System.out.print("Enter h : ");
        int h = input.nextInt();
        double amount = 3.14 * r * r * h;
        System.out.println("Cylindrical amount : " +amount);
    }
}
