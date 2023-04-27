package spring.spring3;

import spring.spring3.crearDocumentos.CrearDocumentos;
public class InformePeriodicoAnual implements CrearDocumentos {




    @Override
    public String getDocumento() {
        return "Informe Periodico Anual";
        

        
    }
}