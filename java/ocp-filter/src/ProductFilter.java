import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
	
    public List<Product> byColor(List<Product> products, ProductColor productColor) {
    	List<Product> filtered = new ArrayList<Product>();
    	
        for(Product product: products) {
            if (product.getColor().equals(productColor))
            	filtered.add(product);
        }
        
        return filtered;
    }

    public List<Product> byColorAndSize(List<Product> products, ProductColor productColor, ProductSize productSize) {
    	List<Product> filtered = new ArrayList<Product>();
    	
        for(Product product: products) {
            if (product.getColor().equals(productColor) && product.getSize().equals(productSize))
            	filtered.add(product);
        }
        
        return filtered;
    }
    
    public List<Product> bySize(List<Product> products, ProductSize productSize) {
    	List<Product> filtered = new ArrayList<Product>();
    	
        for(Product product: products) {
            if (product.getSize().equals(productSize))
            	filtered.add(product);
        }
        
        return filtered;
    } 
}