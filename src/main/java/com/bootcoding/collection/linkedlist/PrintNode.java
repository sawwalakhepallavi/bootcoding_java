package com.bootcoding.collection.linkedlist;

import java.util.List;

public class PrintNode {
    public ListNode addNode(){

        ListNode firstNode=new ListNode(10);
        ListNode secondNode=new ListNode(20);
        ListNode thirdNode=new ListNode(30);
        ListNode forthNode=new ListNode(40);

        ListNode head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        forthNode.next=null;

        return head;

    }
    public void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        PrintNode printNode=new PrintNode();
        ListNode head=printNode.addNode();
        printNode.print(head);
    }
}

