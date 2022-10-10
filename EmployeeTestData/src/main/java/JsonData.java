import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.Json;
import javax.json.JsonWriter;
import javax.json.stream.JsonGenerator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.server.UID;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JsonData {


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        OutputStream fos = Files.newOutputStream(Path.of("sample.json"));

        fos.write("{\"data\": [".getBytes(StandardCharsets.UTF_8));
        for(int i=0; i<10; i++){
            String emp = mapper.writeValueAsString(RandomEmployeeGenerator.randomEmployee());


            if(i > 0)
                fos.write(",".getBytes(StandardCharsets.UTF_8));
            fos.write(emp.getBytes(StandardCharsets.UTF_8));
        }
        fos.write("]}".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
