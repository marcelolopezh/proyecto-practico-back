package everis.proyecto.practico;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig {

  @Bean
  public WebMvcConfigurer CORSConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry
          .addMapping("/**")
          .allowedOrigins(
        	"http://localhost:5555"
          )
          .allowedHeaders("*")
          .allowCredentials(true)
          .allowedMethods("GET", "POST", "PUT", "DELETE");
      }
    };
  }
}
