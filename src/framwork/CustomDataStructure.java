package framwork;

import java.util.ArrayList;

public class CustomDataStructure {
    // class Pair
    static class Pair{
        int element;
        int minElement;

        public Pair(int element, int minElement) {
            this.element = element;
            this.minElement = minElement;
        }
    }
    int min;
    ArrayList<Pair> pairArrayList = new ArrayList<>();

    public CustomDataStructure() {
        this.min = Integer.MAX_VALUE;
    }

    // utility function for adding a new element
    void addElement(int x)
    {
        if(pairArrayList.size() == 0 || x < min)
        {
            min=x;
        }
        Pair pair = new Pair(x,min);
        pairArrayList.add(pair);
        System.out.println(x + " inserted successfully");
    }

    // utility function for returning last element of stack
    int getLastElement()
    {
        if (pairArrayList.size() == 0)
        {
            System.out.println("UnderFlow Error");
            return -1;
        }
        else
        {
            return pairArrayList.get(pairArrayList.size() - 1).element;
        }
    }

    // utility function for removing last element successfully;
    void removeLastElement()
    {

        if (pairArrayList.size() == 0)
        {
            System.out.println("UnderFlow Error");
        }
        else if (pairArrayList.size() > 1)
        {
            min= pairArrayList.get(pairArrayList.size() - 2).minElement;
        }
        else
        {
            min=Integer.MAX_VALUE;
        }
        pairArrayList.remove(pairArrayList.size() - 1);
        System.out.println("removed successfully");
    }

    // utility function for returning min element till now;
    int getMin()
    {
        if (pairArrayList.size() == 0)
        {
            System.out.println("UnderFlow Error");
            return -1;
        }
        return pairArrayList.get(pairArrayList.size() - 1).minElement;
    }

    // Driver Code
    public static void main(String[] args) {
        CustomDataStructure newStack = new CustomDataStructure();
        newStack.addElement(5);
        newStack.addElement(7);
        newStack.addElement(3);
        System.out.println("min element :: "+newStack.getMin());
        newStack.removeLastElement();
        newStack.addElement(2);
        newStack.addElement(9);
        System.out.println("last element :: "+newStack.getLastElement());
        newStack.addElement(0);
        System.out.println("min element :: "+newStack.getMin());
        newStack.removeLastElement();
        newStack.addElement(11);
        System.out.println("min element :: "+newStack.getMin());
    }
}
