package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //protected properties
    private String name;

    private ArrayList<Integer>grades;

    //constructor
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(){}

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
        for(int i = 0;i<grades.size(); i++){
            average += grades.get(i);
        }
        return average/grades.size();
    }

    public static void main(String[] args) {

        Student student = new Student("Bob");
        student.addGrade(90);
        student.addGrade(70);
        student.addGrade(30);
        student.addGrade(100);
        System.out.println(student.getGradeAverage());

    }


}
