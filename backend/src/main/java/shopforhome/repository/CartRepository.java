package shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shopforhome.entity.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}
