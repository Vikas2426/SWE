import java.util.Scanner;

class AddWithoutPlusSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int carry = (a & b) << 1;
        a = a ^ b;

        while (carry != 0) {
            b = carry;
            carry = (a & b) << 1;
            a = a ^ b;
        }
        System.out.println(a);
        scan.close();

    }
}