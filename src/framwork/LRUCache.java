package framwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Node {
    int value;
    int key;
    Node left;
    Node right;
}
public class LRUCache {

    HashMap<Integer, Node> hashmap;
    Node start, end;
    int LRU_SIZE = 4; // Here i am setting 4 to test the LRU cache
    // implementation, it can make be dynamic
    public LRUCache() {
        hashmap = new HashMap<Integer, Node>();
    }

    public int getEntry(int key) {
        if (hashmap.containsKey(key)) // Key Already Exist, just update the
        {
            Node node = hashmap.get(key);
            removeNode(node);
            addAtTop(node);
            return node.value;
        }
        return -1;
    }

    public void putEntry(int key, int value) {
        if (hashmap.containsKey(key)) // Key Already Exist, just update the value and move it to top
        {
            Node node = hashmap.get(key);
            node.value = value;
            removeNode(node);
            addAtTop(node);
        } else {
            Node newnode = new Node();
            newnode.left = null;
            newnode.right = null;
            newnode.value = value;
            newnode.key = key;
            if (hashmap.size() > LRU_SIZE) // We have reached maxium size so need to make room for new element.
            {
                hashmap.remove(end.key);
                removeNode(end);
                addAtTop(newnode);

            } else {
                addAtTop(newnode);
            }

            hashmap.put(key, newnode);
        }
    }
    public void addAtTop(Node node) {
        node.right = start;
        node.left = null;
        if (start != null)
            start.left = node;
        start = node;
        if (end == null)
            end = start;
    }

    public void removeNode(Node node) {

        if (node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }

        if (node.right != null) {
            node.right.left = node.left;
        } else {
            end = node.left;
        }
    }

    public void dispaly(){
        for (Map.Entry<Integer, Node> integerNodeEntry : hashmap.entrySet()) {
            System.out.println("Elemets: " + integerNodeEntry.getKey() + " ");
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        LRUCache lrucache = new LRUCache();
        lrucache.putEntry(1, 1);
        lrucache.putEntry(10, 15);
        lrucache.putEntry(15, 10);
        lrucache.putEntry(10, 16);
        lrucache.putEntry(12, 15);
        lrucache.putEntry(18, 10);
        lrucache.putEntry(13, 16);
        lrucache.dispaly();
        System.out.println(lrucache.getEntry(1));
        System.out.println(lrucache.getEntry(10));
        System.out.println(lrucache.getEntry(15));

    }
}
