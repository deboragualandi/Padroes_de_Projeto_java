public class ConfigManager {
    private static ConfigManager instancia;
    private String configuracao;
    private Documento prototipoDocumento;

    private ConfigManager() {
        configuracao = "";
    }

    public static ConfigManager getInstancia() {
        if (instancia == null) {
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public Documento getPrototipoDocumento() {
        return prototipoDocumento;
    }

    public void setPrototipoDocumento(Documento prototipoDocumento) {
        this.prototipoDocumento = prototipoDocumento;
    }

}