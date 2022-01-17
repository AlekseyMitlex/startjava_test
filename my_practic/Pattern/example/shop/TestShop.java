package Pattern.example.shop;

class TestShop {

    public static void main(String args[]) {
        Shop shop = null;
        String className = args[0];
        System.out.println("Создание экземпляра класса:" + className +
                "\n");
        try {
            // new pizzaShop();
            shop = (Shop) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] inventory = shop.getInventory();
        // показ списка товаров
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Аргумент" + i + " = " + inventory[i]);
        }
        // покупка товара
        shop.buyInventory(inventory[1]);
    }
}
