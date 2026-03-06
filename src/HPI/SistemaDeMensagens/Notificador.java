package HPI.SistemaDeMensagens;

public class Notificador {

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem (String contato, String mensagem) {
        System.out.println("Mensagem para " + contato + ": " + mensagem);
    }

    public void enviarMensagem (String contato, String mensagem, int contador) {
        for (int i = 0; i < contador; i++) {
            System.out.println("Mensagem para " + contato + ": " + mensagem);
        }
    }
}
