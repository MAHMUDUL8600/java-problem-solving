public class Tester
{
  public static void main (String[]args)
  {
    System.out.println(Student.uniName);
    System.out.println(Student.uniName);
    Student s1 = new Student ("Bob", 11);
    Student s2 = new Student ("Carol", 33);
    Student.upUniName("Brac University");
    s1.showDetail();
    s2.showDetail();
    
  }
}