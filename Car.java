public class Car extends Vehicle {

    private int speed;

    public Car(int speed){
        this.speed = speed;
     
    }

    @Override    
    public void getSpeed(){
         System.out.println("The speed of the car is " + "" + speed + " " + "km/h!" + " " + "Broom Broom!!!");
         } 
         
    @Override
     public void displayInfo(){
        System.out.println("This vehicle is a Volvo!");

      }

      
        
    
}
