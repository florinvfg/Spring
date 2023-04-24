package com.spring.spring;

public class EmpleadoRaso implements Empleados {

    public EmpleadoRaso() {
    }

    @Override
    public String getResponsabilidades() {
        return "Funciones Empleado Raso";
    }

    @Override
    public String getDocumento() {
       return "DOCUMENTO EMPLEADO RASO";
    }
    
}
