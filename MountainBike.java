public class MountainBike extends Bike{
  
  private int Incline;

  public MountainBike(int newGears, int newSpeed, int newIncline){
    super(newGears, newSpeed);
    Incline = newIncline;
  }

  public int GetterIncline(){
    return Incline;
  }

  public String toString(){
    return super.toString() + ", Incline is: " + Incline;
  }

}