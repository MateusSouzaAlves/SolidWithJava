package O.Certo;

// ✅ Certo: Interface aberta para novas classes, sem alterar a lógica principal.
// Agora podemos adicionar novas criaturas sem alterar o feitiço! Muito mais mágico e flexível.

public class FeiticoDeDefesa {
    void usar(Criatura criatura) {
        criatura.defender();
    }
}
