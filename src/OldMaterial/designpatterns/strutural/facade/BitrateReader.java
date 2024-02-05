package OldMaterial.designpatterns.strutural.facade;

import java.io.File;

public class BitrateReader {

    public VideoFile read(VideoFile file, Codec codec){
        System.out.println("BitrateReader reading file......");
        return  file;
    }

    public VideoFile convert(VideoFile file, Codec codec){
        System.out.println("BitrateReader converting file......");
        return file;
    }

    public File getConvertedVideoFile(VideoFile file){
        System.out.println("Converted file name....");
        return new File("Temp");
    }
}
