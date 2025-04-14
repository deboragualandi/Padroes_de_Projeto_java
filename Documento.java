public class Documento implements Cloneable {

    public String titulo;
    private String conteudo;
    private String formato;

    public Documento(String titulo, String conteudo, String formato) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.formato = formato;
    }

    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Conteúdo: " + conteudo + ", Formato: " + formato;
    }

}
