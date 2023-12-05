
public class ListMutation {
    public ListNode alter(ListNode list) {
        if (list==null){
            return null;
        }
        else if (list.info % 2 == 0){
            list.next=new ListNode(list.info, alter(list.next));
            return list;
        }
        else {
            return alter(list.next);
        }

    }
}
