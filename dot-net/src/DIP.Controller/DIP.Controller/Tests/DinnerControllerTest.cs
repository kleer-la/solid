using NUnit.Framework;

namespace DIP.Controller.Tests
{
    [TestFixture]
    public class DinnerControllerTest
    {
        [Test]
        public void GetByIdTest()
        {
            var dinnersController = new DinnersController();
            Assert.That(dinnersController.GetById(1).Name, Is.EqualTo("cumpleaños"));
        }
    }
}