package HPI.SistemaDeComunicacao;

public class Principal {
    static void main(String[] args) {
        Notificacao email = new Email("cliente@exemplo.com", "Promoção especial!", "Aproveite nossos descontos esta semana");
        Notificacao sms = new SMS("(11) 9875-4321", "Sua fatura foi paga com sucesso.");
        Notificacao push = new Push("usuario_app", "Novidade!", "Você tem uma nova mensagem não lida.");

        email.enviar();
        sms.enviar();
        push.enviar();
    }


}
