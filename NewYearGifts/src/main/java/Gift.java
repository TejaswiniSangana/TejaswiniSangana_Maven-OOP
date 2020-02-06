public class Gift {
    private int no_of_sweets;
    private int no_of_chocolates;
    private int no_of_candies;
    Gift(int n_sweets, int n_Chocolates, int n_candies){
        no_of_sweets=n_sweets;
        no_of_chocolates=n_Chocolates;
        no_of_candies=n_candies;
    }
    public void contentsOfGift(){
        System.out.println("Number of Sweets = "+no_of_sweets);
        System.out.println("Number of Chocolates = "+no_of_chocolates);
        System.out.println("Number of Candies = "+no_of_candies);
        System.out.println();
    }

}
