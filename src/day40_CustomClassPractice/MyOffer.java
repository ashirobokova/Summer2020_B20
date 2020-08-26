package day40_CustomClassPractice;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(130000, "VA", true, true, true, "SDET", true);
        offer2.setOfferInfo(120000, "IL", true, false, false, "QA", true);
        offer3.setOfferInfo(50000, "IL", true, true, true, "QA", false);
        offer4.setOfferInfo(85000, "MN", false,false, true, "SDET", true);
        offer5.setOfferInfo(96000, "TX", false,false, true, "QA", true);
        offer6.setOfferInfo(110000, "TX", false,false, true, "QA", true);
        offer7.setOfferInfo(120000, "IN", false,false, true, "SDET", true);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for(Offer eachOffer : jobOffers){
            eachOffer.getOfferInfo();
        }

        System.out.println("========================================");
        // remove offers less than 120k
        //jobOffers.removeIf(p -> p.salary <120000);
        //System.out.println("Number of offers: " + jobOffers.size());

        //less than 120k or not from VA
        String myLocation = "VA";
        //jobOffers.removeIf(p -> p.salary < 120000 || !p.state.equals("VA"));
        //System.out.println("Number of offers: " + jobOffers.size());

        // does not have PTO or does not have benefit or is not full time
        jobOffers.removeIf(p -> p.hasPto== false || p.hasBenefit == false || p.isFullTime == false);
        System.out.println("Numbers of Offers: " + jobOffers.size());
    }
}