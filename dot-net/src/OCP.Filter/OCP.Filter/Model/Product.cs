namespace OCP.Filter.Model
{
    public class Product
    {
        public Product(ProductColor color)
        {
            Color = color;
        }

        public Product(ProductColor color, ProductSize size)
        {
            Color = color;
            Size = size;
        }

        public ProductColor Color { get; set; }
        public ProductSize Size { get; set; } 
    }
}
