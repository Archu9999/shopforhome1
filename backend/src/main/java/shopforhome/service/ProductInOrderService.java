package shopforhome.service;

import shopforhome.entity.ProductInOrder;
import shopforhome.entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
