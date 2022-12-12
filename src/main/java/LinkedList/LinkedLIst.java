package LinkedList;

import java.util.*;

public class LinkedLIst<T> {
    Node head;
    class Node {
        T data;  //a parameterized type
        Node next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    public LinkedLIst insert(LinkedLIst linkedLIst , T data){
        Node new_node = new Node (data);
        if (linkedLIst.head == null){
            linkedLIst.head = new_node;
        }else {
            Node last = linkedLIst.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }

        return linkedLIst;
    }
    public void print(LinkedLIst linkedLIst){
        Node currentNode = linkedLIst.head;
        System.out.print ("Linked List : ");
        while (currentNode != null){
            if (currentNode.next != null) {
                System.out.print (currentNode.data + ", ");
            }else {
                System.out.print (currentNode.data);
            }
            currentNode = currentNode.next;
        }
        System.out.println ();
    }
}
