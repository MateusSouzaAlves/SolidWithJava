package L.Errado;

/* ❌ Errado: Hermione com método que ela não deve ter.
    Hermione no Quadribol? Isso quebra o código e o bom senso!
 */

class Hermione extends AlunoDeHogwarts {
    void jogarQuadribol() {
        throw new UnsupportedOperationException("Hermione não joga Quadribol!");
    }
}
