package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.DirectoryExample;

public class File implements IFileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("The file name is:: " + fileName);
    }
}
