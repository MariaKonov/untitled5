public class BonusMilesService {
    public int calculate(int prime){
        int mile = 20;// рублей для одной бонусной мили
        int bonus= prime/mile;
        return bonus;
    }
}