public class AddDigits {
    public static void main(String[] argv) {
        int A = 123456;
        System.out.println(sumDigits(A));
    }
    public static int sumDigits(int A) {
        if(A/10 == 0) return A;
        
        return  A%10 + sumDigits(A/10);
    }

}
