public class Student
{
  public String name;//instance variable
  public String id;  //instance variable
  //access_modifier void/return_type methodName(parameters)
  public void showDetail(){  //instance method// object dependent
    System.out.println(name+" "+id);
}
   public void standUp(){  //instance method// object dependent
    System.out.println(name+" is now standing");
}
}