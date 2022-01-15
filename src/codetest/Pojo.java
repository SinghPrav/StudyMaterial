package codetest;

public class Pojo implements  IPojo{
    String name;
    int amount;

    @Override
    public int getData() {
        return amount;
    }
}
