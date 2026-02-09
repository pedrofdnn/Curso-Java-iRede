package Programacao_Orientado_Objetos.Sobrescrita_de_Metodos.Ex_Sobrescrita_de_Metodos;

public class WhatsApp extends Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[WhatsApp] Enviando mensagem: " + mensagem + " ✅✅");
    }
}
