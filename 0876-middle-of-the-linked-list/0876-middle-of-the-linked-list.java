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
        int size =1;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size%2 != 0){
            size = size/2;
            temp = head;
            for(int i=0; i<size;i++){
                temp = temp.next;
            }
            return temp;
        }
        else{
            size = size/2;
            temp = head;
            for(int i=1; i<size;i++){
                temp = temp.next;
            }
            return temp;
        }
        
    }
}