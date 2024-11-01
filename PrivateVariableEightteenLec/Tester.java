public class Tester
{
  public static void main(String[]args)
  {
    Student s1 = new Student("Bob", 11);
    Student s2 = new Student ("Carol", 33);
//    s1.id = 50;
    s1.updateID(-77);
    s1.showDetail();
  }
}