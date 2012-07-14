using System;

namespace ISP.Animal.Model
{
    public class Serpiente : Animal
    {
        private bool _alimentada;

        public override void Alimentar()
        {
            _alimentada = true;
        }

        public override void Acariciar()
        {
            // ignore - I'm not grooming a freaking rattlesnake
            throw new NotImplementedException("No voy a acariciar a una serpiente");
        }

        public override string GetEstado()
        {
            var estado = "quiero una rata";

            if (_alimentada)
				estado = "no " + estado;

            return estado;
        }
    }
}