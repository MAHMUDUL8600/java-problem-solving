import java.util.Arrays;
public class Student
{
  public String name;
  public int id;
  public Course [] courses = new Course [5];
  public int courseCount=0;
  
  public Student (String nm, int i){
    name =nm;
    id =i;
  }
  public void addCourse(Course c){
    courses [courseCount]=c;
    courseCount +=1;
    
  }
  public void showDetail(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("Course Taken: ");
     for(int i=0;i<courseCount; i++){
      System.out.println(courses[i].code);
      System.out.println(courses[i].title);
    } 
  }  
}
