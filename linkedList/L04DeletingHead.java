
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


public class L04DeletingHead {

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

    // function to find the length of the linked list
    private static int lengthofLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    // Method to traverse the Linked List
    private static void print(Node head){
        while(head!= null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

        // Method to remove the head of the linked list
    private static Node removesHead(Node head){
        if(head == null) return null;
        head = head.next;
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
