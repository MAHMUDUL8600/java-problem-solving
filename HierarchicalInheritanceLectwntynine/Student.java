public class Student
{
  public String name;
  public int id;
  public Student (String nm, int i){
    name = nm;
    id = i;
  }
  public void showDetal(){
    System.out.println(name+" "+id);
  }
}