package homework_15;


import java.util.Iterator;
import java.util.List;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//        Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе
public class Student {
    private String name;
    private String group;
    private int course;
    private SubjectMark marks;


    public Student(String name, String group, int course, SubjectMark marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static boolean removeStudentsWithLowMarks(List<Student> students, int mark) {
        Iterator<Student> iterator = students.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avgMark = getAvgMark(student.marks);

            if (avgMark < mark) {
               iterator.remove();
               student.setCourse(student.course + 1);
               count++;

            }
        }

       return count > 0;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getCourse() == course) {
                System.out.println("Name: " + student.getName() + "\n" + "Course: " + student.getCourse());
            }
        }
    }

    public static double getAvgMark(SubjectMark marks) {
        return (double) (marks.getBiology() + marks.getMath()) / 2;
    }
}
