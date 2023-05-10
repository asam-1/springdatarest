package samet.microservices.rest.springdatarest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import samet.microservices.rest.springdatarest.model.Product;
import samet.microservices.rest.springdatarest.repositories.ProductRepository;

@SpringBootApplication
public class SpringdatarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		return  args -> {
			repositoryRestConfiguration.exposeIdsFor(Product.class);
			productRepository.save(new Product(null, "p1", 23, 234));
			productRepository.save(new Product(null, "p2", 29, 23));
			productRepository.save(new Product(null, "p3", 77, 34));
			productRepository.save(new Product(null, "p4", 1.89, 234));
			productRepository.findAll().forEach(product -> {
				System.out.println(product.getName());
			});
		};
	}

}
