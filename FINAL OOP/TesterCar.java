public class TesterCar
{
  public static void main(String[] args)
  {
    Car c1 = new Car();
    Car c2 = new Car("BMW", "M4");
    Car c3 = new Car("TOYATA", "PREMIO");
    Car c4 = new Car("AUDI", "R8",2020);
    c1.details();
    c2.details();
    c3.details();
    c4.details();
    
  }
}
  