
public class DinnersController {

    private final DinnerRepository dinnerRepository;

    public DinnersController()
    {
        this.dinnerRepository = new DinnerRepository();
    }

    public Dinner getById(int id)
    {
        return this.dinnerRepository.getById(id);
    }
}