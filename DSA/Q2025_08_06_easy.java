/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

head = [1,0,1] -> output: 5
head = [0] -> output:
PROBLEM NO. 1290
 */
public class Q2025_08_06_easy {
    public static void main(String[] args) {
        
    }

    public static int getDecimalValue(ListNode head) {
        if(head.next == null) return head.val;
        int len = getSize(head);
        ListNode temp = head;
        int sum = 0;
        while(temp != null) {
            if(temp.val != 0) sum+=temp.val * (int)(Math.pow(2,len-1));
            len--;
            temp = temp.next;
        }
        return sum;
    }
    public static int getSize(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
