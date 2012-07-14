using NUnit.Framework;
using OCP.StarbuzzCoffee.Model;

namespace OCP.StarbuzzCoffee.Tests
{
    [TestFixture]
    public class BeverageTest
    {
        [Test]
        public void Expresso()
        {
            // arrange
            Beverage beverage = new Expresso();

            // act
            decimal cost = beverage.GetCost();

            // assert
            Assert.That(5, Is.EqualTo(cost));
        }

        [Test]
        public void ExpressoWithMocha()
        {
            // arrange
            Beverage beverage = new ExpressoWithMocha();

            // act
            decimal cost = beverage.GetCost();

            // assert
            Assert.That(5.5, Is.EqualTo(cost));
        }

        [Test]
        public void ExpressoWithSteamedMilkAndMocha()
        {
            // arrange
            Beverage beverage = new ExpressoWithSteamedMilkAndMocha();

            // act
            decimal cost = beverage.GetCost();

            // assert
            Assert.That(6.5, Is.EqualTo(cost));
        }
    }
}