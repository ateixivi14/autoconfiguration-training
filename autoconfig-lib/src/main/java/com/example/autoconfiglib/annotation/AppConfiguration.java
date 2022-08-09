import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    
    @Bean(name = "myCustomBean")
    public CustomMessageLib customMessageLib() {
        return new CustomMessageLib("hola 2");
    }
}
