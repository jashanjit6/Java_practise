public class LinkedList {
    public static void main(String[] args){
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node (30);
        Node forty = new Node (40);
        Node fifty = new Node (50);

        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);

        head = insertAtFirst(head,5);
        printLinkedList(head);

    }

    public static Node insertAtFirst(Node head, int data){
        Node nn = new Node(data);
        nn.setNext(head);
        head = nn;
        return head;
    }

    public static void printLinkedList(Node head){
        Node curr = head;
        //System.out.println(curr.getData());
        while (curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

    }
}
