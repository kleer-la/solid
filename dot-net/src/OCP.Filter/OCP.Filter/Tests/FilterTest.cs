using System.Collections.Generic;
using System.Linq;
using NUnit.Framework;
using OCP.Filter.Model;

namespace OCP.Filter.Tests
{
    [TestFixture]
	public class FilterTest
    {
        [Test]
        public void FilterByBlueReturns2()
        {
            // arrange
            var filter = new ProductFilter();
            var products = BuildProducts();

            // act
            var result = filter.ByColor(products, ProductColor.Blue);

            // assert
            Assert.That(result.Count(), Is.EqualTo(2));
            Assert.That(result, Has.All.Matches<Product>(x => x.Color == ProductColor.Blue));
        }

        [Test]
        public void FilterBySmallReturns2()
        {
            // arrange
            var filter = new ProductFilter();
            var products = BuildProducts();

            // act
            var result = filter.BySize(products,  ProductSize.Small);

            // assert
            Assert.That(result.Count(), Is.EqualTo(2));
            Assert.That(result, Has.All.Matches<Product>(x => x.Size == ProductSize.Small));
        }

        [Test]
        public void FilterByBlueAndSmallReturns1()
        {
            // arrange
            var filter = new ProductFilter();
            var products = BuildProducts();

            // act
            var result = filter.ByColorAndSize(products, ProductColor.Blue, ProductSize.Small);

            // assert
            Assert.That(result.Count(), Is.EqualTo(1));
            Assert.That(result, Has.All.Matches<Product>(x => x.Size == ProductSize.Small));
        }

        private static IList<Product> BuildProducts()
        {
            return new List<Product> { 
                new Product(ProductColor.Blue, ProductSize.Small), 
                new Product(ProductColor.Yellow, ProductSize.Small), 
                new Product(ProductColor.Yellow, ProductSize.Medium), 
                new Product(ProductColor.Red, ProductSize.Large), 
                new Product(ProductColor.Blue, ProductSize.ReallyBig)
            };
        }
    }
}