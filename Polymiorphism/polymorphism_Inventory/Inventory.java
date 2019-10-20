package april2017.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	/**
	 * Public method for determining value of all items in the bicycle shop.
	 * To produce an output, it calls two helper methods. You must implement
	 * the helper methods. Do not modify this method
	 */
	public static int inventoryValue(List<Bicycle> bicycles, List<Accessory> accessories) {
		//DO NOT MODIFY IN ANY WAY
		return (int)computeCurrentValue(prepareList(bicycles, accessories));
	}
	
	/** 
	 * Prepares and returns a list of all products in the store, obtained by combining
	 * the list of all bicycles and the list of all accessories (the inputs to the
	 * method), to form a list having a type common to (generalized from) the two 
	 * input types.
	 */
	private static List<Product> prepareList(List<Bicycle> bicycles, List<Accessory> accessories) {
		/* implement */
		List<Product> productList=new ArrayList<>();
		productList.addAll(bicycles);
		productList.addAll(accessories);
		return productList;
	}
	
	/** Returns the sum of the prices of all items in the bicycle shop, including
	 *  bicycles and accessories
	 */
	private static double computeCurrentValue(List<Product> products) {
		/*implement */
		double sumOfTotalValue=0;
		for(Product productObject:products){
			sumOfTotalValue=sumOfTotalValue+productObject.getTotalValue();
		}
		return sumOfTotalValue;
	}
}
