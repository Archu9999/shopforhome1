package shopforhome.service;

import java.util.Collection;

import shopforhome.entity.Cart;
import shopforhome.entity.ProductInOrder;
import shopforhome.entity.User;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
