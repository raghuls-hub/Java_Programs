import java.util.Scanner;

class Student{
    int Id;
    String name;
    double Tution;
    double Exam;

    Student(int id, String name, double tution, double exam) {
        Id = id;
        this.name = name;
        Tution = tution;
        Exam = exam;
    }

    double calculateFee(){
        return ((double)(Tution) + (double)(Exam));
    }

    void display(){
        System.out.println("Student Id:"+Id);
        System.out.println("Student Name:"+name);
        System.out.println("Student Tution Fee:"+Tution);
        System.out.println("Student Exam Fee:"+Exam);
    }
    
}

public class stationary {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of students:");
        int n= sc.nextInt();
        
        Student stu[] = new Student[n];
        
        for(int i=0; i<n; i++){
            
            System.out.println("Student Id:");
            int id=sc.nextInt();
            System.out.println("Student Name:");
            String N=sc.nextLine();
            sc.nextLine();
            System.out.println("Student Tution Fee:");
            double T=sc.nextDouble();
            System.out.println("Student Exam Fee:");
            double E=sc.nextDouble();
            stu[i]=new Student(id,N,T,E);

        }
        
        int thres = sc.nextInt();
        boolean f=false;

        for(int i=0;i<n;i++){
            if(stu[i].calculateFee()>thres){
                stu[i].display();
                System.out.println("Total Fee : "+ stu[i].calculateFee());
                f=true;
            }
        }
        if(!f) System.out.println("No students found with Total Fee : "+thres);

        sc.close();
    }
}
