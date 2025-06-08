package LinkedList_Study.L2;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }

};

public class L2_CreateLinkedList_by_Array {

    //LinkedList Createtion method
    private static Node createLinkedList(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        int n = arr.length;

        for(int i = 1 ; i<n ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


    public static int Length(Node head){
        int count  = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    //Main Method
    public static void main(String[] args) {
        int arr[] = {4,9,12,45,65,152};

        Node head = createLinkedList(arr);
        Node reader = head;

        while(reader != null){
            System.out.println(reader.data);
            reader = reader.next;
        }

        System.out.println("Length of LinkedList is : "+Length(head));
    }


}
