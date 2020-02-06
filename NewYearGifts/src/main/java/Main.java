public class Main {
    public static void main(String[] args){
        int noOfSweets=11,noOfChocolates=8,noOfCandies=9;
        Gift gift=new Gift(noOfSweets,noOfChocolates,noOfCandies);
        System.out.println("The Contents of the Gift Box are");
        gift.contentsOfGift();
        float weightOfOneSweet=10;
        KajuKatli kajuKatli= new KajuKatli(weightOfOneSweet,noOfSweets);
        Hersheys hersheys=new Hersheys();
        float[] price_chocolates={90,50,100,20,225,125,110,70};
        hersheys.sorted_price(price_chocolates);
        System.out.print("Weight of KajuKatli(Sweet) in the Gift Box is ");
        kajuKatli.calculateWeightOfSweet();
        Caramel caramel=new Caramel();
        int lowerRangeOfRating=4,upperRangeOfRating=9;
        float[] rating={(float) 7.0, (float) 3.0, (float) 7.1, (float) 9.0, (float) 8.2, (float) 9.9, (float) 7.1, (float) 2.0, (float) 5.5};
        caramel.findCount(rating,lowerRangeOfRating,upperRangeOfRating);
    }
}
