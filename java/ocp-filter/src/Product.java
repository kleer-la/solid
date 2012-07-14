
public class Product {
	private final ProductColor color;
	private final ProductSize size;
	
    public Product(ProductColor color) {
        this(color, ProductSize.Medium);
    }

    public Product(ProductColor color, ProductSize size) {
        this.color = color;
        this.size = size;
    }

    public ProductColor getColor() {
    	return this.color;
    }
    
    public ProductSize getSize() {
    	return this.size;
    } 
}