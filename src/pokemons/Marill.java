package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Marill extends Azurill {
    public Marill(String S,int i){
        super(S,i);
        setStats(70,20,50,20,50,40);
        setType(Type.WATER,Type.FAIRY);
        addMove(new Present());
    }
}
