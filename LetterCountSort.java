import java.util.Arrays;
import java.util.Comparator;

public class LetterCountSort{
    private String special;

    public String[] sort(String[] list, String specialChars) {
        special = specialChars;
        Arrays.sort(list, Comparator.comparing(this::countSpecial).thenComparing(String::compareTo));
        return list;
    }

    public int countSpecial(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (special.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

}
