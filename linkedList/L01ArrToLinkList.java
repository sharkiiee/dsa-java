// Program to convert the array in the linked list.

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


public class L01ArrToLinkList {

    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover =  temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,8};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
