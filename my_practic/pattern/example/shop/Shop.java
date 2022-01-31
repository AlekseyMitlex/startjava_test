package pattern.example.shop;

public abstract class Shop {

    CustList customerList;

    public void CalculateSaleTax() {
        System.out.println("Вычисление налога на продажу");
    }

    public abstract String[] getInventory();

    public abstract void buyInventory(String item);
}

