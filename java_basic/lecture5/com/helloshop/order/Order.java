package java_basic.lecture5.com.helloshop.order;

import java_basic.lecture5.com.helloshop.product.*;
import java_basic.lecture5.com.helloshop.user.*;

public class Order{
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}