package leetcode.string;

import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        int key = 0;

        if (ruleKey.equals("type")) {
            key = 0;
        } else if (ruleKey.equals("color")){
            key = 1;
        } else {
            key = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(key).equals(ruleValue)) {
                matches++;
            }
        }

        return matches;
    }
}
