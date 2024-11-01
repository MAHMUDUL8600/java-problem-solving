public class CSEStudent extends Student
{
  public int numOfLabs;
  public CSEStudent(String nm, int i, int Lab){
    super(nm, i);
    numOfLabs= Lab;
    
  }
  public void cry(){
    System.out.println(name+" is crying because of "+numOfLabs);
  }
}