public class Student
{
  public String name;
  public int id;
  public static String uniName = "Bracu";
  
  public Student (String n, int i){
    name = n;
    id = i;
  }
  public static void upUniName(String uname){ // Static method
    uniName = uname;
  }
  
  public void showDetail(){  // instance method
    System.out.println("Name: "+name);
    System.out.println("Name: "+id);
    System.out.println("University: "+uniName);
  }
}