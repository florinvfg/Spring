package com.spring.spring;

public class EmpleadoDirector implements Empleados {
    private String emailDepartamental;
    private String empresa;
    private GestionDocumentos documentoNuevo;

    @Override
    public String getResponsabilidades() {
        return "Responsabilidades EMPLEADO DIRECTOR: xxxxxxxxxxxxxxxxxxxxxx";
    }

    public String getEmailDepartamental() {
        return emailDepartamental;
    }

    public void setEmailDepartamental(String email) {
        this.emailDepartamental = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getDocumento() {
        return "DOCUMENTO DIRECTOR: xxxxxxxxxxxxxxxxxxxxx";
    }

    public EmpleadoDirector() {
    }

    public EmpleadoDirector(String emailDepartamental, String empresa) {
        this.emailDepartamental = emailDepartamental;
        this.empresa = empresa;
    }
    public EmpleadoDirector(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

    public GestionDocumentos getDocumentoNuevo() {
        return documentoNuevo;
    }

    public void setDocumentoNuevo(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }


}
