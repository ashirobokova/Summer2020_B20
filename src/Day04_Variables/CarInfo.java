package Day04_Variables;
/* Year
   Brand
   Model
   Mileage
   Price */
public class CarInfo {
    public static void main(String[] args) {
        int year = 2008;
        String brand = "BMW";
        String model = "X5";
        String color = "Red";
        short mileage = 30000;
        int price = 45_000;
        // 2020 BMW X5, 3000 miles, $45000
        System.out.println(year +" "+ brand+" "+model+ " " +color +", "+ mileage+" miles, $"+price);

    }
}