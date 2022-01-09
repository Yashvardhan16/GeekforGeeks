class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        while(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseList(head.next);
        Node headNext = head.next;
        headNext.next=head;
        head.next=null;
        return newHead;
        
    }
}
