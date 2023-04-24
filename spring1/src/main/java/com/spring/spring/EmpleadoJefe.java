package com.spring.spring;

public class EmpleadoJefe implements Empleados {

    @Override
    public String getResponsabilidades() {
        return "Responsabilidades de JEfE Empleado";
    }

    @Override
    public String getDocumento() {
        return "Documento Jefe Empleado";
    }

}
