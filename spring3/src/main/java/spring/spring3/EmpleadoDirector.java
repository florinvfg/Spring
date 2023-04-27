package spring.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class EmpleadoDirector implements Empleados {

    @Qualifier("InformePeriodioMensual")
    private crearDocumentos documentoDirector;

    private Documento documentoNuevo;
    private String emailDepartamental;
    private String empresa;


  

    public String getResponsabilidades() {
        return "Dirije los departamentos y objetivos de la empresa";
    }



    @Override
    public String getDocumento() {
        return "Documento Generado por el Director";
    }


    public void setDocumentoNuevo(Documento documento) {
        this.documentoNuevo = documento;
    }



    public Documento getDocumentoNuevo() {
        return documentoNuevo;
    }

    
    public String getEmailDepartamental() {
        return emailDepartamental;
    }


    public void setEmailDepartamental(String emailDepartamental) {
        this.emailDepartamental = emailDepartamental;
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public EmpleadoDirector() {
    }

    @PostConstruct
    public void metodoPostConstruct() {
        System.out.println("Ejecutando el método PostConstruct. Ejecuta tareas justo cuando se construye el bean, antes de que el bean esté disponible. Por ejemplo para activar servicios antes de que el bean esté listo.");
    }

    @PreDestroy
    public void metodoPreDestroy() {
        System.out.println("Ejecutando el método PreDestroy. Ejecuta tareas después de que el bean haya sido utilizado y destruido. Por ejemplo para liberar recursos, cerrar conexiones, etc.");
    }

}
