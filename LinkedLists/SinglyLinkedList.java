package LinkedLists;
public class SinglyLinkedList{
    private ListNode head;
        public static class ListNode{
            final int data;
            private ListNode next;
        
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // singly linked list creation
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(); //creating object
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);//inserting values

        sll.head.next = second; // to make connections
        second.next = third;
        third.next = fourth;

        System.out.println(sll);// reference of Singly Linked List

        //some basic functions - sll.display();

        //insert functions
        sll.insertAtStart();
        sll.insertAtEnd();
        sll.insertAtPosition(60, 3);
        sll.display();
    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public void insertAtStart(){
        ListNode newNode = new ListNode(30);
        newNode.next = head;
        head = newNode;
        
    }
    public void insertAtEnd(){
        ListNode newNode = new ListNode(45);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null!=current.next){
            current = current.next;
        }
        current.next = newNode;
        
    }

    public void insertAtPosition(int d, int p){
        ListNode newNode = new ListNode(d);
        if(p==1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode previous = head; // helps to point the previous node
            int count = 1;
            while(count < p-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;//points the current node
            newNode.next = current;
            previous.next = newNode;
        }
    }

}
