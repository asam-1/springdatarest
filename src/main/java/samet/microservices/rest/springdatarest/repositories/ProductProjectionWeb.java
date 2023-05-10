package samet.microservices.rest.springdatarest.model;

import org.springframework.data.rest.core.config.Projection;
import samet.microservices.rest.springdatarest.model.Product;

@Projection(name ="web", types= Product.class)
public interface ProductProjectionWeb {
    String getName();
    double getPrice();
}
