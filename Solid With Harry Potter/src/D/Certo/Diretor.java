package D.Certo;

//✅ Certo: Interface Mensageiro para escolher entre coruja ou Patrono.
// Agora o diretor pode escolher o tipo de mensageiro. Flexibilidade digna de Hogwarts!

class Diretor {
    Mensageiro mensageiro;

    Diretor(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    void enviarMensagem(String mensagem) {
        mensageiro.enviar(mensagem);
    }
}
