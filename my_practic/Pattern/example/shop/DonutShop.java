package Pattern.example.shop;

public class DonutShop extends Shop implements Nameable {

    String companyName;
    String[] menuItems = {
            "Пончики",
            "Маффины",
            "Пирожное из слоеного теста",
            "Кофе",
            "Чай"
    };

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void setName(String aName) {
        companyName = aName;
    }

    @Override
    public String[] getInventory() {
        return menuItems;
    }

    @Override
    public void buyInventory(String item) {
        System.out.println("\nВы только что приобрели" + item);
    }
}
