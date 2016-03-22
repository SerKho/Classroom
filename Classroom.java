package Lesson_4_1_5;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by 777 on 22.03.2016.
 */
public class Classroom {
    private java.util.List<Student> students;

    public Classroom() {

    }

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public java.util.List<Student> getStudents() {
        return students;
    }


    public void enter(Student student) {
        students.add(student);
    }

    public void leave(Student student) {
        students.remove(student);
    }

    public int getStudentCount() {
        return (students.toArray()).length;
    }

    public boolean isPresent(Student student) {
         return this.getStudents().contains(student);
    }

    public void printStudentsInfo(){
        for (int i = 0; i < this.getStudentCount(); i++) {
            if (this.getStudents().get(i).equals(null)) {
                continue;
            } else {
                System.out.println((i+1) + ". " + this.getStudents().get(i).getName() + " " +
                        this.getStudents().get(i).getSurname());
            }
        }
        System.out.println("");
    }
}


