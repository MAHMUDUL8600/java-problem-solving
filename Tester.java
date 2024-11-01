public class Tester
{
  public static void main(String[]args)
  {
    //Classname variable = new Classname()
    Student s1 = new Student();//object1/instant1
    Student s2 = new Student();
    s1.name= "mohin";
    s1.id= "11";
    s2.name= "mahmud";
    s2.id= "12";
    s1.standUp();
    s2.standUp();
   s1.showDetail();
   System.out.println("--------");
   s2.showDetail();
   
  }
}