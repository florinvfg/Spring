package spring.spring2;

import spring.spring2.crearDocumentos.CrearDocumentos;
public class InformePeriodicoAnual implements CrearDocumentos {




    @Override
    public String getDocumento() {
        return "Informe Periodico Anual";
    }
}