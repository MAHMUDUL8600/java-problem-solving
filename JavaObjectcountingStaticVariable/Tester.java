public class Tester
{
  public static void main(String[]args)
  {
    System.out.println("Total Student: "+Student.count);
    Student s1 = new Student("Bob", 11);
    Student s2 = new Student("Carol", 33);
    s1.showDetail();
    s2.showDetail();
    System.out.println("Total Student: "+Student.count);
  }
}