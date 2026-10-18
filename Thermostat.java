public class Thermostat {
    private double Temprature;
    
   public void setTemprature ( double Temprature_1 )  {
   if ( Temprature_1 >=0.00 && Temprature_1 <=50.00 )
       Temprature =  Temprature_1;
else {
    System.out.println(" Error: Temperature Out Of Range! ");
}
   }
    public double getTemprature() {
        return Temprature;
    }

public static void main(String[]  args) {
    Thermostat t1 = new Thermostat();


    t1.setTemprature(24.32);
    System.out.println("Temprature : " + t1.getTemprature());
}
}



