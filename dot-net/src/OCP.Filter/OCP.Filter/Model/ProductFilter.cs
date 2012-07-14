using System.Collections.Generic;

namespace OCP.Filter.Model
{
	public class ProductFilter
    {
        public IEnumerable<Product> ByColor(IList<Product> products, ProductColor productColor)
        {
            foreach (var product in products)
            {
                if (product.Color == productColor)
					yield return product;
            }
        }

        public IEnumerable<Product> ByColorAndSize(IList<Product> products, ProductColor productColor, ProductSize productSize)
        {
            foreach (var product in products)
            {
                if ((product.Color == productColor) && (product.Size == productSize))
					yield return product;
            }
        }

        public IEnumerable<Product> BySize(IList<Product> products, ProductSize productSize)
        {
            foreach (var product in products)
            {
                if ((product.Size == productSize))
					yield return product;
            }
        } 
    }
}