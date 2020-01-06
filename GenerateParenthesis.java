import java.util.Scanner;
import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        genPairs("", 0, 0, n);

    }

    public static void genPairs(String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            System.out.println(str);
            return;
        }

        if (open < max)
            genPairs(str + "(", open + 1, close, max);
        if (close < open)
            genPairs(str + ")", open, close + 1, max);
    }
}