import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon Ally[] = {new Pinsir("1",1),new Eevee("1",1),new Jolteon("1",1)};
        Pokemon Foe[] = {new Azurill("1",1),new Marill("1",1),new Azumarill("1",1)};

        if (Ally.length > 0 && Foe.length > 0) {
            for (Pokemon i : Ally) {
                b.addAlly(i);
            }
            for (Pokemon i : Foe) {
                b.addFoe(i);
            }
            b.go();
        } else {
            System.out.println("Недостаточно покемонов для начала битвы!");
        }

        //b.addAlly(new Pinsir("1",1));
        //b.addAlly(new Eevee("1",1));
        //b.addAlly(new Jolteon("1",1));
        //b.addFoe(new Azurill("1",1));
        //b.addFoe(new Marill("1",1));
        //b.addFoe(new Azumarill("1",1));
        //b.go();

    }
}