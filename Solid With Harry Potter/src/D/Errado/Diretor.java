package D.Errado;

//❌ Errado: Diretor preso ao Correio de Hogwarts.
//E se o correio de Hogwarts entrar em greve? O diretor estaria perdido!

public class Diretor {
    CorreioDeHogwarts correio = new CorreioDeHogwarts();

    void enviarMensagem(String mensagem) {
        correio.enviarCarta(mensagem);
    }
}
