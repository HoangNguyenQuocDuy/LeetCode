import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequenciesUnique {

    public FrequenciesUnique() {}

    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        int deletions = 0;
        for(int value: map.values()) {
            while(!set.add(value) && value > 0) {
                value--;
                deletions++;
            }
        }

        return deletions;
    }
}
