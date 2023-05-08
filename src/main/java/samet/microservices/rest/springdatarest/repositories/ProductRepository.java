package samet.microservices.rest.springdatarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import samet.microservices.rest.springdatarest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
