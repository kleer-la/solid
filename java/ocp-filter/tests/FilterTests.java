import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class FilterTests extends TestCase {
	
     public void testFilterByBlueReturn2() {
         // arrange
         ProductFilter filter = new ProductFilter();
         List<Product> products = BuildProducts();

         // act
         List<Product> result = filter.byColor(products, ProductColor.Blue);

         // assert
         assertEquals(2, result.size());
     }

     public void testFilterBySmallReturn2() {
         // arrange
         ProductFilter filter = new ProductFilter();
         List<Product> products = BuildProducts();

         // act
         List<Product> result = filter.bySize(products,  ProductSize.Small);

         // assert
         assertEquals(2, result.size());
     }

     public void testFilterByBlueAndSmallReturn1() {
         // arrange
         ProductFilter filter = new ProductFilter();
         List<Product> products = BuildProducts();

         // act
         List<Product> result = filter.byColorAndSize(products, ProductColor.Blue, ProductSize.Small);

         // assert
         assertEquals(1, result.size());
     }

     private List<Product> BuildProducts() {
    	 List<Product> products = new ArrayList<Product>();
    	 
    	 products.add(new Product(ProductColor.Blue, ProductSize.Small)); 
    	 products.add(new Product(ProductColor.Yellow, ProductSize.Small)); 
    	 products.add(new Product(ProductColor.Yellow, ProductSize.Medium)); 
    	 products.add(new Product(ProductColor.Red, ProductSize.Large)); 
    	 products.add(new Product(ProductColor.Blue, ProductSize.ReallyBig));
    	 
    	 return products;
     }
}