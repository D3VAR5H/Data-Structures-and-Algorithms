
public class doubleLinklist {
    private Node head;
    private Node tail;
    private int size = 0;
    static class Node{
      
        int i;
        Node next;
        Node prev;
        Node(int i){
            this.i = i;
        }
        public void displayData(){
            System.out.print(" " + i);
        }
    }

    public doubleLinklist(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertFirst(int i){

        Node newNode = new Node(i);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void insertLast(int i){
        Node newNode = new Node(i);

        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int i, int index){
        if(!isValidIndex(index)){
            throw new IndexOutOfBoundsException("Index " + index +" not valid for linked list of size " + size);
        }
        Node newNode = new Node(i);
        Node current = head;

        if(index == 0){
            insertFirst(i);
        }

        else if(index == size){
            insertLast(i);
        }else{
            for(int j = 0; j < index && current.next != null; j++){
                current = current.next;
            }
            newNode.next = current;
            current.prev.next = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
            size++;
        }

    }

    public Node deleteFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        Node first = head;
        if(head.next == null){
            tail = null;
        }else{

            head.next.prev = null;
        }
        head = head.next;
        size--;
        return first;
    }

    public Node deleteLast(){
        if(tail == null){
            throw new RuntimeException("List is empty");
        }
        Node last = tail;
        if(head.next == null){
            head = null;
        }else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        size--;
        return last;
    }

    public Node deleteAtIndex(int index){
        if(!isValidIndex(index+1)){
            throw new IndexOutOfBoundsException("Index " + index +" not valid for linked list of size " + size);
        }
        Node current = head;

        if(index == 0){
            return deleteFirst();
        }
        else if(index == size-1){
            return deleteLast();
        }else{
            for(int j = 0; j < index && current.next != null; j++){
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        return current;
    }

    private boolean isValidIndex(int index){
        return index >= 0 && index <= size;
    }

    public void displayForward(){
        Node current = head;
        while(current != null){
            current.displayData();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward(){
        Node current = tail;
        while(current != null){
            current.displayData();
            current = current.prev;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        doubleLinklist list = new doubleLinklist();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(30);
        list.insertLast(40);
        list.displayForward();
        list.insertAtIndex(50, 4);
        System.out.println("Linked list backward traversal");
        list.displayBackward();
        System.out.println("Linked list forward traversal");
        list.displayForward();
        Node node = list.deleteAtIndex(2);
        System.out.println("Node with value "+ node.i + " deleted");
        list.displayForward();
    }
}