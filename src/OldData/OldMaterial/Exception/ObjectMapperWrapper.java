package OldData.OldMaterial.Exception;

import java.io.IOException;

public class ObjectMapperWrapper {
   // public static final ObjectMapperWrapper INSTANCE = new ObjectMapperWrapper();

    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonNode toJsonNode(String value) throws IOException {
        try {
            return objectMapper.readTree(value);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public JsonNode toJsonNodeUnchecked(String value){
        try {
            return objectMapper.readTree(value);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

