package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCarInfo("Lexus","RX350", 2019, "White", 14000.0, 45000.0);
        car2.setCarInfo("Lexus", "RX450", 2020, "Black", 1000.0, 50000.0);
        car3.setCarInfo("Bugatti", "Veyron", 2018, "Blue", 23000.0, 500000.0);
        car4.setCarInfo("Ford","Escape", 2018,"White",25000.0,20000.0);
        car5.setCarInfo("Nissan","GT-R",2015,"Blue",54123.0,89650.0);


        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();


        car3.start();
        car5.start();



    }
}
