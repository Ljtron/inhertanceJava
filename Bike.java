public class Bike{
  private int gear;
  private int speed;


  public Bike(int newGear, int newSpeed){
    gear = newGear;
    speed = newSpeed;
  }

  public int getterSpeed(){
    return speed;
  }

  public int getterGear(){
    return gear;
  }

  public void increaseSpeed(){
    speed += 1;
  }

  public void decreaseSpeed(){
    if(speed > 0){
      speed -= 1;
    }
  }

  public void increaseGear(){
    gear += 1;
  }

  public void decreaseGear(){
    if(gear > 0){
      gear -= 1;
    }
  }

  public String toString(){
    return "Speed is: " + speed + ", Gear is: "+ gear;
  }


}