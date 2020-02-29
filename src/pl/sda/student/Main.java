package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // !!! serializacja - przeksztalcenie obiektu na forme np. tekstową !!!
    // będziemy serializować ten obiekt do JSON'a

    public static void main(String[] args) {

        Student student = new Student("Jan",
                "Kowalski",
                32);

        Student student1 = new Student("Andrzej",
                "Kowalski",
                15);

        Student student2 = new Student("Janusz",
                "Kowalski",
                25);

        Student student3 = new Student("Janek",
                "Kowalski",
                30);

        Student student4 = new Student("Zbyszek",
                "Kowalski",
                22);

        Student student5 = new Student("Alex",
                "Kowalski",
                55);

        List<Student> studentLista = new ArrayList<>();
        studentLista.add(student);
        studentLista.add(student1);
        studentLista.add(student2);
        studentLista.add(student3);
        studentLista.add(student4);
        studentLista.add(student5);


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("student5.json"), student5);
            objectMapper.writeValue(new File("studentLista.json"), studentLista);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
