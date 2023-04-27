package spring.spring4;

import spring.spring4.crearDocumentos.CrearDocumentos;
public class InformePeriodicoAnual implements CrearDocumentos {




    @Override
    public String getDocumento() {
        return "Informe Periodico Anual";
        

        
    }
}