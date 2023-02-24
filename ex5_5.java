import java.util.Scanner;
public class ex5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = input.nextInt();
        System.out.print("Enter y : ");
        int y = input.nextInt();
        System.out.print("Enter z : ");
        int z = input.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.println("x is greater than y and z");
            }else{
                System.out.println("x is greater than y but x is less than z");
            }
        }else{
            System.out.println("x is less than y");
        }
    }
}
