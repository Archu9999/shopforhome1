package shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shopforhome.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, String> {

}
