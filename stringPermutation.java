public class stringPermutation {

    static void permute(String prefix, String str) {

        if (str.length() == 0) {
            System.out.println(prefix);

        } else {
            for (int i = 0; i < str.length(); i++) {
                prefix = prefix + str.charAt(i);
                permute(prefix, str.substring(0, i) + str.substring(i + 1));
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
    }

    public static void main(String[] args) {
        String prefix = "";
        permute(prefix, "vikas");
    }
}