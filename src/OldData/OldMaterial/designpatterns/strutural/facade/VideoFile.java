package OldData.OldMaterial.designpatterns.strutural.facade;

public class VideoFile {
    private String fileName;
    private String codecType;

    public VideoFile(String fileName, String codecType) {
        this.fileName = fileName;
        this.codecType = codecType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCodecType() {
        return codecType;
    }

    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }
}
