package Lesson_4_1_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 777 on 22.03.2016.
 */
public class Demo {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<Student>();
        Student s1 = new Student("Ivan", "Ivanov");
        Student s2 = new Student("Petr", "Petrov");
        Student s3 = new Student("Sidr", "Sidorov");

        Classroom classroom = new Classroom(s);
        classroom.enter(s1);
        classroom.enter(s2);
        classroom.enter(s3);
        classroom.enter(s1);
        classroom.printStudentsInfo();

        classroom.leave(s1);
        classroom.printStudentsInfo();
        System.out.println(classroom.isPresent(s2));
        System.out.println(classroom.isPresent(new Student("Ivan", "Petrov")));
        System.out.println("Quontity of students in th classroom - " + classroom.getStudentCount() + ".");
    }
}
