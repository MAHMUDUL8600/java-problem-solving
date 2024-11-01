public class Tester
{
  public static void main(String[]args)
  {
    System.out.println("Team Run: "+Player.teamRun);
    Player sakib = new Player();
    Player tamim = new Player();
    tamim.hit_four();
    tamim.hit_four();
    sakib.hit_six();
    System.out.println("Sakib Run: "+sakib.run);
    System.out.println("Tamim Run: "+tamim.run);
    System.out.println("Team Run: "+Player.teamRun);
  }
}