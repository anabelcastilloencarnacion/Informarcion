package humanos;

import javax.swing.JTextArea;

public abstract class Human {

    public String name;
    protected boolean esLevantado;

    public Human(String name, boolean esLevantado) {
        this.name = name;
        this.esLevantado = esLevantado;
    }

    public void speak(JTextArea consola, String mensaje) {
        consola.append(name + ": " + mensaje + "\n");
    }
}