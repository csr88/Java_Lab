import java.util.Scanner;

class StudentDetails{
    String name;
    int age, rollno;

    void InitializeStudent(String n, int a, int r){
        name = n;
        age = a;
        rollno = r;
    }

    void printData(){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("rollno: " + rollno);
    }

}

public class Qsn_One {
    public static void main(String[] args){
        StudentDetails d1 = new StudentDetails();
        d1.InitializeStudent("shishir", 19, 5);
        d1.printData();

    }


}
