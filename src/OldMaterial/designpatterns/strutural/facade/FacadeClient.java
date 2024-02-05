package OldMaterial.designpatterns.strutural.facade;

import java.io.File;

public class FacadeClient {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        File file = videoConversionFacade.convertVideo("newVideo", "MP4");
        System.out.println("Final File name:...."+file.getName());
    }
}
