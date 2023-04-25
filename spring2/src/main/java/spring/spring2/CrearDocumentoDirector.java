package spring.spring2;



public interface CrearDocumentoDirector {

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object arg0);

    void finalize() throws Throwable;

    @Override
    int hashCode();

    @Override
    String toString();

}
