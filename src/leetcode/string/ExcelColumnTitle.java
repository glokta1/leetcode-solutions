package leetcode.string;

public class ExcelColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        sb.append((char)('A' + columnNumber - 1));

        return sb.toString();
    }
}
