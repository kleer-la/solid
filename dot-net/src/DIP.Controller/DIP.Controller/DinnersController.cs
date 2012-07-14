using DIP.Controller.Model;

namespace DIP.Controller
{
    public class DinnersController
    {
        private readonly DinnerRepository _dinnerRepository;

        public DinnersController()
        {
            _dinnerRepository = new DinnerRepository();
        }

        public Dinner GetById(int id)
        {
            return _dinnerRepository.GetById(id);
        }

    }
}