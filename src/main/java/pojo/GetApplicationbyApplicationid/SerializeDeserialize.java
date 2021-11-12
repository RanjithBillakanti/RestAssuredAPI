package pojo.GetApplicationbyApplicationid;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static GetapplicationbyApplicationid getapplicationbyApplicationid() throws IOException {
        String bodyString;
        String path= System.getProperty("user.dir");
        byte[] bytesFromJson = Files.readAllBytes(Paths.get(path+"\\src\\main\\java\\pojo\\GetApplicationbyApplicationid\\getApplicationapi.json"));
        bodyString = new String(bytesFromJson);
        System.out.println("Bodystring" +bodyString);
        ObjectMapper objectMapper = new ObjectMapper(); //object mapper provides functionality for reading and writing json
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(bodyString,GetapplicationbyApplicationid.class); // mapping Registration register.json file & pojo class


    }

}
