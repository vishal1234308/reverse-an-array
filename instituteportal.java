/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
class Student{
    int rollno;
    String name;
    int attendance,sub1,sub2,sub3,sub4,sub5;
    public Student(int rollno1,String name1,int attendance1,int sub11,int sub21,int sub31,int sub41,int sub51){
        rollno=rollno1;
        name=name1;
        attendance=attendance1;
        sub1=sub11;
        sub2=sub21;
        sub3=sub31;
        sub4=sub41;
        sub5=sub51;
        
    }
    public String getName(){
        return name;
        
    }
    public int getRollno(){
        return rollno;
    }
    public int getMarkssub1(){
        return sub1;
    }
    public int getMarkssub2(){
        return sub2;
    }
    public int getMarkssub3(){
        return sub3;
    }
    public int getMarkssub4(){
        return sub4;
    }
    public int getMarkssub5(){
        return sub5;
    }
    public int getAttendance(){
        return attendance;
    }
    public String getInfo(){
        return  "name:"+ name+ " \n Attendance:"+ attendance +"\n Roll Numnber:"+ rollno ;
    }
    public String getMarks(){
        return "name: "+name+"\n Physics: "+ sub1 +" \n Chemistry: "+ sub2 +"\n Maths: "+ sub3 +"\n English: "+sub4+"\n Physical education:"+ sub5;
    }
    public String getResult(){
        float n=(sub1+sub2+sub3+sub4+sub5)/5;
        String s="";
        if(n>33){
            s=s+"Congratulation!!!! \n you are PASSED \n your percertage is ";
        }
        else{
            s=s+"YOU FAILED...!!! \n your percentage is ";
        }
        return s+n;
        
    }
    
    
    public void setName(String s){
        name=s;
    }
    public void setRollno(int n){
        rollno = n;
    }
    public void setattendance(int n){
        attendance=n;
    }
    public void setsub1(int n){
        sub1=n;
    }
    public void setsub2(int n){
        sub2=n;
    }
    public void setsub3(int n){
        sub3=n;
    }
    public void setsub4(int n){
        sub4=n;
    }
    public void setsub5(int n){
        sub5=n;
    }
    
    
    
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> s = new ArrayList<Student>();
        
        
        s.add(new Student(1,"arun Sharma",70,45,43,32,34,45));
        s.add(new Student(2,"SIMRAN Sharma",70,5,43,32,34,45));
        s.add(new Student(3,"simran goyal",70,5,43,32,34,45));
        s.add(new Student(4,"jahnvi sodhi",70,45,3,32,34,45));
        s.add(new Student(5,"aastha singh",0,5,43,32,34,45));
        
        System.out.println("WELCOME TO \n >>>>>> SHARMA INSTITUE <<<<<<");
        System.out.println("Press 1 if you are a TEACHER ");
        System.out.println("Press 2 if you are a STUDENT");
        
       int count=s.size();
        int n=sc.nextInt();
        String s10="0000";
        if(n==1){
            System.out.println("Please enter your name");
            String name=sc.next();
            System.out.println("hello "+name);
            System.out.println("Welcome to teacher's Portal [ SHARMA INSTITUTE ]");
            System.out.println("Please enter your password to login");
            String s2=sc.next();
            int count10=0;
            if(s2.equals(s10)){
                count10=1;
            }
            
            
            int times=1;
            while(times==1 && count10==1){
            System.out.println("Press 1 to update attendance of student");
            System.out.println("Press 2 to update marks of student");
            System.out.println("Press 3 to add new student in the class");
            int n2=sc.nextInt();
            
            
            if(n2==1){
                
                System.out.println("Please enter the rollno of the student");
                int n3=sc.nextInt()-1;
                System.out.println("Enter the student attendance in percentage");
                int attend=sc.nextInt();
                s.get(n3).setattendance(attend);
                System.out.println("attendance updated successfully !!!");
                System.out.println("Press 1 to see the updated attendance");
                int n6=sc.nextInt();
                
                if(n6==1)
                System.out.println(s.get(n3).getInfo());
                
                
                
                
                
            }
            if(n2==2){
                System.out.println("Please enter the roll number of the student :");
                int n3=sc.nextInt()-1;
                int n1=0;
                System.out.println("Enter the marks of student in different subjects");
                System.out.println("Physics:");
                 n1=sc.nextInt();
                s.get(n3).setsub1(n1);
                System.out.println("Chemistry:");
                 n1=sc.nextInt();
                s.get(n3).setsub2(n1);
                System.out.println("Maths:");
                 n1=sc.nextInt();
                s.get(n3).setsub3(n1);
                System.out.println("English:");
                 n1=sc.nextInt();
                s.get(n3).setsub4(n1);
                System.out.println("Physical Education:");
                 n1=sc.nextInt();
                s.get(n3).setsub5(n1);
                
                System.out.println("the marks have been updated successfully");
                System.out.println("Press 1 to see the updated marks");
                int n6=sc.nextInt();
                
                if(n6==1)
                System.out.println(s.get(n3).getMarks());
                
                
                
            }
            if(n2==3){
                
                
                System.out.println("Please enter the  name of the student");
                String name1 = sc.next();
                       
               s.add(new Student(count+1,name1,0,0,0,0,0,0));
               
               System.out.println("student added successfully");
               System.out.println("Press 1 to see the updated marks");
                int n6=sc.nextInt();
                
                if(n6==1)
               System.out.println(s.get(count).getInfo());
               
               
                
            }
            
            System.out.println("If you dont want to continue further press 0");
            times=sc.nextInt();
            
            if(times==0){
                System.out.println("Thanks for visiting our site !!!");
            }
            
            }
            
            if(count10!=1){
                
                System.out.println(">>>WRONG PASSWORD <<");
            }
        }
        else if(n==2){
            System.out.println("Please enter your name");
            String s2=sc.next();
            System.out.println("Please enter your roll number");
            int n7=sc.nextInt()-1;
            System.out.println("HEllo "+s2);
            
            
            int times=1;
            while(times==1){
            
            System.out.println("Press 1 to check your attendance");
            System.out.println("Press 2 to check your marks");
            System.out.println("Press 3 to check your result");
            int n8=sc.nextInt();
            
            if(n8==1){
                System.out.println(s.get(n7).getAttendance());
                
                
            }
            else if(n8==2){
                System.out.println(s.get(n7).getMarks());
                   
            }
            else if(n8==3){
                
                System.out.println(s.get(n7).getResult());
            }
            
            System.out.println("If you want to close the site , Press 0 and Press 1 to continue");
            times=sc.nextInt();
            if(times==0){
                
                System.out.println("Thanks for visiting!!");
            }
            
            
            
            
            
            }    
            
        }
        
        
        
    }
}
