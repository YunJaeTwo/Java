package java_basic.lecture5.com.helloshop.order;

import java_basic.lecture5.com.helloshop.product.*;
import java_basic.lecture5.com.helloshop.user.*;

public class OrderService {
    public void Order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
