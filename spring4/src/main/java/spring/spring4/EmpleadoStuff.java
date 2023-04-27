package spring.spring4;

import org.springframework.beans.factory.annotation.Value;

public class EmpleadoStuff {
    @Value("${email}")
    private String email;
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;




    private Object informePersonalizadoStuff() {
        return "INFORME PERSONALIZADO STUFF FLORIN";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public EmpleadoStuff(Object informePersonalizadoStuff) {
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

}
