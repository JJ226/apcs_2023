import java.util.*;

public class Academic{
    static ArrayList<Student> students = new ArrayList<Student>();
    private static Teacher teacher = new Teacher ("Dr. Teacher","The Best Class");
   
    public static void addStudent(String name, int favNum){
        Student newStudentYippee = new Student (name, favNum);
        students.add(newStudentYippee);
    }
    
    public static void sameFavNum(ArrayList<Student> students, int num){
        ArrayList<Student> studentNum = new ArrayList<Student>();
        for (Student x : students){
            if (x.getFavNum() == num)
                studentNum.add(x);
        }
        for (Student y : studentNum)
            System.out.println(y.getName());
    }
    
    public static void printInfo(ArrayList<Student> students){
        double count = 0;
        double total = 0;
        for (Student x : students){
            System.out.println(x.getName() + " " + x.getFavNum());
        }
        System.out.println(teacher.getName());
    }
    
    public static ArrayList<Student> odds(ArrayList<Student> students){
        ArrayList<Student> oddStudents = new ArrayList<Student>();
        for (Student x : students){
            if (x.getFavNum()%2 != 0)
                oddStudents.add(x);
        }
        return oddStudents;
    }
    
    public static void main(String[] args){
        addStudent("J", 2);
        addStudent("No", 13);
        addStudent("W", 36);
        addStudent("M", 22);
        addStudent("Ni", 7);
        System.out.println("All the info: ");
        printInfo(students);
        System.out.println("Students whos favorite number is odd: ");
        for (Student x : odds(students))
            System.out.println (x.getName());
        
        System.out.println("Student(s) whos favorite number is 2: ");
        sameFavNum(students, 2);
        
    }
}