
public class DinnerRepository {
	
    public Dinner getById(int id)
    {
        return new Dinner(id, "cumpleaños");
    }
}