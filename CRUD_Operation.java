// Junhee Park
package CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class Final_Test 
{

 public static void main(String[] args) 
 {
  // declare variables
  int a;
  int b;
  int c;
  
  // open the Scanner
  Scanner x = new Scanner(System.in);
 
  // ask user type 1 for student and 2 for admin
  System.out.println("Are you student or administrative?");
  System.out.println("Please type 1 for student and 2 for administrative");
  a = x.nextInt();
 
  // if the user type 1 then user is be student and ask what does user want to do
  if(a == 1)
  {
   Final_Test objTest=new Final_Test();
   System.out.println("Welcome to University at Albany! What do you want to do?");
   System.out.println("1. register for course\n"
     + "2. add a course\n"
     + "3. drop a course\n"
     + "4. show courses schedule\n"
     + "5. switch a course");
   b = x.nextInt();
   
   // if the user type 1 then user register courses
   if(b == 1)
   {
    /*objTest.create_course("4142", "ICSI 201 Intro Comp Sci", "Computer Science", "MW 2:45PM - 4:05PM LC0024 Kuperman, Vladmir", "4");
    objTest.create_course("4145", "ICSI 201 Intro Comp Sci Lab", "Computer Science", "T 08:45AM - 09:40AM AS0013 Kuperman, Vladmir", "0");
    objTest.create_course("4149", "ICSI 210 Discrete Structures", "Computer Science", "MWF 09:20AM - 10:15AM LC0024 Kuperman,Vladmir", "3");
    objTest.create_course("4150", "ICSI 210 Discrete Structures Discussion", "Computer Science", "F 10:25AM - 11:20AM HU0024 Kuperman,Vladmir", "0");
    objTest.create_course("4852", "Calculus II", "Mathematics", "W 11:30AM - 1:20PM and MF 12:35PM - 1:30PM SS0133", "3"); 
    objTest.create_course("2077", "APSY 101 Introduction to Psychology", "Psychology", "TTH 11:45AM - 1:05PM LC0018 Friedman, Ronald S", "3");
    objTest.create_course("6881", "ETAP 201 Explor Teaching as Profession", "Educational Theory & Practice", "TTH 08:45_AM-10:05_AM ES0241 Glass,Rory J", "3");
   */}
   
   // if the user type 2 then user add courses
   else if(b == 2)
   {
    //objTest.create_course( "1903", "AMAT 220 Linear Algebra", "Mathematics", "TTH 02:45_PM-04:05_PM ES0143 Tchernev,Alexandre B", "3");
   } 
   
   // if the user type 3 then user delete courses
   else if(b == 3)
   {
    //objTest.delete_course("2077");
   }
   
   // if the user type 4 then show schedule of each course
   else if(b == 4)
   {
    objTest.read_course("");
   } 
   
   // if the user type 5 then the user switch courses
   else if(b == 5)
   {
    //objTest.update_course("1903", "5995", "AMUS 100 Introduction to Music", "Music", "MW 05:45_PM-07:05_PM PC0078 Burns,Ellen J", "3");
   }
   else
   {
    System.out.println("you have to choose between 1 ");
   }
  }
  
  // if the user type 2, the user be admin and what does admin want to do
  else if (a == 2)
  {
   Final_Test objTest=new Final_Test();
   System.out.println("Welcome! What do you want to do?");
   System.out.println("1. register for course\n"
     + "2. add a course\n"
     + "3. drop a courses\n"
     + "4. switch a section\n"
     + "5. show courses schedule");
   c = x.nextInt();
   
   // if the user type 1 then user register courses
   if(c == 1)
   {
    /*objTest.create_admin("4142", "ICSI 201 Intro Comp Sci", "Computer Science", "MW 02:45_PM-04:05_PM LC0024", "100");
    objTest.create_admin("4144", "ICSI 201 Intro Comp Sci Lab", "Computer Science", "M 09:20_AM-10:15_AM AS0013", "25");
    objTest.create_admin("4145", "ICSI 201 Intro Comp Sci Lab", "Computer Science", "T 08:45_AM-09:40_AM AS0013", "25");
    objTest.create_admin("4146", "ICSI 201 Intro Comp Sci Lab", "Computer Science", "W 12:35_PM-01:30_PM LC0010", "25");
    objTest.create_admin("4147", "ICSI 201 Intro Comp Sci Lab", "Computer Science", "TH 08:45_AM-09:40_AM AS0013", "25");
    objTest.create_admin("4149", "ICSI 210 Discrete Structures", "Computer Science", "MWF 09:20_AM-10:15_AM LC0024", "150");
    objTest.create_admin("4150", "ICSI 210 Discrete Structures Discussion", "Computer Science", "F 10:25_AM-11:20_AM HU0024", "25");
    objTest.create_admin("4151", "ICSI 210 Discrete Structures Discussion", "Computer Science", "T 08:45_AM-09:40_AM PC0263", "25");
    objTest.create_admin("4601", "ICSI 210 Discrete Structures Discussion", "Computer Science", "F 10:25_AM-11:20_AM HU0024", "25");
    objTest.create_admin("8541", "ICSI 210 Discrete Structures Discussion", "Computer Science", "M 11:30_AM-12:25_PM ED0123", "25");
    objTest.create_admin("8542", "ICSI 210 Discrete Structures Discussion", "Computer Science", "W 12:35_PM-01:30_PM HU0112", "25");
    objTest.create_admin("8543", "ICSI 210 Discrete Structures Discussion", "Computer Science", "TH 04:15_PM-05:10_PM HU0114", "25");
    *///objTest.create_admin("6923", "ICSI 402 System Programming", "Computer Science", "TTH 02:45_PM-04:05_PM ED0120", "55");
    
    
   }
   
   // if the user type 2 then user add courses
   else if(c == 2)
   {
    //objTest.create_admin("6664", "ICSI 404 Computer Organization", "Computer Science", "TTH 08:45_AM-10:05_AM SS0256", "45");
   } 
   
   // if the user type 3 then user delete courses
   else if(c == 3)
   {
    //objTest.delete_admin("6923");
    objTest.delete_admin("4148");
    objTest.delete_admin("4769");
    objTest.delete_admin("4873");
   }
   
   // if the user type 4 then show schedule of each course
   else if(c == 4)
   {
    /*
    objTest.update_admin("4142", "7252", "ICSI 333 Pgm HardwareSoftware Interface", "Computer Science", "T 05:45_PM-08:35_PM ES0245", "100");
    objTest.update_admin("4144", "8556", "ICSI 333 Pgm HardwareSoftware Interface Lab", "Computer Science", "M 02:45_PM-03:40_PM AS0013", "25");
    objTest.update_admin("4145", "8557", "ICSI 333 Pgm HardwareSoftware Interface Lab", "Computer Science", "W 01:40_PM-02:35_PM AS0013", "25");
    objTest.update_admin("4146", "8558", "ICSI 333 Pgm HardwareSoftware Interface Lab", "Computer Science", "T 01:15_PM-02:10_PM AS0013", "25");
    objTest.update_admin("4147", "8559", "ICSI 333 Pgm HardwareSoftware Interface Lab", "Computer Science", "TH 04:15_PM-05:10_PM LC0010", "25");
    */
    
   }
   
   // if the user type 5 then the user switch courses
   else if(c == 5)
   {
    //objTest.read_admin("4142");
   }
   else
   {
    System.out.println("You have to choose between 1-5");
   }
  }
  else
  {
   System.out.println("You have to choose 1 for student and 2 for administrative");
  }
  // Scanner close
  x.close();
 }

 public void create_course(String course_num, String course_name,String department, String meeting, String credit)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try
  {
   String query="insert into student(course_num,course_name,department,meeting,credit) values (?,?,?,?,?)";
   ps=connection.prepareStatement(query);
   ps.setString(1, course_num);
   ps.setString(2, course_name);
   ps.setString(3, department);
   ps.setString(4, meeting);
   ps.setString(5, credit);
   System.out.println(ps);
   ps.executeUpdate();
  } 
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
 
 public void read_course(String course_num)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  ResultSet rs=null;
  try {
   String query="select * from student";
   ps=connection.prepareStatement(query);
   //ps.setString(1, course_num);
   System.out.println(ps);
   rs=ps.executeQuery();
   while(rs.next())
   {
    System.out.println("Course name -"+rs.getString("course_name"));
    System.out.println("meeting info-"+rs.getString("meeting"));
    System.out.println("---------------");
   }
  }
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }

 public void update_course(String course_num,String new_course_num,String course_name,String department, String meeting, String credit)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try 
  {
   String query="update student set course_num=?,course_name=?,department=?,meeting=?,credit=? where course_num=?";
   ps=connection.prepareStatement(query);
   ps.setString(1, new_course_num);
   ps.setString(2, course_name);
   ps.setString(3, department);
   ps.setString(4, meeting);
   ps.setString(5, credit);
   ps.setString(6, course_num);
   System.out.println(ps);
   ps.executeUpdate();
  } 
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }

 public void delete_course(String course_num)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try 
  {
   String query="delete from student where course_num=?";
   ps=connection.prepareStatement(query);
   ps.setString(1, course_num);
   System.out.println(ps);
   ps.executeUpdate();
  }
  catch (Exception e) 
  {
   System.out.println(e);
  }
 
 }
 
 public void create_admin(String class_num,String class_name, String department, String meeting, String seats)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try 
  {
   String query="insert into administrative(class_num,class_name,department,meeting,seats) values (?,?,?,?,?)";
   ps=connection.prepareStatement(query);
   ps.setString(1, class_num);
   ps.setString(2, class_name);
   ps.setString(3, department);
   ps.setString(4, meeting);
   ps.setString(5,  seats);
   System.out.println(ps);
   ps.executeUpdate();
  } 
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }
 
 public void delete_admin(String class_num)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try 
  {
   String query="delete from administrative where class_num=?";
   ps=connection.prepareStatement(query);
   ps.setString(1, class_num);
   System.out.println(ps);
   ps.executeUpdate();
  }
  catch (Exception e) 
  {
   System.out.println(e);
  }
 
 }
 
 public void update_admin(String class_num,String new_class_num,String class_name,String department, String meeting, String seats)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  try 
  {
   String query="update administrative set class_num=?,class_name=?,department=?,meeting=?,seats=? where class_num=?";
   ps=connection.prepareStatement(query);
   ps.setString(1, new_class_num);
   ps.setString(2, class_name);
   ps.setString(3, department);
   ps.setString(4, meeting);
   ps.setString(5, seats);
   ps.setString(6, class_num);
   System.out.println(ps);
   ps.executeUpdate();
  } 
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }
 
 public void read_admin(String class_num)
 {
  DB_Connection obj_DB_Connection=new DB_Connection();
  Connection connection=obj_DB_Connection.get_connection();
  PreparedStatement ps=null;
  ResultSet rs=null;
  try {
   String query="select * from administrative";
   ps=connection.prepareStatement(query);
   //ps.setString(1, course_num);
   System.out.println(ps);
   rs=ps.executeQuery();
   while(rs.next())
   {
    System.out.println("|class name - "+rs.getString("class_name"));
    System.out.println("|meeting info- "+rs.getString("meeting"));
    System.out.println("|seats info - " + rs.getString("seats"));
    System.out.println("---------------");
   }
  }
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }
}
