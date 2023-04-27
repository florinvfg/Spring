package spring.spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan 
public interface Empleados  {
    public abstract String getResponsabilidades();
    public String getDocumento();


}



