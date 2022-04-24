package leetcode.string;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println(interpet("(al)G(al)()()G"));
    }

    public static String interpet (String command) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                continue;
            }

            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;
                } else {
                    sb.append("al");
                    i = i + 3;
                }
            }
        }

        return sb.toString();
    }
}
