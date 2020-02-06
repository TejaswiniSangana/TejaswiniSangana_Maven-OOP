public interface Candies {
    public void findCount(float rating[],int lowerRange,int upperRange);
}
class Caramel implements Candies{

    public void findCount(float[] rating, int lowerRange, int upperRange) {
        int count=0;
        for(int i=0;i<rating.length;i++){
            if(rating[i]>=lowerRange && rating[i]<=upperRange){
                count=count+1;
            }
        }
        System.out.println("\nNumber of Candies having rating between "+lowerRange+" and "+upperRange+" are "+count);
    }

}