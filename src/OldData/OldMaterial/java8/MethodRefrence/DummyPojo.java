package OldData.OldMaterial.java8.MethodRefrence;

public class DummyPojo {
    private int num;
    private String name;

    public DummyPojo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DummyPojo{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
