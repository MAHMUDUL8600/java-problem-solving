public class Student
{
  public String name;
  private int id;
  public Student(String nm,int i)
  {
    name = nm;
    id = i;
  }
  public void updateID(int i){
    if(i>0){
      id = i;
  }
    else{
      System.out.println("Invalid Id given");
    }
  }
  
  public void showDetail(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
  } 
  
}