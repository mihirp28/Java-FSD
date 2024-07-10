package com.jap.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MobileStockService {
    //Display all the products
    public void displayAllProducts(List<Mobile> mobileList) {
    	for(Mobile mob:mobileList)
		{	
			
			System.out.println(mob);
		}
		

    }

    // This method will filter by the brand name
    public List<Mobile> filterByBrandName(List<Mobile> mobiles, Predicate<Mobile> pre) {
    	List<Mobile> brand = new ArrayList<>();
		for(Mobile mob:mobiles) {
		
			if(pre.test(mob)) {
		
				brand.add(mob);
			}
		}
        return brand;
    }

    //Calculate total invoice amount for a particular brand of phone
    public double calculateInvoiceAmountForABrand(List<Mobile> mobileList) {
       // Use the Function Interface to perform the calculations
    	double totalamount=0;
    	for(Mobile mob:mobileList) {
			totalamount=totalamount+mob.getAmount()*mob.getQuantity();
		}
    	return totalamount;
    }


}