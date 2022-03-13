package leetcode.array;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
    }

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int largestAltitude = 0;

        // approach 1
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > largestAltitude) {
                largestAltitude = altitude;
            }
        }

        return largestAltitude;
    }
}
