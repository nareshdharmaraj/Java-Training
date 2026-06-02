public class circulardoublylinkedlistexample
{
	public static void main(String[] args) {
		circulardoubly cd = new circulardoubly();
		cd.insertfirst(10);
// 		cd.display();
		cd.insertfirst(20);
// 		cd.display();
		cd.insertfirst(30);
// 		cd.display();
		cd.insertlast(40);
// 		cd.display();
		cd.insertpos(4, 25);
		cd.display();
		cd.deletefirst();
// 		cd.display();
		cd.deletelast();
// 		cd.display();
		cd.deletepos(9);
		cd.display();
	}
}
class Node{
    int data;
    Node next;
    Node pre;
}
class circulardoubly{
    Node head = null;
    Node tail = null;
    void insertfirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head == null){
            head = tail = newNode;
            newNode.next = head;
            newNode.pre = head;
        }
        else{
            newNode.next = head;
            tail.next=newNode;
            newNode.pre = tail;
            head.pre = newNode;
            head = newNode;
        }
    }
    
    void insertlast(int val){
        Node newNode = new Node();
        newNode.data = val;
        if (head == null){
            insertfirst(val);
        }
        else{
            tail.next = newNode;
            newNode.pre = tail;
            newNode.next = head;
            tail = newNode;
            head.pre = tail;
        }
    }
    
    void insertpos(int pos, int val){
        if(pos == 1){
            insertfirst(val);
        }
        if(pos < 1){
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        Node newNode = new Node();
        newNode.data = val;
        for(int i = 1; i < pos-1 && temp.next != head; i++){
            temp =  temp.next;
        }
        if(temp == tail){
            System.out.println("Positon out of Range");
            return;
        }
        newNode.next = temp.next;
        temp.next.pre = newNode;
        temp.next = newNode;
        newNode.pre = temp;
       
    }
    
    void deletefirst(){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        else{
            head = head.next;
            head.pre = tail;
            tail.next = head;
        }
    }
    
    void deletelast(){
        if(head == null){
            deletefirst();    
        }
        tail = tail.pre;
        tail.next = head;
        head.pre = tail;
        // return;
    }
    
    void deletepos(int pos){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        if(pos < 1){
            System.out.println("Invalid Position min");
            return;
        }
        if(pos == 1){
            deletefirst();
        }
        Node temp = head;
        for (int i = 1; i<pos-1 && temp.next != head; i++){
            temp = temp.next;
        }
       
        if(temp.next==head){
            System.out.println("Invalid position max");
            return;
        }
        temp.next = temp.next.next;
        temp.next.pre = temp;
    }
    
    void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp=head;
        do{
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }while(temp!= head);
        System.out.println();
    }
}
