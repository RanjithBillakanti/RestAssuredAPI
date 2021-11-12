package pojo.GetServiceAPI;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static Service service() throws IOException {
        String bodyString;

        byte[] bytesFromJson = Files.readAllBytes(Paths.get("C:\\Users\\Billakanti.K\\IdeaProjects\\RestAssuredAPI\\RestAssuredAPI\\src\\main\\java\\pojo\\GetServiceAPI\\getService.json"));
        bodyString = new String(bytesFromJson);
        ObjectMapper objectMapper = new ObjectMapper(); //object mapper provides functionality for reading and writing json
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(bodyString, Service.class); // mapping Registration register.json file & pojo class


    }
}
