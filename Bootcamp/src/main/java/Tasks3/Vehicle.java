package Tasks3;

public class Vehicle {

    public static void main(String[] args) {
        Volvo volvo = new Volvo();
        volvo.drive();
        volvo.changeGear();
        Car car = new Car();
        car.steer();

    }

   public void steer (){

       System.out.println("Turn left and right");

   }

   public void changeGear (){

       System.out.println("Change gear when 2000mph");

   }

   public void drive (){

       System.out.println("Press accelerator to start and brakes to stop");

   }

}
