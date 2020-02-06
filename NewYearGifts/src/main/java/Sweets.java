public class Sweets {
    int no_of_sweets;
    private float weight_per_one;
    Sweets(float weight,int n){
        weight_per_one=weight;
        no_of_sweets=n;
    }
    public void calculateWeightOfSweet(){
        float total_wt=weight_per_one*no_of_sweets;
        System.out.println(total_wt+" Grams ");
    }
}
class KajuKatli  extends  Sweets{
    KajuKatli(float weight,int n){
        super(weight,n);
    }
}
