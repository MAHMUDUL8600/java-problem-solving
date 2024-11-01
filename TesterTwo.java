public class TesterTwo
{
  public static void main(String[]args)
  {
    House h1 =new House();
    h1.window=6;
    h1.door=4;
    House h2 =new House();
    h2.window=10;
    h2.door=6;
    System.out.println("h1=====");
    h1.view();
    System.out.println("h2=====");
    h2.view();
    h1.increaseDoor(1);
     System.out.println("h1=====");
    h1.view();
     h2.increaseDoor(1);
     System.out.println("h1=====");
    h1.view();
    
  }
}
      
