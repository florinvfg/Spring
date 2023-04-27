package spring.spring4;

public class Documento implements GestionDocumentos{
    private GestionDocumentos documentoNuevo;

    @Override
    public String getDocumento() {
        return "Presentación del Documenbto";
    }


}
