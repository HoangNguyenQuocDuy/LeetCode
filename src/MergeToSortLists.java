public class MergeToSortLists {

    public MergeToSortLists() {};

    public ListNode mergeTowSortLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTowSortLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTowSortLists(list2.next, list1);
                return list2;
            }
        }
        if(list1 != null)
            return list1;
        return list2;
    }
}
