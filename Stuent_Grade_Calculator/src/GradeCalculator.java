import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCalculator {
    List<StudentInfo>studentInList;
    class  StudentInfo{
        String name;
        int totalMarks;
        double percentage;
        String grade;

        public StudentInfo(String name, int totalMarks,double percentage,String grade){
            this.name=name;
            this.totalMarks=totalMarks;
            this.percentage=percentage;
            this.grade=grade;
        }

        @Override
        public String toString() {
            return "StudentInfo{" +
                    "name='" + name + '\'' +
                    ", totalMarks=" + totalMarks +
                    ", percentage=" + percentage +
                    ", grade='" + grade + '\'' +
                    '}';
        }
    }
    GradeCalculator(){
        studentInList=new ArrayList<>();
    }
   public String addStudentMarks(){

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.println("enter marks for PHYSICS : ");

        int physics =  sc.nextInt();
       while(physics<0 || physics>100){
           System.out.println("Enter a right digit between 0 to 100");
           physics =  sc.nextInt();
       }


        System.out.println("enter marks for MATHS : ");
        int maths =  sc.nextInt();
       while(maths<0 || maths>100){
           System.out.println("Enter a right digit between 0 to 100");
           maths =  sc.nextInt();
       }


        System.out.println("enter marks for CHEMISTRY : ");
        int chemistry =  sc.nextInt();
       while(chemistry<0 || chemistry>100){
           System.out.println("Enter a right digit between 0 to 100");
           chemistry =  sc.nextInt();
       }


        System.out.println("enter marks for HINDI : ");
        int hindi =  sc.nextInt();
       while(hindi<0 || hindi>100){
           System.out.println("Enter a right digit between 0 to 100");
           hindi =  sc.nextInt();
       }
        System.out.println("enter marks for ENGLISH : ");
        int english =  sc.nextInt();
       while(english<0 || english>100){
           System.out.println("Enter a right digit between 0 to 100");
           english =  sc.nextInt();
       }

        int total = physics+maths+chemistry+hindi+english;

        double percentage =(double)total/(double)5;
        String grade="";

        if(percentage>=90){
            grade="A+";
        } else if (percentage>=80) {
            grade="A";
        } else if (percentage>=70) {
            grade="B";
        } else if (percentage>=60) {
            grade="C";
        } else if (percentage>=50) {
            grade = "D";
        }else if(percentage>=40){
            grade = "E";
        }else{
            grade="FF";
        }
        studentInList.add(new StudentInfo(name,total,percentage,grade)); // adding student data in array list

       return "Student Name : "+name+"\n"+"Total Marks : "+total+"\n"+"Average Percent :"+percentage+"\n"+"Grade :"+grade;
    }

    public void listOfStudentMarks(){
        for(StudentInfo s : studentInList){
            System.out.println(s.toString());
        }
    }
}
