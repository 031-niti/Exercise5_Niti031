import java.util.Scanner;
public class ex5_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = input.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = input.nextInt();
        System.out.println("Enter num4 : ");
        int num4 = input.nextInt();
        System.out.println("Enter num5 : ");
        int num5 = input.nextInt();
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (max < num4) {
            max = num4;
        }
        if (max < num5) {
            max = num5;
        }
        System.out.println("The maximum value is : " + max);            
    }
}