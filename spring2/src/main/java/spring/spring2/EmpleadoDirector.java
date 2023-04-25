package spring.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoDirector implements Empleados {
    private CrearDocumentoDirector documentoDirector;
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

    
   
    public EmpleadoDirector(CrearDocumentoDirector documentoDirector) {
        this.documentoDirector = documentoDirector;
    }


    public CrearDocumentoDirector getDocumentoDirector() {
        return documentoDirector;
    }


    public void setDocumentoDirector(CrearDocumentoDirector documentoDirector) {
        this.documentoDirector = documentoDirector;
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


}
