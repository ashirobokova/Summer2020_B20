package day41_Static;
/*
       instance variables:
               width, length, unitPrice, isPersian (boolean)
       instance methods:
               customOrder(): sets the carpet' width, length, unitprice, & isPersian
               calcCost(): should be able to calculate the total cost of the carpet and return it as double
               getCarpetInfo(): should be able to display all the info of the carpet including the total cost
               of the carpet as calculated by calcCost()
           total price of carpet= (width*length)*unitprice
           if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
    */
public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean  isPersian;

    public void  customOrder(double width, double length, double unitPrice, boolean isPersian){
       // we have to assign parametr to object instance variable
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice+=200;
        }
       // return  (isPersian)? totalPrice +200: totalPrice;
        return totalPrice;
        // has to match with return type int => int
    }
    public void getCarpetInfo(){
        System.out.println("======================================");
        System.out.println("width: "+ width);
        System.out.println("length: "+ length);
        System.out.println("unit price "+ unitPrice);
        System.out.println("Persian Carpet");
        System.out.println("Total price: " + calcCost());
        System.out.println("=======================================");
    }

}
