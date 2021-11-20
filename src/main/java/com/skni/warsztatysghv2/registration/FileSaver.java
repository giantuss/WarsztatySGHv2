package com.skni.warsztatysghv2.registration;
import java.io.FileWriter;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class FileSaver {

    public void saveToFile(Student student){
        try {
            FileWriter fileWriter = new FileWriter("StudentsList.txt",true);
            fileWriter.write(student.toString());
            fileWriter.close();
        } catch (IOException IOE) {
            ;
        }
    }
}
