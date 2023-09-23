public class GoodDeal
{
    public static void testGoodDeal(double origionalPrice, double salePrice, boolean expected) {
        boolean result = goodDeal(origionalPrice, salePrice);
        System.out.println ("Origional Price: " + origionalPrice + "  Sale Price: " + salePrice + "  Expected: " + expected + "  Result: " + result);
    }
    
    public static boolean goodDeal (double origionalPrice, double salePrice) {
        if (salePrice < .75*origionalPrice)
            return true;
        else
            return false;
    }
    
    public static void main (String[] args) {
        testGoodDeal (100, 20, true);
        testGoodDeal (300, 270, false);
        testGoodDeal (25, 18.5, true);
    }
}