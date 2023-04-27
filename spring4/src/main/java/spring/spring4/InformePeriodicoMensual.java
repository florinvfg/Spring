package spring.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.spring4.crearDocumentos.CrearDocumentos;
public class InformePeriodicoMensual implements CrearDocumentos {

    
    @Override
    public String getDocumento() {
        return "Informe Periodico Anual";
    }


}
