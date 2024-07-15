package OldData.OldMaterial.framwork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRU {
    private Set<Integer> cache;
    private int size;

    LRU(int size ){
        this.cache = new LinkedHashSet<>(size);
        this.size = size;
    }

    public boolean get(int key){
        if(!cache.contains(key)){
            return  false;
        }else {
            cache.remove(key);
            cache.add(key);
            return true;
        }
    }

    public void put(int key){
        if(cache.size() == size){
            int iterateKey = cache.iterator().next();
            cache.remove(iterateKey);
        }
        cache.add(key);
    }

    public void refer(int key){
        if(!get(key)){
            put(key);
        }
    }

    public void dispaly(){
        LinkedList<Integer> linkedList = new LinkedList<>(cache);
        Iterator<Integer> itr = linkedList.descendingIterator();
        while ((itr.hasNext())){
            System.out.println("Elemets: "+itr.next()+ " ");
        }
    }

    public  static void  main(String str[]){
        LRU lru = new LRU(4);
        lru.refer(1);
        lru.refer(10);
        lru.refer(15);
        lru.refer(10);
        lru.refer(12);
        lru.refer(18);
        lru.refer(13);
        lru.dispaly();
    }
}
