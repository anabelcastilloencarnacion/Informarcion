package thematrix;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import agentes.Smith;
import humanos.Human;
import humanos.Morpheo;
import humanos.Neo;

public class matrixF extends JFrame {

    private JTextArea consola;
    private JButton correBTN;
    private Human neo;
    private Human morpheo;
    private Smith smith;

    public matrixF() {

        setTitle("Matrix Simulador");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        consola = new JTextArea();
        consola.setBackground(Color.BLACK);
        consola.setForeground(Color.GREEN);
        consola.setFont(new Font("Monospaced", Font.PLAIN, 16));
        consola.setEditable(false);

        correBTN = new JButton("EMPEZAR SIMULACION");
        correBTN.addActionListener(e -> correrSimulacion());

        add(new JScrollPane(consola), BorderLayout.CENTER);
        add(correBTN, BorderLayout.SOUTH);

        iniciarSimulacion();

        // 🔥 FIX: tamaño fijo para evitar error
        PanelLluvia panelll = new PanelLluvia(500, 500);
        setGlassPane(panelll);
        panelll.setVisible(true);

        setVisible(true);
    }

    void iniciarSimulacion() {
        neo = new Neo("Thomas Anderson", false);
        morpheo = new Morpheo("Morpheus", true);
        smith = new Smith("Smith");

        print("Bienvenido a la Matrix");
    }

    void correrSimulacion() {
        print("----CORRIENDO SIMULACION----");

        morpheo.speak(consola, "te mostrare el camino....");
        ((Morpheo) morpheo).levantar(neo, consola);

        neo.speak(consola, "Ahora puedo creer....");

        ((Neo) neo).desbloqueaPoder(consola);
        smith.interceptar(neo, consola);
        ((Neo) neo).seSacrifica(consola);

        print("La matrix se reinicia");
    }

    void print(String mensaje) {
        consola.append(mensaje + "\n");
    }
}