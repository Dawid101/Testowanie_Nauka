package pl.coderslab.week6;

import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.IOUtils;

import java.util.List;

public class StudentsJsonExample {
    public static void main(String[] args) throws Exception {
        String json = IOUtils.toString(JsonPathExample.class.getResourceAsStream("/data/students.json"));

        String name = JsonPath.read(json,"$.student.firstName");
        String lastName = JsonPath.read(json,"$.student.lastName");
        Double avgGrade = JsonPath.read(json,"$.student.averageGrade");
        List<String> subjects = JsonPath.read(json,"$.student.subjects");
        String fatherName = JsonPath.read(json,"$.student.parents.father.firstName");
        String fatherLastName = JsonPath.read(json,"$.student.parents.father.lastName");
        String motherName = JsonPath.read(json,"$.student.parents.mother.firstName");
        String motherLastName = JsonPath.read(json,"$.student.parents.mother.lastName");

        System.out.println("Imię i nazwisko studenta:");
        System.out.println(name + " " + lastName);
        System.out.println("Średnia ocen:");
        System.out.println(avgGrade);
        System.out.println("Ukończone przedmioty:");
        System.out.println(subjects);
        System.out.println("Imię i nazwisko ojca:");
        System.out.println(fatherName + " " + fatherLastName);
        System.out.println("Imię i nazwisko matki:");
        System.out.println(motherName + " " + motherLastName);


    }
}
