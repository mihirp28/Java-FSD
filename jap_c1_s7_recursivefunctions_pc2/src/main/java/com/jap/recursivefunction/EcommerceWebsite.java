package com.jap.recursivefunction;

public class EcommerceWebsite {
   public static int countTags(int items, int tags, int amount)
    {
	int num1=amount/items;
	   int num2=num1/tags;
        return num2;
    }
    public static int countTotalItemsPurchasedIncludingFreeItem(int amount,int priceOfEachItem, int tags)
    {
    	int num3= amount/priceOfEachItem;
    	int num4= num3/tags;
        return num3+num4;

    }

    public static void main (String[] args)
    {
        // total money to be spent
        int amount=0;
        //  cost of each item
        int priceOfEachItem=0;
        // no of tags exchanged for one free item.
      int tags=0;
        System.out.println("The total number of items (purchased + free items) : "+countTotalItemsPurchasedIncludingFreeItem(amount , priceOfEachItem, tags));
    }


}
