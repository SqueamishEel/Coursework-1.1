import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    int a = 1;
    while (a == 1) 
    {
      Scanner ScannerChoice = new Scanner(System.in);
      System.out.println(
          "1 = Add Students, 2 = View Students, 3 =  Add Course, 4 = View Grades, 5 = Add Grades, 6 = View Grades, 7 = Exit");
      int Choice = ScannerChoice.nextInt();
      {
        if (Choice == 1) 
        {
          Student.AddStudents();
        } 
        else if (Choice == 2) 
        {
          Student.ViewStudents();
        } 
        else if (Choice == 3) 
        {
          Courses.AddCourses();
        } 
        else if (Choice == 4) 
        {
          Courses.AllGrades();
        } 
        else if (Choice == 5) 
        {
          Grades.AddGrades();
        }
        else if (Choice == 6) 
        {
          Grades.ViewGrades();
        } 
        else if (Choice == 7) 
        {
          System.out.println("You Have Exited the Program!");
          a = 2;
        }
      }
    }
  }
}
