package samet.microservices.rest.springdatarest.repositories;


import org.springframework.data.rest.core.config.Projection;
import samet.microservices.rest.springdatarest.model.Product;

@Projection( name ="mobile", types = {Product.class})
public interface ProductProjectionMobile {

    String getName();

}
