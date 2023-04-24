package com.spring.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    // Cargar Archivo Sprinx XML. En el parentesis debe ir el nombre exacto de
    // nuestro archivo de configuraciión XML
    ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicacionContext1.xml");

    // Creamos 2 objetos mediante el beans al XML de Spring
    Empleados Jaime = contexto.getBean("miEmpleado", Empleados.class);
    System.out.println("EL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
        + Jaime.getClass());
    System.out.println(Jaime.getResponsabilidades());
    Empleados Ana = contexto.getBean("EmpleadoDirector", Empleados.class);
    System.out.println("A continuación verás la dirección de memoria de Ana");
    System.out.println(Ana);

    Empleados Manolo = contexto.getBean("EmpleadoDirector", Empleados.class);
    System.out.println("A continuación verás la dirección de memoria de Manolo");
    System.out.println(Manolo);

    if (Ana == Manolo) {
      System.out.println("Es el mismo objeto");
    } else {
      System.out.println("Son distintos");
    }
    System.out.println(Jaime.getDocumento());

    Empleados Juanmi = contexto.getBean("EmpleadoDirector", Empleados.class);
    System.out.println("A continuación verás las llamadas a los métodos por inyección de setter");
    System.out.println(Juanmi.getResponsabilidades());
    System.out.println(Juanmi.getDocumento());

    contexto.close();
  }

}
