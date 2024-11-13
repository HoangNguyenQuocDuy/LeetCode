import java.util.*;

public class GroupPeople {

    public GroupPeople() {}

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map map = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = (List<Integer>) map.getOrDefault(groupSizes[i], new ArrayList<Integer>());
            if (list.size() == groupSizes[i]) {
                result.add(list);
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(groupSizes[i], list);
        }
        for (Object size: map.keySet()) {
            System.out.println(size);
            result.add((List<Integer>) map.get(size));
        }

        return  result;
    }

    private void backtrack(Set set, int[] groupSizes, List<Integer> list, int start, List<List<Integer>> result) {
        for (int i = start; i < groupSizes.length; i++) {
            if (set.add(groupSizes[i]) || !list.add(i)) {
                List<Integer> newList = new ArrayList<>(groupSizes[i]);
                newList.add(i);
                backtrack(set, groupSizes, newList, ++i, result);
            }
//            else if (!list.add(i)) {
//                List<Integer> newList = new ArrayList<>();
//                newList.add(i);
//                backtrack(set, groupSizes, newList, ++i, result);
//            }
            else {
                list.add(i);
                backtrack(set, groupSizes, list, ++i, result);
            }
            if (list.size() == groupSizes[i])
                result.add(list);
        }
    }
}
