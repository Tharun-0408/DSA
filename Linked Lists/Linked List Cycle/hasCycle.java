class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow  == fast)
                return true;
        }

        return false;
        
    }
}


//Time Complexity = O(n)
//Space Complexity = O(1)
