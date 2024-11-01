public class Student
{
  public String name;
  public int id;
  public static int count = 0;
  
  public Student (String nm, int i){
    name = nm;
    id = i;
    count +=1;
  }
  public void showDetail(){
    System.out.println("Name :"+name);
    System.out.println("Name :"+id);
  }    
}