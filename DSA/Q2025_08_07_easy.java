/* REVERSE A LINKED LIST */
public class Q2025_08_07_easy {
    public static void main(String[] args) {
        
    }
    public ListNode reverseList(ListNode head) {
        if(head == null||head.next == null  ){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
