package samet.microservices.rest.springdatarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import samet.microservices.rest.springdatarest.model.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
}
