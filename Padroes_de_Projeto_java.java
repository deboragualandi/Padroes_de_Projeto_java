public class Padroes_de_Projeto_java {
   public static void main(String[] args) {

      // SINGLETON
      ConfigManager config1 = ConfigManager.getInstancia();
      config1.setConfiguracao("Modo Escuro");

      ConfigManager config2 = ConfigManager.getInstancia();
      System.out.println("Configuração atual: " + config2.getConfiguracao());

      System.out.println("É a mesma instância? " + (config1 == config2));
      // ------------------------------------------------------------

      // PROTOTYPE
      Documento original = new Documento("Relatório Final", "Texto completo do relatório", "PDF");
      Documento copia = original.clone();

      copia.titulo = "Relatório Final (Cópia)";

      System.out.println("Documento Original:");
      System.out.println(original);

      System.out.println("\nDocumento Clonado:");
      System.out.println(copia);
      // ---------------------------------------------------
   }

}
