using DIP.Controller.Model;

namespace DIP.Controller
{
    public class DinnerRepository
    {
        public Dinner GetById(int id)
        {
            return new Dinner() { Name = "cumpleaños"};
        }
    }
}