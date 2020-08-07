package com.home;

public class FindMiddleNodeLinkedList {
        Node head;
        class  Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                next=null;
            }
        }


    //Insert a node in the front of the linked list
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    //Finding the middle node.
    public void findThemiddleNode(){
            int count=0;
            Node pointer=head;
            Node mid=head;
            while(pointer != null){
                pointer=pointer.next;
                count++;
             if(count!=1&&count%2!=0){

                      mid=mid.next;
                }
            }
            if(count%2!=0){
                System.out.println("Middle Node:"+mid.data);
            }else

            {
                System.out.println("Middle Node:"+mid.next.data);
            }

    }
    public static  void main(String [] args){
        FindMiddleNodeLinkedList linkedList=new FindMiddleNodeLinkedList();
       /* linkedList.push(6);*/
        //linkedList.push(5);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);
        linkedList.findThemiddleNode();
    }

}
