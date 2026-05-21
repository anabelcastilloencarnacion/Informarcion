package humanos;

import javax.swing.JTextArea;

public class Neo extends Human implements UnaEleccion {

    public Neo(String name, boolean esLevantado) {
        super(name, esLevantado);
    }

    public void seSacrifica(JTextArea consola) {
        consola.append(name + " se sacrifica por la Matrix\n");
    }

    @Override
    public void desbloqueaPoder(JTextArea consola) {
        consola.append(name + " desbloquea todo el poder y manipula la matrix\n");
    }
}