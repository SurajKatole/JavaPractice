package LinkedList;

public class LinkedListImplementation {
    Node head;
    Node tail;
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //add - first
    public void  addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add - last
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //delete first
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }

        secondLast.next=null;
    }

    //print list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else
        {
            Node currNode = head;
            while(currNode.next!=null)
            {
                System.out.print(currNode.data + " -> ");
                currNode=currNode.next;
            }
            System.out.println(currNode.data);
        }
    }


    public static void main(String[] args) {
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.addFirst(10);
        ll.addLast(15);
        ll.addLast(5);
        ll.print();
        ll.deleteFirst();
        ll.print();
        ll.deleteLast();
        ll.print();

    }
}
