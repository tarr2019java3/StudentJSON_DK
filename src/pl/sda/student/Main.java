package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan",
                "Kowalski",
                32);

        // !!! serializacja - przeksztalcenie obiektu na forme np. tekstową !!!
        // będziemy serializować ten obiekt do JSON'a

        ObjectMapper objectMapper = new ObjectMapper();


        try {
            objectMapper.writeValue(new File("student.json"), student);
        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
