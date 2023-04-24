package com.spring.spring;

public class Documento implements GestionDocumentos{


    @Override
    public String getDocumento() {
        return "Presentación del Documenbto";
    }
    private GestionDocumentos documentoNuevo;

}
