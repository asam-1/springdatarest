package samet.microservices.rest.springdatarest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import samet.microservices.rest.springdatarest.model.Product;
import samet.microservices.rest.springdatarest.repositories.ProductProjectionMobile;
import samet.microservices.rest.springdatarest.repositories.ProductProjectionWeb;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(
            RepositoryRestConfiguration repositoryRestConfiguration, CorsRegistry cors) {
        repositoryRestConfiguration.getProjectionConfiguration()
                .addProjection(ProductProjectionMobile.class)
                .addProjection(ProductProjectionWeb.class);
    }
}
