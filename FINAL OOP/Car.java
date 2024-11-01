public class Car
{
  public String brand;
  public String model;
  public int year;
  
  public  Car(){
    System.out.println("I was call");
  }
  public  Car(String br, String md){
    brand=br;
    model=md;
  }
  public  Car(String br, String md, int yr){
    brand=br;
    model=md;
    year=yr;
  }
  public void details(){
    System.out.println(brand+" "+model+" "+year);
  }
}