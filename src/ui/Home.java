// src/ui/MainScreen.java
package ui;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
        setTitle("Tela Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar o layout do frame
        setLayout(new BorderLayout());

        // Carregar a imagem
        ImageIcon imageIcon = new ImageIcon("src/assets/welcome.png");

        // Criar um JLabel com a imagem
        JLabel imageLabel = new JLabel(imageIcon);

        // Adicionar o JLabel ao frame na parte superior (NORTH)
        add(imageLabel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        // Criar a tela principal
        Home home = new Home();

        // Tornar a tela visível
        home.setVisible(true);
    }
}
