import java.util.Scanner;
 class Administrator{
     Scanner Sc = new Scanner(System.in);
    String adminame;
    String adminid;
    String departname;
    String gender;
    void admindetail()
    {      //Scanner Sc = new Scanner(System.in);
          System.out.println("Enter the name of Admin");
           adminame=Sc.next();
          System.out.println("Enter the ID of Admin");
          adminid=Sc.next();
          System.out.println("Enter the name of Department of Admin");
          departname=Sc.next();
          System.out.println("Enter the gender of Admin");
          gender=Sc.next();
         System.out.println("  The Detail of Admin");
           System.out.println(" the name  of Admin :"+adminame);
           System.out.println(" the ID  of Admin :"+adminid);
           System.out.println(" the name of DEPARTMENT of Admin :"+departname);
           
    }
    void addStudent()
    {
        System.out.println("Enter the name of Student");
              String studentname =Sc.next();
    System.out.println("Enter the Id of Student");
             int studentId=Sc.nextInt();
             System.out.println("Enter the branch of Student");
              String branch =Sc.next();
    System.out.println("Enter the gender of Student");
                String gender=Sc.next();
                System.out.println("Enter the birthdate of student ");
               int birthdate=Sc.nextInt();
               System.out.println("Enter the Emailid of student ");
               String emailid=Sc.next();

               System.out.println("  The Detail of Student");
               System.out.println(" the name  of Student :"+studentname);
               System.out.println(" the Id  of Admin :"+studentId);
               System.out.println(" the Branch  of Student :"+branch);
               System.out.println(" the Gender  of Student :"+gender);
            System.out.println(" the Birthdate  of Student :"+birthdate);
            System.out.println("the Emailid of student :"+emailid);
    }
    void addFaculty()
    {
        System.out.println("Enter the name of Faculty");
              String facultyname =Sc.next();
    System.out.println("Enter the Id of Faculty");
             int facultyId=Sc.nextInt();
             System.out.println("Enter the Education of Faculty");
              String education =Sc.next();
    System.out.println("Enter the  Salary of Faculty");
                int salary= Sc.nextInt();
                System.out.println("Enter teaches subject ");
               String subject=Sc.next();
               System.out.println("  The Detail of Faculty");
               System.out.println(" the name  of Faculty :"+facultyname);
               
               System.out.println(" the Id  of Faculty :"+facultyId);
               System.out.println(" the Education  of Faculty :"+education);
               System.out.println(" the Salary of Faculty :"+salary);
               System.out.println(" the Teaching Subject of Faculty  :"+subject);
    }
}
 class Faculty{ Scanner Sc = new Scanner(System.in);
             //System.out.println("Record maintain by faculty");
        void addmark()
        {    System.out.println("Enter the name of student for external and Internal mark");
               String name1=Sc.next();
            System.out.println("Enter the name of subject for Internal mark and External mark");
               String sub=Sc.next();
               //System.out.println("Enter the marks of student");
              // int sub3=Sc.nextInt();
             //System.out.println("Enter the name of subject which add External mark");
              //String sub1=Sc.next();
              // System.out.println("\n Enter the name of student");
              // String name1=Sc.next();
               System.out.println("Enter the external  marks of student");
               int sub2=Sc.nextInt();
               System.out.println("Enter the Internal  marks of student");
               int sub1=Sc.nextInt();
            
               System.out.printf("\n  the name of student %s has External mark %d and Internal mark %d",name1,sub2,sub1);



        }
        void attendence()
        {
              System.out.println("Enter the name of subject which you want to enter attendance ");
                   String sub4=Sc.next();
             System.out.println("Enter 1 if Student is present else Enter 0 ");
             int y=Sc.nextInt();
             //System.out.printf("\n Name of the subject %d ",sub4);
             if(y==1)
             {
                System.out.println("Student is present"); 
             }
             else
             {System.out.println("Student is absent");
             }
             System.out.printf("\n Name of the subject %d ",sub4);

             //System.out.println("Name of the subject %d ");


        }
}
     class Student{Scanner Sc = new Scanner(System.in);
              void registerationForm()
        
              {      System.out.println("Registeration Form");
                   System.out.println("Enter the name of Student");
           String n2=Sc.next();
          System.out.println("Enter the EMAIL ID of Student");
              String id=Sc.next();
            System.out.println("Enter the Mobile number");
               int x6=Sc.nextInt();
            System.out.println("Enter the branch of student");
               String n3=Sc.next();
               System.out.println("The name of Student :"+n2);
               System.out.println("The EMAIL ID of Student"+id);
                System.out.println("The Mobile number of student :"+x6);
                System.out.println("The branch of student :"+n3);
                
              }
              void feesstructure()
        
              {      System.out.println("Student Fees Form");
                   System.out.println("Enter the name of Student");
           String n7=Sc.next();
          System.out.println("Enter the EMAIL ID of Student");
              String id1=Sc.next();
            System.out.println("Enter the amount of fees to pay");
               int x6=Sc.nextInt();
           // System.out.println("Enter the branch of student");
               //String n3=Sc.next();
               System.out.println("The name of Student :"+n7);
               System.out.println("The EMAIL ID of Student"+id1);
                System.out.println("The Amount the fees which paid :"+x6);
                //System.out.println("The branch of student :"+n3);
                
              }
                 
              }


     //}
 class College{
       public static void main(String[] args)
       {     Scanner sc = new Scanner(System.in);
           Student ob2=new Student();
           //College ob=new College();
           Admin ob=new Admin();
           Faculty ob1=new Faculty();
           College ob3= new College();
           System.out.println("Enter the any option \n  1.Admin \n 2.Faculty \n 3.Student");
            int n=sc.nextInt();
             switch(n)

             {case 1: ob.admindetail();
                  System.out.println("Enter the any option \n  1.ADD Student \n 2.ADD FACULTY ");
                    int x=sc.nextInt();
                    switch(x)
                  {
                  case 1:ob.addStudent();
                         break;
                  case 2:ob.addFaculty();
                          break;
                 default:System.out.println("Given option is not exist ");
                    
                 
                  }
                     break;
            case 2: System.out.println("Enter the any option \n 1. marks Detail  of student \n 2.Attendance detail");
              int x4=sc.nextInt();
              switch(x4)
              {
                  case 1:ob1.addmark();
                         break;
                  case 2:ob1.attendence();
                          break;
                 default:System.out.println("Given option is not exist ");
              }
                break;
               

             
             case 3: System.out.println("Enter the any option \n 1. Registeration form \n 2.Fees form");
                    int x5=sc.nextInt();
              switch(x5)
              {
                  case 1:ob2.registerationForm();
                         break;
                  case 2:ob2.feesstructure();
                          break;
                 default:System.out.println("Given option is not exist ");
              }
              
                break;
                default:System.out.println("Given option is not exist ");

            // }
              //default:System.out.println("Given option is not exist ");
             }
            
           //ob2.checkattendance();
             /* ob.admindetail();
              System.out.println("Enter the any option \n  1.ADD Student \n 2.ADD FACULTY ");
              int x=sc.nextInt();
              switch(x)
              {
                  case 1:ob.addStudent();
                         break;
                  case 2:ob.addFaculty();
                          break;
                 default:System.out.println("Given option is not exist ");
                 
              }
              System.out.println("Enter the any option \n 1. marks Detail  of student \n 2.Attendance detail");
              int x4=sc.nextInt();
              switch(x4)
              {
                  case 1:ob1.addinternalmark();
                         break;
                  case 2:ob1.attendence();
                          break;
                 default:System.out.println("Given option is not exist ");
              }
     
          // System.out.println("  The Detail of Admin");
           
          // ob.addStudent();
           //ob.addFaculty();
           //System.out.println("  The Detail of Student");
                                 
           
           //System.out.println(" The NAme of Admin"+ob.adminmame);*/
       }          
}
