package I.Errado;

//❌ Errado: Forçando Dobby a voar.
//Dobby tentando voar? Péssima ideia, coitado do elfo!

public class Dobby implements Bruxo{
    public void conjurarFeitico() { }
    public void voarVassoura() {
        throw new UnsupportedOperationException("Elfo não voa!");
    }
}
