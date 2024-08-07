package OldData.OldMaterial.framwork;

import java.util.HashMap;
import java.util.Map;

public class LRuDoublyLinkedList {

    class DLinkedNode{
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }

    private void addNode(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        DLinkedNode prev = node.prev;
        DLinkedNode  next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(DLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    private DLinkedNode popTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }


    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;



    public LRuDoublyLinkedList(int capacity) {
        this.size = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        tail = new DLinkedNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if(node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);
            ++size;
            if(size > capacity){
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }

    public void display() {
        for (Map.Entry<Integer, DLinkedNode> integerNodeEntry : cache.entrySet()) {
            System.out.println("Elemets: " + integerNodeEntry.getKey() + " and Value:  "+integerNodeEntry.getValue().value);
        }
    }

    public void displayGetValue(int value) {
            System.out.println("get value: " + value);
    }

    public static void main(String[] args) {
        LRuDoublyLinkedList lRuDoublyLinkedList = new LRuDoublyLinkedList(4);
        lRuDoublyLinkedList.put(3, 30);
        lRuDoublyLinkedList.put(4, 40);
        lRuDoublyLinkedList.put(3, 50);
     //   lRuDoublyLinkedList.displayGetValue(lRuDoublyLinkedList.get(4));
      //  lRuDoublyLinkedList.put(6, 60);
        lRuDoublyLinkedList.put(7, 70);

        lRuDoublyLinkedList.display();
    }
}