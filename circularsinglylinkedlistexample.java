public class circularsinglylinkedlistexample{
    public static void main(String[] args){
        singlycircular scl = new singlycircular();
        scl.insertfirst(10);
        scl.displayf();
        scl.insertlast(30);
        scl.displayf();
        scl.insertfirst(20);
        scl.displayf();
        scl.insertlast(40);
        scl.displayf();
        scl.insertposition(2, 60);
        scl.displayf();
        scl.deletefirst();
        scl.displayf();
        scl.deletelast();
        scl.displayf();
        scl.deleteposition(2);
        scl.displayf();
    }
}
class Node{
    int data;
    Node next;
}
class singlycircular{
    Node head = null;
    Node tail = null;//in singlycircular linked list we have a new term called "tail" -> it represents the last node.
    void insertfirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head == null){
            head = tail = newNode;
            newNode.next = head;
        }
        else{
            tail.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    void insertlast(int val){
        Node newNode = new Node();
        if(head == null){
            head = tail = newNode;
            newNode = head;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }
    void insertposition(int pos, int val){
        Node newNode = new Node();
        if(pos == 1){
            insertfirst(val);
        }
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }
        newNode.data = val;
        Node temp = head;
        for(int i = 1; i < pos-1 && temp!= null; i++){
            temp = temp.next;
        }
        if(temp == tail && pos >2){
            System.out.println("Out of bound");
        }
        else{
            newNode.next = temp.next;
            temp.next = newNode;
            if(temp == tail){
                temp.next = newNode;
                newNode.next = head;
            }
        }
    }
    void deletefirst(){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        else if(head == tail){
            head = tail = null;
            return;
        }
        else{
            head=head.next;
            tail.next=head;
            
        }
    }
    void deletelast(){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        else if (head == tail){
            deletefirst();
        }
        else{
            Node temp = head;
            while(temp.next!= tail){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }
    void deleteposition(int pos){
        if(pos == 1){
            deletefirst();
        }
        else if (pos < 1){
            System.out.println("Invalid position");
        }
        else if(head == null){
            System.out.println("List already empty");
        }
        Node temp = head;
        for (int i = 1; i<pos-1 && temp!= tail; i++){
            temp = temp.next;
        }
          if(temp.next == tail){
            deletelast();
        }
        temp.next = temp.next.next;
      
    }
    
    void displayf(){
        if(head == null){
            System.out.println("List already empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }while(temp!=head);
        
        System.out.println();
    }
}