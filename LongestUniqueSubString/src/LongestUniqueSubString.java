import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String str = "aav";
        int length = lengthOfLongestSubstring(str);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String input) {
        int longestSubstringLength = 0;

        if (isThereAnyDuplicateCharacter(input)) {
            for (int i = 0; i < input.length(); i++) {
                Set<Character> values = new HashSet<>();
                boolean inserted = false;
                for (int j = i; j < input.length(); j++) {
                    if (values.contains(input.charAt(j))) {
                        longestSubstringLength = Math.max(longestSubstringLength, values.size());
                        inserted = true;
                        break;
                    } else {
                        values.add(input.charAt(j));
                    }
                }
                if (!inserted) {
                    longestSubstringLength = Math.max(longestSubstringLength, values.size());
                }
            }
        } else {
            longestSubstringLength = input.length();
        }

        return longestSubstringLength;
    }

    private static boolean isThereAnyDuplicateCharacter(String str) {
        boolean isDuplicateCharacter = false;
        Set<Character> values = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (values.contains(str.charAt(i))) {
                isDuplicateCharacter = true;
            } else {
                values.add(str.charAt(i));
            }
        }
        return isDuplicateCharacter;
    }

}
