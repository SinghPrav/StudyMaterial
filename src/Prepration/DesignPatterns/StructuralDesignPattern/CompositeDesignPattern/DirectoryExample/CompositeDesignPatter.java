package Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.DirectoryExample;

import Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.DirectoryExample.Directory;
import Prepration.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.DirectoryExample.File;

public class CompositeDesignPatter {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File movieName = new File("Abc");
        movieDirectory.addFileSystem(movieName);

        Directory comedyMovies = new Directory("Commedy");
        File cMovie = new File("Comedy1");
        comedyMovies.addFileSystem(cMovie);
        movieDirectory.addFileSystem(comedyMovies);
        movieDirectory.ls();
    }
}
