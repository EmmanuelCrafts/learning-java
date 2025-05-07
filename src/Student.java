import java.util.Scanner;
public class Student {
    String name;
    int marks;
 public Student(String name, int marks){
     this.name = name;
     this.marks = marks;
 }
    public static void main(String[] args){
//     create space to hold the student objects
        Student[] students = new Student[5];
        Scanner myStudent = new Scanner(System.in);
        for (int pupil = 0; pupil < students.length; pupil++){
            System.out.println("enter name for student" +(pupil + 1) + ":");
            String name = myStudent.nextLine();
            System.out.println("Enter marks for student"  +(pupil + 1) + ":");
            int marks = myStudent.nextInt();
//            clear the next line
            myStudent.nextLine();
//            create objects for the student class
            students[pupil] = new Student(name,marks);
        }
        myStudent.close();
        int highestMark = topper(students);
        System.out.println("the top student is " + students[highestMark].name + " with " +students[highestMark].marks );
    }
    public static int topper(Student[] students){
     int highestMark = 0;
     for (int i = 1; i < students.length; i++){
         if (students[i].marks > students[highestMark].marks) {
             highestMark = i;
         }
     }
     return highestMark;
    }
}
//Create a Student class with fields name and marks. Write a method findTopper(Student[] students) that returns the student with the highest marks.