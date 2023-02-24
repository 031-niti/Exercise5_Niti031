import java.util.Scanner;
public class ex5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("จำนวนนาทีที่โทร : ");
        float min = input.nextFloat();
        float totalpay;
        if (min < 3) {
            totalpay = min * 5;
        } else {
            totalpay = 10 + (min - 2) * 2;
        }
        System.out.println("ค่าโทรศัพท์คือ :" + totalpay);
    }
}