class Node{
    int data;
    Node next;
    Node pre;
}
class doublyLinkedList{
    Node head;
    void insertfirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.pre = null;
        if (head == null){
            newNode.next = null;
        }
        else{
            newNode.next = head;
            head.pre = newNode;
        }
        head = newNode;
    }
    void insertlast(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(head == null){
            newNode.pre = null;
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!= null){
                temp=temp.next;
            }
            temp.next = newNode;
            newNode.pre = temp;
        }
    }
    void insertposition(int pos, int val){
        Node newNode = new Node();
        newNode.data = val;
        if(pos == 1){
            insertfirst(val);
        }
        if(pos < 1){
            System.out.println("Invalid position");
        }
        else{
            Node temp = head;
            for(int i = 1; i <pos-1 && temp != null;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.pre = newNode;
            newNode.pre = temp;
            temp.next = newNode;
        }
    }
    void deletefirst(){
        if(head == null){
            System.out.println("List is already empty");
        }
        else{
            head = head.next;
            head.pre = null;
        }
    }
    void display(){
        Node temp=head;//we create a temp node to traverse the linked list, we start from the head node and we keep moving to the next node until we reach the end of the linked list, which is when temp becomes null
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;//we move to the next node by assigning temp to temp.next, this way we can traverse the linked list and print the data of each node until we reach the end of the linked list, which is when temp becomes null
        }
        System.out.println();
    }
}
public class doublylinkedlistexample
{
	public static void main(String[] args) {
		doublyLinkedList dl = new doublyLinkedList();
		dl.insertfirst(10);
		dl.display();
        dl.insertlast(50);
		dl.display();
        dl.insertposition(2,25);
		dl.display();
		dl.deletefirst();
		dl.display();
	}
}