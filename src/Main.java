public class Main {
    private int miles;

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 200;
        int miles = service.bonus(price);

        System.out.println(" Бонусная миль составляет " + miles);
    }
}