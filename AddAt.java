public class AddAt {

    public ListNode addAt(ListNode list, ListNode toAdd, int index) {
        if (list==null){return toAdd;}
        if(toAdd==null){return list;}
        if (index == 0) {

            ListNode toAddEnd = getEndNode(toAdd);
            toAddEnd.next = list;
            return toAdd;

        } else {
            ListNode current = list;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                ListNode temp = current.next;
                current.next = toAdd;
                getEndNode(toAdd).next = temp;
            }
            return list;
        }
    }

    public ListNode getEndNode(ListNode list) {
        ListNode end = list;
        while (end.next != null) {
            end = end.next;
        }
        return end;
    }
}

