package leetcode.string;

public class JudgeCircle {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int v = 0, h = 0;

        for (char move :
                moves.toCharArray()) {
            switch (move) {
                case 'U': v++; break;
                case 'D': v--; break;
                case 'L': h--; break;
                case 'R': h++; break;
            }
        }

        if (v == 0 && h == 0) {
            return true;
        }

        return false;
    }


}
