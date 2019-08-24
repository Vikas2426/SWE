public class kmp {
    static int[] buildTable(String pattern) {
        int i = 0;
        int j = 1;
        int len = pattern.length();
        int[] table = new int[len];
        while (j < len) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                table[j] = i + 1;
                i += 1;
                j += 1;
            } else {
                table[j] = 0;
                j += 1;
            }
        }
        return table;
    }

    static void match(String string, String pattern, int[] table) {
        if (string.length() <= 0 || pattern.length() <= 0) {
            System.out.println("Invalid string or pattern!");

        } else {
            int i = 0, j = 0, index = 0, len = string.length();
            while (i < len) {
                if (string.charAt(i) == pattern.charAt(j)) {
                    if (j == pattern.length() - 1) {
                        System.out.println(i - j);
                        return;
                    } else {
                        i++;
                        j++;
                    }
                } else {
                    if (j != 0)
                        j = table[j - 1];
                    else {
                        i++;
                    }
                }
            }
            System.out.println("Pattern not found!");
        }

    }

    public static void main(String[] args) {
        String pattern = "dsgwadsgz";
        int[] table = new int[pattern.length()];
        table = buildTable(pattern);

        String string = "adsgwadsxdsgwadsgz";
        match(string, pattern, table);
    }
}