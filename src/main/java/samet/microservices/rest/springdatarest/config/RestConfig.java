package samet.microservices.rest.springdatarest.config;

import org.reflections.Reflections;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import samet.microservices.rest.springdatarest.projections.ProductProjectionMobile;
import samet.microservices.rest.springdatarest.projections.ProductProjectionWeb;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    // adding Projections manual
   /* @Override
    public void configureRepositoryRestConfiguration(
            RepositoryRestConfiguration repositoryRestConfiguration, CorsRegistry cors) {
        repositoryRestConfiguration.getProjectionConfiguration()
                .addProjection(ProductProjectionMobile.class)
                .addProjection(ProductProjectionWeb.class);
    }*/

    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        // Scan all projections and add them in to the configuration.
        Reflections r = new Reflections("samet.microservices.rest.springdatarest.projections");
        for (Class<?> c : r.getTypesAnnotatedWith(Projection.class)) {
            config.getProjectionConfiguration().addProjection(c);
        }
    }
}
