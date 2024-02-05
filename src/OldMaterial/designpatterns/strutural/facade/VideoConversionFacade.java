package OldMaterial.designpatterns.strutural.facade;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String fileFormat){
        System.out.println(" Video conversion facade started....");
        VideoFile file = new VideoFile(fileName, fileFormat);
        Codec source = CodeFactory.extract(file);
        Codec destination;
        if(fileFormat.equalsIgnoreCase("MP4")){
            destination = new OggCompressCodec();
        }else {
            destination = new Mp4CompressionCodec();
        }
        VideoFile bufferVideo = new BitrateReader().read(file, source);
        VideoFile convertedVideo = new BitrateReader().convert(bufferVideo, destination);
        File newFile = new BitrateReader().getConvertedVideoFile(convertedVideo);
        System.out.println("Conversion completed :....");
        return newFile;
    }
}
