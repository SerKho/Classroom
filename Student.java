package Lesson_4_1_5;

/**
 * Created by 777 on 22.03.2016.
 */
public class Student {
    String name;
    String surname;

    public Student(){

    }

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
