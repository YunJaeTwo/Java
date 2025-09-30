package java_basic.lecture6.path2;

import java_basic.lecture6.path1.ShoppingCart;
import java_basic.lecture6.path1.Item;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(2);

        Item item1 = new Item("상추", 2000, 4);
        Item item2 = new Item("깻잎", 3000, 6);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
    
}
