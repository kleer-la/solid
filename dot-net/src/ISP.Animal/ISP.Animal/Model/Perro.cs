namespace ISP.Animal.Model
{
    public class Perro : Animal
    {
        private bool _alimentado;
        private bool _acariciado;

        public override void Alimentar()
        {
            _alimentado = true;
        }

        public override void Acariciar()
        {
            _acariciado = true;
        }

        public override string GetEstado()
        {
            var estado = string.Empty;

            if (_alimentado)
				estado = "no quiero un hueso";
            if (!_alimentado)
				estado = "quiero un hueso";
            if (!_acariciado)
				estado += " y quiero jugar";

            return estado;
        }
    }
}