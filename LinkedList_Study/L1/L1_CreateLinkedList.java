package LinkedList_Study.L1;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next = null;
    }
}
public class L1_CreateLinkedList {
    public static void main(String[] args) {
        //LinkedList is data structure use to store data of same type in non-contigeious manner is memory.      

        //Creating a linked list
        Node head = new Node(20);                  //Object of Node
        Node second = new Node(12);                //Object of Node
        Node third = new Node(5);                  //Object of Node
        Node fourth = new Node(47);                //Object of Node

        //Linking the nodes
        head.next = second;                            //connect head's next to second   ->  head.next == second
        second.next = third;
        third.next = fourth;

        //Printing the linked list
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}
