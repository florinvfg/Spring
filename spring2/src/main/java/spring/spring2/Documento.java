package spring.spring2;

public class Documento implements GestionDocumentos{
    private GestionDocumentos documentoNuevo;

    @Override
    public String getDocumento() {
        return "Presentación del Documenbto";
    }


}
