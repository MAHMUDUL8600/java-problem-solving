public class Tester
{
  public static void main(String[]args)
  {
    ABC a1 = new ABC(11);
    a1.method1();
    ABC a2 = new ABC(22);
    a2.method1();
    ABC.x=66;
    a1.method1();
    a2.method1();
  }
}
    