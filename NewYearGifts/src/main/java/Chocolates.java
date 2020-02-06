import java.util.Arrays;
public class Chocolates {
    int[] price;
    public void sorted_price(float[] price){
        Arrays.sort(price);
        for(int i=0;i<price.length;i++){
            System.out.print(price[i]+" ");
        }
        System.out.println("");
        System.out.println();
    }
}
class Hersheys extends Chocolates{
    Hersheys(){
        System.out.println("Sorted prices of Hershey's chocolates in the Gift Box are ");
    }
}
