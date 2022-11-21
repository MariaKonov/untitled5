public class BonusMilesService {
    public int bonus (int cost) {

        int miles = 20;
        int bonusMiles = cost / miles;

        return bonusMiles;
    }
}