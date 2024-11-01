public class Player
{
  public int run = 0;//instance variable
  public static int teamRun = 0;
//  public int teamRun = 0;//instance variable
  
  public void hit_four(){
    run = run + 4;
    teamRun = teamRun + 4;
  }
  public void hit_six(){
    run = run + 6;
    teamRun = teamRun + 6;
  }
}