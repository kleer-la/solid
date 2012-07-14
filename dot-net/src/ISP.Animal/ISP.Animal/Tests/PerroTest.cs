using ISP.Animal.Model;
using NUnit.Framework;

namespace ISP.Animal.Tests
{
    [TestFixture]
    class PerroTest
    {
        [Test]
        public void SinAlimentarNiAcariciar()
        {
            var p = new Perro();
            Assert.That(p.GetEstado(), Is.EqualTo("quiero un hueso y quiero jugar"));
        }

        [Test]
        public void Alimentado()
        {
            var p = new Perro();
            p.Alimentar();
            Assert.That(p.GetEstado(), Is.EqualTo("no quiero un hueso y quiero jugar"));
        }

        [Test]
        public void AlimentadoYAcariciado()
        {
            var p = new Perro();
            p.Alimentar();
            p.Acariciar();
            Assert.That(p.GetEstado(), Is.EqualTo("no quiero un hueso"));
        }
    }
}