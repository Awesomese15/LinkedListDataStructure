package com.home;

/*Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 then output should be 3.

If there are even nodes, then there would be two middle nodes, we need to print second middle element.
For example, if given linked list is 1->2->3->4->5->6 then output should be 4.*/

/*
Method: Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
When the fast pointer reaches end slow pointer will reach middle of the linked list.
* */

public class UserLinkedList {
    //head of the LinkedList
    Node head;
    //LinkedList Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    //Function to print the middle
    void printMiddle(){
        Node slow_pointer=head;
        Node fast_pointer=head;

        if(head != null){
            while (fast_pointer != null && fast_pointer.next != null){
                fast_pointer=fast_pointer.next.next;
                slow_pointer=slow_pointer.next;
            }
            System.out.println("The middle element is [" +
                    slow_pointer.data + "] \n");
        }

    }

    //Insert a node in the front of the linked list
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void printLinkedList(){
        Node t_node=head;
        while (t_node != null){
            System.out.print(t_node.data+"->");
            t_node=t_node.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        UserLinkedList llist = new UserLinkedList();
        for (int i=5; i>0; --i)
        {
            llist.push(i);
            llist.printLinkedList();
            llist.printMiddle();
        }
    }

}
