package day40_CustomClassPractice;

public class Offer {
    double salary;
    String state;
    boolean hasPto;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPto, boolean isFullTime, boolean isWFH, String jobTitle, boolean hasBenefit) {
        this.salary = salary;
        this.state = state;
        this.hasPto = hasPto;
        this.isFullTime = isFullTime;
        this.isWFH = isWFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){// display the offer info
        System.out.println("====================================");
        System.out.println("Salary: " + salary);
        System.out.println("JobTitle: " + jobTitle);
        System.out.println("Location: " + state);

        System.out.println("====================================");
    }
}



