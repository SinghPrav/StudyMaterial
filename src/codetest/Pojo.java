package codetest;

public class Pojo implements  IPojo{
    String name;
    int amount;

    public Pojo() {
        super();
    }

    @Override
    public int getData() {
        return amount;
    }

}
