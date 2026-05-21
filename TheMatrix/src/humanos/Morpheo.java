package humanos;

import javax.swing.JTextArea;

public class Morpheo extends Human {

    public Morpheo(String name, boolean esLevantado) {
        super(name, esLevantado);
    }

    public void levantar(Human human, JTextArea consola) {
        consola.append(name + " ha despertado al elegido\n");
        human.esLevantado = true;
    }
}