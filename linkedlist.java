import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
 public LinkedList()
 {
     this.head = null;
 }
    
    public void addElement(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void addAtFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public void addAtPosition(int position ,int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            System.out.println("list is empty");
        }
        else{ 
            Node temp = head;
            for(int i=1 ;i<position-1 && temp.next!=null;i++){
                temp = temp.next;
            }
            if(temp.next== null ){
                System.out.println("invalid position");
            }
            else{
            newNode.next = temp.next;
            temp.next = newNode;
                
            }
        }
        
    }
    
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            System.out.print("The LinkedList is:");
            Node temp = head;
            while (temp != null) {
                
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void deleteLastElement(){
        if(head == null){
            System.out.println("list is empty");
        }else {
            Node last = head;
            Node secondLast = head;
            while (last.next != null) {
                secondLast = last;
                last = last.next;
            }
            System.out.println("last element :"+ last.data);
            secondLast.next = null;
    }
}
public void deleteFirstElement(){
    if(head == null){
    System.out.println("list is empty");}
    else{
        head = head.next;
    }
}
public void deleteAtPosition(int position)
{
     if(position == 1){
    System.out.println("enter between position");
     }
     else{
         Node temp = head;
         for(int i = 1;i<position-1 && temp.next!= null;i++){
             temp = temp.next;
         }
         if(temp.next == null){
             System.out.println("entered position is not available ");
         }
         else{
             temp.next=temp.next.next;
         }
     }
}
}

public class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
         System.out.println("------------LinkedList-------------");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.To addAtLast");
            System.out.println("2.To Add At First");
            System.out.println("3.To Add At Specific Position");
            System.out.println(" 4.Delete Last Element");
            System.out.println("5.Delete First Element");
             System.out.println("6.Delete At Specific Position");
              System.out.println("7.Display the List");
               System.out.println("0 .EXIT");
                System.out.println("choose your option");
                choice = sc.nextInt();
                switch (choice){
                    case 1 :System.out.println("enter the element:");
                        int element1 = sc.nextInt();
                        list.addElement(element1);
                        break;
                       case 2 :System.out.println("enter the element:");
                        int element2 = sc.nextInt();
                        list.addAtFirst(element2);
                        break;
                        case 3 :System.out.println("enter the element:(position & element");
                        int addatposition = sc.nextInt();
                        int data = sc.nextInt();
                        list.addAtPosition(addatposition,data);
                        break;
                        case 4:list.deleteLastElement();
                            System.out.println("deleted Last Element");
                            break;
                            case 5:list.deleteFirstElement();
                            System.out.println("deleted First Element");
                            break;
                            case 6:System.out.println("enter position");
                                int position = sc.nextInt();
                                list.deleteAtPosition(position);
                            System.out.println("deleted "+position+" Element");
                            break;
                            case 7:
                                list.display();
                            break;
                            case 0: System.out.println("EXISTING......");
                            break;
                        
                        default : System.out.println("Invaled choice");
                }
        }
                while(choice != 0);
        sc.close();
        
    }
    
}
