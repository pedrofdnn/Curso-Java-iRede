package Programacao_Orientado_Objetos.Sobrescrita_de_Metodos.Ex_Sobrescrita_de_Metodos;

public class MainNotificacao {

    public static void main(String[] args) {

        // Criando os objetos
        Notificacao n1 = new Email();
        Notificacao n2 = new WhatsApp();
        Notificacao n3 = new Notificacao(); // Versão padrão

        System.out.println("Testando as Sobrescritas:\n");

        n1.enviar("Sua fatura chegou.");      // Executa a versão do e-mail
        n2.enviar("Oi, tudo bem?");          // Executa a versão do WhatsApp
        n3.enviar("Alerta de sistema.");     // Executa a versão da Superclasse
    }

}
