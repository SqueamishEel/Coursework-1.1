import java.util.Scanner;
import java.util.ArrayList;

public class Courses {
  // Variables
  private static String CourseName;
  private static String CourseInput;
  private static int CourseCode;
  // Array Lists
  static ArrayList<String> CoursesName = new ArrayList<String>();
  static ArrayList<Integer> CourseCodes = new ArrayList<Integer>();

  public static void AddCourses() {
    int a = 1;
    while (a == 1) {
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

      // Add Another Course
      Scanner AddMore = new Scanner(System.in);
      System.out.println("Do you want to add another Course, 1 for yes, 2 for no");
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

  public static void AllGrades()
  {
    System.out.println("All Grades:");
    System.out.println(Grades.StudentGID);
    System.out.println(Grades.CoursesName);
    System.out.println(Grades.CourseCodes);
    System.out.println(Grades.GradesValue);
  }
}
