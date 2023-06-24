### bootcoding_java

# what is LinkedList ?
Linked List is a part of the Collection framework present in java.util package. This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node.

# How the LinkedList works ?
- A linked list in Java is a dynamic data structure whose size increases as you add the elements and decreases as you remove the elements from the list.
- The elements in the linked list are stored in containers.
- The list holds the link to the first container.
- All the containers have a link to the next container in the list.
- Whenever you add an element to the list using add() operation, a new container is created, and this container is linked to the other containers in the list.


## There Are Various Types of Linked List

1. Singular Linked List 
2. Doubly Linked List 
3. Circular Linked List


**1. Singular Linked List**

![Untitled Diagram drawio](https://github.com/sawwalakhepallavi/bootcoding_java/assets/101243878/f7234119-5515-4506-a594-cfe05593b200)

- The type of linked list consisting of a sequence of nodes where each node consists of data and a link to the next node, that can be traversed from the first node of the list (also called as head) to the last node of the list (also called as Tail)  and is unidirectional is called Singly Linked list.
- The above figure demonstrates a singly linked list.
- Each element in the list is called a node.
- A node is made of two parts, namely data and pointer.
- Data is the data stored in the   and the pointer is the next node in the list.
- The first node in the list is referred to as the head of the list.
- The last node in the list is the tail, and it points to NULL.

## code on singular linked list
```
public class SinglyLinkedList 

{    
    class Node
    {    
        int data;    
        Node next;                
        public Node(int data) 
        {    
            this.data = data;    
            this.next = null;    
        }    
    }         
    public Node head = null;    
    public Node tail = null;         
    public void insert(int data) 
    {    
        Node newNode = new Node(data);               
        if(head == null) 
        {    
            head = newNode;    
             tail = newNode;    
         }    
        else 
        {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }          
    public void displaylist() 

    {    
        Node current = head;               
        if(head == null)
        {    
            System.out.println("The given list is empty");    
            return;    
        }    

        System.out.println("The data in the given list are: ");    

        while(current != null) 

        {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }            

    public static void main(String[] args)
    {    
        SinglyLinkedList newList = new SinglyLinkedList();                

        newList.insert(10);    
        newList.insert(30);   
        newList.insert(50); 
        newList.insert(70); 
        newList.insert(100);
        newList.displaylist();    

    }    

}    
```
### Output of the Code:-
```
The data in the given list are:
10 30 50 70 100
```
**2. Doubly Linked List**



- This type of a linked list consists of a sequence of nodes where each node consists of data and two pointers, namely the previous pointer pointing to the previous node and the subsequent pointer that points to the next node that is part of the list. This can be traversed from the first node of the list to the last node of the list and vice versa, and this is called Doubly Linked list.
- The above figure demonstrates a doubly linked list.
- Data is the data stored in the node and each node consists of two pointers namely the previous pointer and the next pointer.
- The previous pointer points, as the name suggests to the previous node that is part of the list.
- The pointer after the current one, points to the next node on the list.

## code on doubly linked list
```
{    
    class Node
    {  
        int data;  
        Node previous;  
        Node next;   
        public Node(int data)
        {  
            this.data = data;  
        }  
    }   
    Node head, tail = null;   
    public void insert(int data)
    {  
        Node newNode = new Node(data);   
        if(head == null) 
        { 
            head = tail = newNode;   
            head.previous = null;  
            tail.next = null;  
        }  
        else 
        { 
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    } 
    public void displaylist() 
    {
        Node current = head; 
        if(head == null) 
        {  
            System.out.println("The given list is empty");  
            return;  
        }
        System.out.println("The data in the doubly linked list are: ");  
        while(current != null) 
        {
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    } 
    public static void main(String[] args)
    {  
        DoublyLinkedList newList = new DoublyLinkedList();  
        newList.insert(10);  
        newList.insert(30);  
        newList.insert(50);  
        newList.insert(70);  
        newList.insert(100);   
        newList.displaylist();  
    }  
}  
```
### Output of the Code:-
```
The data in the doubly linked list are: 
10 30 50 70 100
```
**3. Circular Linked List**

![cir drawio - Copy](https://github.com/sawwalakhepallavi/bootcoding_java/assets/101243878/bc614c79-4fc8-4ea5-8af9-346942169afa)

It is the type of linked list consisting of a sequence of nodes where each node consists of data and a link to the next node and the last node in the list (also called as tail) that points to the first node in the list (also called as head) is called as Circular Linked List.
## code on circular linked list
```
public class CircularLinkedList
{  
    public class Node
    {  
        int data;  
        Node next;  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
    public void insert(int data)
    {  
        Node newNode = new Node(data);  
        if(head == null) 
        {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else 
        {  
            tail.next = newNode;  
            tail = newNode;  
            tail.next = head;  
        }  
    }   
    public void displaylist() 
    {  
        Node current = head; 
        if(head == null)
         {  
            System.out.println("The given list is empty");  
        }  
        else 
        {  
            System.out.println("The data in the circular linked list are: "); 
            
             do{  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }
            while(current != head);  
            System.out.println();  
        }  
    }   
    public static void main(String[] args) 
    {  
        CircularLinkedList newList = new CircularLinkedList();  
        newList.insert(10);  
        newList.insert(30);  
        newList.insert(50);  
        newList.insert(70);
        newList.insert(100);
        newList.displaylist();  
    }  
}  
```
### Output of the Code:-
```
The data in the circular linked list are: 
10 30 50 70 100
```

## LinkedList Methods
the LinkedList provides several methods to do certain operations more efficiently

| Methods | Description|
|---|--------------------------------------------|
|addFirst()| Adds an item to the beginning of the list. |
|addLast()|Add an item to the end of the list|
|removeFirst()|Remove an item from the beginning of the list|
|removeLast()|Remove an item from the end of the list|
|getFirst()|Get the item at the beginning of the list|
|getLast()|Get the item at the end of the list|
