package lt.codeacademy.javau8.rysiai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    StudentRepository str;
    @Autowired
    SchoolRepository scr;

    @Override
    public void run(String... args) throws Exception {

        School school = new School();

        Student andrius = new Student("Andrius");
        Student arvydas = new Student("Arvydas");
        Student voldemaras = new Student("Voldemaras");
        
        scr.save(school);
        school.addStudent(andrius);
        school.addStudent(arvydas);
        school.addStudent(voldemaras);
        
        
        str.saveAll(Arrays.asList(andrius, arvydas, voldemaras));

        school.setName("Atzalyno vid.");


        

    }
}
