/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count =1;
        int halfSize;
        ListNode secondHead = head;
        while(head.next!=null){
            count++;
            head =head.next;
        }
        
        halfSize = count/2;
        for(int i= 1; i<=halfSize; i++ ){
            secondHead = secondHead.next;
        }
        return secondHead;
    }
}