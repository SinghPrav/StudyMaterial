package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.DirectoryExample;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem{
    String directoryName;
    List<IFileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void addFileSystem(IFileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name is:: " + directoryName);
        for(IFileSystem fileSystem: fileSystems) {
            fileSystem.ls();
        }
    }
}
