public class AddTwoNumbersInNode {

    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNode(new int[]{2,4,3});
        ListNode l2 = ListNode.createListNode(new int[]{5,6,4});
        ListNode sumNode = null;
        ListNode counterNode = null;
        int sum = 0;
        int carry = 0;
        boolean carryAdded = false;
       while(l1 != null || l2 != null){
           sum = 0;

           if(l1 != null) {
               sum = sum + l1.val;
           }
           if(l2 != null){
               sum = sum + l2.val;
           }
           if(sum >= 10){
               carry = sum/10;
               sum = sum%10;
               carryAdded = false;
           }
           if(sumNode == null) {
               sumNode = new ListNode(sum, null);
               counterNode = sumNode;
           }
           else{
               counterNode.next = new ListNode(sum, null);
               counterNode = counterNode.next;
           }
           if(l1 != null) {
               if(l1.next != null){
                   l1 = l1.next;
                   if(!carryAdded){
                       l1.val = l1.val + carry;
                       carry = 0;
                       carryAdded = true;
                   }
               }
               else{
                   l1 = null;
               }
           }

           if(l2 != null){
               if(l2.next != null){
                   l2 = l2.next;
                   if(!carryAdded){
                       l2.val = l2.val + carry;
                       carry = 0;
                       carryAdded = true;
                   }
               }
               else{
                   l2 = null;
               }
           }
       }

       if(carry!=0 && !carryAdded){
           counterNode.next = new ListNode(carry, null);
           counterNode = counterNode.next;
       }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int[] arr) {
        ListNode returnNode = null;
        ListNode tempNode = null;
        for (int val: arr) {
            if(returnNode == null){
                returnNode = new ListNode(val, null);
                tempNode = returnNode;
            }
            else{
                tempNode.next = new ListNode(val, null);
                tempNode = tempNode.next;
            }
        }
        return returnNode;
    }
}
