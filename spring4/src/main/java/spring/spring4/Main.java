//¿Como podria  solucionar el siguiente problema en el siguiente ´codigo?
//Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'EmpleadoStuff' available

package spring.spring4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ComponentScan 
@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
    // Cargar Archivo Sprinx XML. En el parentesis debe ir el nombre exacto de
    // nuestro archivo de configuraciión XML
    AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfigurationFile.class);

    // Creamos 2 objetos mediante el beans al XML de Spring
    Empleados Jaime = contexto.getBean("empleadoDirector", Empleados.class);
    System.out.println("EL Siguiente mensaje son las responsabilidades de un Empleado construido con Spring de tipo "
        + Jaime.getClass());
    System.out.println(Jaime.getResponsabilidades());
    Empleados Ana = contexto.getBean("empleadoDirector", Empleados.class);
    System.out.println("A continuación verás la dirección de memoria de Ana");
    System.out.println(Ana);

    Empleados Manolo = contexto.getBean("empleadoDirector", Empleados.class);
    System.out.println("A continuación verás la dirección de memoria de Manolo");
    System.out.println(Manolo);

    if (Ana == Manolo) {
      System.out.println("Es el mismo objeto");
    } else {
      System.out.println("Son distintos");
    }
    System.out.println(Jaime.getDocumento());

    Empleados Juanmi = contexto.getBean("empleadoDirector", Empleados.class);
    System.out.println("A continuación verás las llamadas a los métodos por inyección de setter");
    System.out.println(Juanmi.getResponsabilidades());
    System.out.println(Juanmi.getDocumento());


// Construimos un bean del contenedor
Empleados Maria = contexto.getBean("empleadoDirector", Empleados.class);


// usamos el bean
System.out.println(Maria.getDocumento());
System.out.println(Maria.getResponsabilidades());
// Indicamos la ruta del contexto XML

//EmpleadoStuff Juan2 = contexto.getBean("EmpleadoStuff", EmpleadoStuff.class);
//System.out.println("8.10 Email de Juan2 invocado con etiqueta @Value: "+Juan2.getEmail());
//System.out.println("8.10 Empresa de Juan2 invocado con etiqueta @Value: "+Juan2.getNombreEmpresa());

    contexto.close();
  }

}
