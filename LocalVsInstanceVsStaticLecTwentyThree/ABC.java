public class ABC
{
  public int temp;
  public static int x = 4;
  public ABC(int val){
    temp = val;
  }
  public void method1(){
    int temp = 5;
    int x=6;
    System.out.println(this.temp);
    System.out.println(ABC.x);
  }
}