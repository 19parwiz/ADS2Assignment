import MyCollections.ArrayList.MyArrayList;
import MyCollections.MinHeap.MyMinHeap;
import MyCollections.MyLinkedList.MyLinkedList;
import MyCollections.MyLinkedList.MyNode;
import MyCollections.MyList;
import MyCollections.Queue.MyQueue;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        q.addLeft(4);
        q.addLeft(5);
        q.addLeft(7);
        System.out.println(q.popLeft());
        System.out.println(q.popLeft());
        System.out.println(q.popLeft());

    }
}