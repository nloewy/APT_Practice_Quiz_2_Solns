import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {

    public String[] sort(String[] strs) {
        Arrays.sort(strs, Comparator.comparing(this::calculateWeight).thenComparing(String::compareTo));
        return strs;
    }

    public int calculateWeight(String str) {
        int weight = 0;
        for (char c : str.toCharArray()) {
            weight += (int) c - 'A' + 1;
        }
        return weight;
    }
}