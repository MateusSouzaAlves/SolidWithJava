package O.Errado;

/*❌ Errado: Precisa alterar o código toda vez que surge uma nova criatura.
    Cada criatura nova exige que o código seja alterado! Isso não é mágico, é um pesadelo!
 */

import O.Certo.Dementador;
import O.Certo.Trasgo;

public class FeiticoDeDefesa {

    void usar(Object criatura) {
        if (criatura instanceof Dementador) {
            System.out.println("Expecto Patronum!");
        } else if (criatura instanceof Trasgo) {
            System.out.println("Stupefy!");
        }
    }

}
