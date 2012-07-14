namespace ISP.Animal.Model
{
    public abstract class Animal
    {
        public abstract void Alimentar();
        public abstract void Acariciar();
        public abstract string GetEstado();
    }
}