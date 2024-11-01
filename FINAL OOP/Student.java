public class Student
{
  public String name;
  public int id;
  public double cgpa;
  
  public Student(){
     System.out.println("1 No parameter i was called ");
  }
  
  public  Student(String na, int idd){
  System.out.println("2 parametter i was called");
  name = na;
  id = idd;
  }
  public  Student(String name, int id, double cgpa){
  System.out.println(" 3 parameter i was called");
  this.name = name;
  this.id = id;
  this.cgpa = cgpa;                   
                     
  }
  public void standup(){
    System.out.println(name+" Roll is "+id);
  }
  public void showDetail(){
    System.out.println(name+" Roll is "+id+" Cgpa "+cgpa);
  }
  
}