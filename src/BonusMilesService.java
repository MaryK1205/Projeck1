public class BonusMilesService {
    public int calculate(int priceTicket) {
        int costOfMili = 20;
        int numberMili = priceTicket / costOfMili;
        return numberMili;

    }
}
