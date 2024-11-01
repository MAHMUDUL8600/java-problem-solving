public class Tester
{
  public static void main(String[]args)
  {
    Student s3 = new Student();
    Student s1 = new Student("Mahmudul", 40);
    Student s2 = new Student("Mohiuddin", 50);
    Student s4 = new Student("Mohiuddin", 50,4.75 );
    s1.name="Mahmudul";
    s1.id = 40;
    s2.name = "Mohiuddin";
    s2.id = 50;
    s1.showDetail();
    s2.showDetail();
    s3.showDetail();
    s4.showDetail();
//    
  } 
}