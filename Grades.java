import java.util.Scanner;
import java.util.ArrayList;

public class Grades 
{
  // Variables
  private static int StudentID;
  private static String CourseName;
  private static int CourseCode;
  private static String GradeValue;
  // Array Lists
  static ArrayList<Integer> StudentGID = new ArrayList<Integer>();
  static ArrayList<String> CoursesName = new ArrayList<String>();
  static ArrayList<Integer> CourseCodes = new ArrayList<Integer>();
  static ArrayList<String> GradesValue = new ArrayList<String>();

  public static void AddGrades() 
  {
    int a = 1;
    while (a == 1) 
    {
      // Student ID
      Scanner ScannerStudentID = new Scanner(System.in);
      System.out.println("Enter Student ID: ");
      StudentID = ScannerStudentID.nextInt();
      StudentGID.add(StudentID);
      // Course Name
      Scanner ScannerCourseName = new Scanner(System.in);
      System.out.println("Enter Course Name: ");
      CourseName = ScannerCourseName.nextLine();
      CoursesName.add(CourseName);
      // Course Code
      Scanner ScannerCourseCode = new Scanner(System.in);
      System.out.println("Enter Course Code: ");
      CourseCode = ScannerCourseCode.nextInt();
      CourseCodes.add(CourseCode);
      // Grade Value
      Scanner ScannerGradeValue = new Scanner(System.in);
      System.out.println("Enter Grade: ");
      GradeValue = ScannerGradeValue.nextLine();
      GradesValue.add(GradeValue);

      // Add Another Grade
      Scanner AddMore = new Scanner(System.in);
      System.out.println("Do you want to add another Grade, 1 for yes, 2 for no");
      int AddMoreOutput = AddMore.nextInt();
      if (AddMoreOutput == 1) 
      {
        a = 1;
      } else if (AddMoreOutput == 2) 
      {
        a = 2;
      }
    }
  }

  public static void ViewGrades()
  {
    System.out.println("Grades:");
    System.out.println(StudentGID);
    System.out.println(CoursesName);
    System.out.println(CourseCodes);
    System.out.println(GradesValue);
  }
}
