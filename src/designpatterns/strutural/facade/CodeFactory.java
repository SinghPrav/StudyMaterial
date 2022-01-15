package designpatterns.strutural.facade;

public class CodeFactory {
    private String type;

    public static Codec extract(VideoFile file){
        String type = file.getFileName();
        if(type.equalsIgnoreCase("MP4")){
            return new Mp4CompressionCodec();
        }else {
            return new OggCompressCodec();
        }
    }
}
