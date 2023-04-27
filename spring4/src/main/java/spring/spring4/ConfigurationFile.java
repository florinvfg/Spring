package spring.spring4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.spring4") 
@PropertySource("datosImportantes.propiedades")


public class ConfigurationFile {
    
    @Bean
    public EmpleadoStuff empleadoStuff() {
        EmpleadoStuff empleadoStuff = new EmpleadoStuff(informePersonalizadoStuff());
        return empleadoStuff;
    }

    private Object informePersonalizadoStuff() {
        return new InformePeriodicoAnual();
    }


}
