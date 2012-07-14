using ISP.Animal.Model;
using NUnit.Framework;

namespace ISP.Animal.Tests
{
    [TestFixture]
    class SerpienteTest
    {
        [Test]
        public void SinAlimentar()
        {
            var s = new Serpiente();
            Assert.That(s.GetEstado(), Is.EqualTo("quiero una rata"));
        }

        [Test]
        public void Alimentado()
        {
            var s = new Serpiente();
            s.Alimentar();
            Assert.That(s.GetEstado(), Is.EqualTo("no quiero una rata"));
        }
    }
}