package spring.spring3;

import org.springframework.stereotype.Component;

@Component("EmpleadoJefe")
public class EmpleadoJefe implements Empleados {

    @Override
    public String getResponsabilidades() {
        return "Responsabilidades de JEfE Empleado";
    }

    @Override
    public String getDocumento() {
        return "Documento Jefe Empleado";
    }

    public EmpleadoJefe() {
    }

    

}
