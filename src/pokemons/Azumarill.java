package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Azumarill extends Marill {
    public Azumarill(String S,int i){
        super(S,i);
        setStats(100,50,80,60,80,50);
        addMove(new AquaRing());
    }
}
