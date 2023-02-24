import java.util.Scanner;
public class ex5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        for (int i=1 ; i <=100 ; i=i+1) {
            if (i % n == 0) {
                System.out.println(i+ " หารด้วย " +n+ " ลงตัว");
            }
        }
    }
}
