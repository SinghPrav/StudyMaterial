package OldMaterial.Exception;

import java.io.IOException;

public class JacksonUtil {

    private JsonNode  jsonNode= new ObjectMapperWrapper().toJsonNodeUnchecked("");

    public static JsonNode toJsonNode(String value) throws IOException {
        return new ObjectMapperWrapper().toJsonNode(value);
    }


}
