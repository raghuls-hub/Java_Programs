import java.util.Scanner;

class person{
    String Name;
    int Id;
    person(int i,String n){
        Id=i;
        Name=n;
    }
}

class Student extends person{
    String major;
    Student(int i,String n,String m){
        super(i,n);
        major=m;
        System.out.println("Name: "+ Name);
        System.out.println("ID: "+ Id);
        System.out.println("Major: "+ major);
        System.out.printf("%s is enrolling in a Course.",Name);
    }
}

class Professor extends person{
    String Dept;
    Professor(int i,String n,String d){
        super(i,n);
        Dept=d;
        System.out.println("Name: "+ Name);
        System.out.println("ID: "+ Id);
        System.out.println("Department: "+ Dept);
        System.out.printf("%s Teaching a Course.",Name);
    }
}

public class Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Role: ");
        String R=sc.next();
        if (R.equals("Student")) {
            Student pro = new Student(sc.nextInt(), sc.next(), sc.next());
        }
        else if (R.equals("Professor")) {
            Professor pro = new Professor(sc.nextInt(), sc.next(), sc.next());
        }
        else{
            System.out.println("Invalid Role");
        }
        sc.close();
    }
}
