package thematrix;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class PanelLluvia extends JPanel implements Runnable {

    private final char[] caracter = "01".toCharArray();
    private final int fontSize = 18;
    private final int columns;
    private final int[] yposition;
    private final Random random = new Random();

    public PanelLluvia(int ancho, int alto) {

        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        setOpaque(false);

        // 🔥 Evita división por 0
        columns = Math.max(1, ancho / fontSize);
        yposition = new int[columns];

        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Monospaced", Font.BOLD, fontSize));

        for (int i = 0; i < columns; i++) {

            char c = caracter[random.nextInt(caracter.length)];

            int x = i * fontSize;
            int y = yposition[i] * fontSize;

            g.drawString(String.valueOf(c), x, y);

            if (y > getHeight() && random.nextInt(100) > 98) {
                yposition[i] = 0;
            } else {
                yposition[i]++;
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}