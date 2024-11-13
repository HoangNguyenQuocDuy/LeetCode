import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //word break
//        WordBreak wb = new WordBreak();
//
//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("pen");
//
//        System.out.println("Word break: " + wb.wordBreak("applepenapple", list));
//
//        //longestCommonPrefix
//        LongestCommonPrefix lg = new LongestCommonPrefix();
//
//        String[] strs = {
//                "dog","racecar","car"
//        };
//
//        System.out.println("LongestCommonPrefix: " + lg.longestCommonPrefix(strs));

        //MergeTowSortLists
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(4);
//        list1.next.next = new ListNode(9);
//
//        ListNode list2 = new ListNode(2);
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(8);
//
//        MergeToSortLists m = new MergeToSortLists();
//
//        System.out.println(m.mergeTowSortLists(list1, list2));

//        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
//
//        int j = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i -1 ])
//                nums[j++] = nums[i];
//        }
//
//        System.out.println(Arrays.stream(nums).toArray());
//        int n = i/

//        Search2D sch = new Search2D();
//        int[][] matrix = { { 1,3,5,7 }, { 10,11,16,20 }, { 23,30,34,60 } };
//        int length = matrix.length;
//        System.out.println(length);
////        System.out.println(matrix[0][length - 1]);
//        System.out.println(sch.searchMatrix(matrix, 3));

//        CountingBit countingBit = new CountingBit();
//
//        System.out.println(6 >> 1);
//        System.out.println(6 & 1);
//
//        System.out.println(countingBit.countBits(5));

//          MinExtraChar min = new MinExtraChar();
//          String[] dic = { "leet","code","leetcode" };
//
//        System.out.println(min.minExtraChar("leetscode", dic));

//        UniquePaths uniquePaths = new UniquePaths();
//        System.out.println(uniquePaths.uniquePaths(3, 7));

//        PascalTriangle pascalTriangle = new PascalTriangle();
//        System.out.println(pascalTriangle.solution(1));

//        CombinationSum combinationSum = new CombinationSum();
//        int[] nums = new int[] { 1, 2, 3 };
//        System.out.println(combinationSum.solution(nums, 4));
//        System.out.println(combinationSum.combinationSum(nums, 4));

//        GroupPeople groupPeople = new GroupPeople();
//        System.out.println(groupPeople.groupThePeople(new int[] { 3,3,3,3,3,1,3,3,3,3 }));

//        FrequenciesUnique frequenciesUnique = new FrequenciesUnique();
//        System.out.println(frequenciesUnique.minDeletions("aaabbcccddd"));

        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[] {0,1,2,2,3,0,4,2 }, 2));
    }
}