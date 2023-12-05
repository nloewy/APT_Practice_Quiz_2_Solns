public class ListDuplicateMe {
    public ListNode duplicate(ListNode list) {
        ListNode first = list;
        while (list != null){
            ListNode afterMe = list.next;
            if (list.info == 1){
                list=list.next;
            }
            else {
                list.next = duplicateNode(list.info, list.info - 1, afterMe);
                list = afterMe;
            }
        }
        return first;
    }
    public ListNode duplicateNode(int info, int moreTimes,ListNode toConnect){
        if (moreTimes == 1){
            return new ListNode(info, toConnect);
        }
        else {
            return new ListNode(info, duplicateNode(info, moreTimes - 1, toConnect));
        }
    }
}