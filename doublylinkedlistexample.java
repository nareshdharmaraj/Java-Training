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
    
    void deletelast(){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next =null;
        }
    }
    
    void deleteposition(int pos){
        if(pos == 1){
            deletefirst();
        }
        if(pos < 1 ){
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        for(int i = 1; i<pos && temp!=null; i++){
            temp = temp.next;
        }
        temp.pre.next = temp.next;
        if(temp.next != null){
            temp.next.pre = temp.pre;
        }
        
    }
    void displayf(){
        System.out.print("Forward: ");
        Node temp=head;//we create a temp node to traverse the linked list, we start from the head node and we keep moving to the next node until we reach the end of the linked list, which is when temp becomes null
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;//we move to the next node by assigning temp to temp.next, this way we can traverse the linked list and print the data of each node until we reach the end of the linked list, which is when temp becomes null
        }
        System.out.println();
        displayb();
    }
    void displayb(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.print("Backward: ");
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.pre;
        }
        System.out.println();
    }
}
public class doublylinkedlistexample
{
	public static void main(String[] args) {
		doublyLinkedList dl = new doublyLinkedList();
		dl.insertfirst(10);
		dl.displayf();
        dl.insertlast(50);
		dl.displayf();
		dl.insertfirst(20);
		dl.displayf();
        dl.insertlast(30);
		dl.displayf();
		dl.insertfirst(40);
		dl.displayf();
        dl.insertlast(55);
		dl.displayf();
        dl.insertposition(2,25);
		dl.displayf();
		dl.deletefirst();
		dl.displayf();
		dl.deletelast();
		dl.displayf();
		dl.deleteposition(2);
		dl.displayf();
	}
}