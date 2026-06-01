class Node{
    int data;
    Node next;
}
class SinglyLinkedList{
    Node head;
    void insertfirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }
    void insertlast(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(head == null){
            head = newNode;
        }
        else{
            Node temp =head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }
    void insertpos(int pos, int val){
        Node newNode = new Node();
        newNode.data = val;
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1){
            insertfirst(val);
        }
        Node temp = head;
        for(int i = 1; i<pos-1 && temp!=null; i++){//here we give pos-1 because we want to stop at the node before the position where we want to insert the new node, and we also check if temp is not null to avoid null pointer exception
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void deletelast(){
        Node newNode = new Node();
        if(head == null){
            System.out.println("List already null");
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next=null;
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
public class linkedlistexample
{
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insertfirst(10);
		sl.display();
		sl.insertfirst(20);
		sl.display();
		sl.insertlast(30);
		sl.display();
		sl.insertpos(2, 45);
		sl.display();
        sl.deletelast();
		sl.display();
	}
}