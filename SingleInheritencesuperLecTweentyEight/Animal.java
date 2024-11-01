public class Animal 
{
  public String name;
  public Animal(){
    System.out.println("No parameter Animal const");
  }
  public Animal(String nm){
    name = nm;
    System.out.println("1 parameter Animal const");
  }
  public void eat(){
    System.out.println(name+ " is eating");
  }
}