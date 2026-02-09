package Programacao_Orientado_Objetos.Sobrescrita_de_Metodos.Ex_Sobrescrita_de_Metodos;

public class Email extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("--- E-MAIL ENVIADO ---");
        System.out.println("Assunto: Nova Mensagem");
        System.out.println("Corpo: " + mensagem);
        System.out.println("----------------------");
    }
}
