import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
  // Variables
  private static String StudentName;
  private static int StudentID;
  private static String StudentCourse;
  // Array Lists
  static ArrayList<String> StudentsNAME = new ArrayList<String>();
  static ArrayList<Integer> StudentsID = new ArrayList<Integer>();
  static ArrayList<String> StudentsCourse = new ArrayList<String>();

  public static void AddStudents()
  {
    int a = 1;
    while (a == 1) {
      // Student Name
      Scanner ScannerStudentName = new Scanner(System.in);
      System.out.println("Enter Student Name: ");
      StudentName = ScannerStudentName.nextLine();
      StudentsNAME.add(StudentName);
      // Student ID
      Scanner ScannerStudentID = new Scanner(System.in);
      System.out.println("Enter Student ID: ");
      StudentID = ScannerStudentID.nextInt();
      StudentsID.add(StudentID);
      // Enrolled Courses
      Scanner ScannerEnrolledCourse = new Scanner(System.in);
      System.out.println("Enter Enrolled Course: ");
      StudentCourse = ScannerEnrolledCourse.nextLine();
      StudentsCourse.add(StudentCourse);

      // Add Another Student
      Scanner AddMore = new Scanner(System.in);
      System.out.println("Do you want to add another student, 1 for yes, 2 for no");
      int AddMoreOutput = AddMore.nextInt();
      if (AddMoreOutput == 1)
      {
        a = 1;
      } 
      else if (AddMoreOutput == 2)
      {
        a = 2;
      }
    }
  }

  public static void ViewStudents() 
  {
    System.out.println("Students:");
    System.out.println(StudentsNAME);
    System.out.println(StudentsID);
    System.out.println(StudentsCourse);
  }
}
