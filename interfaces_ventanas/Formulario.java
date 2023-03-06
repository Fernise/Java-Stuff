package interfaces_ventanas;
import javax.swing.*;
import java.awt.event.*;
import java.text.Normalizer;

public class Formulario extends JFrame implements ActionListener {
    private JTextField text_field_uno;
    private JLabel label_uno;
    private JButton boton_uno;
    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label_uno = new JLabel("Mensaje");
        label_uno.setBounds(15, 10, 100, 30);
        add(label_uno);

        text_field_uno = new JTextField();
        text_field_uno.setBounds(80, 16, 190, 20);
        add(text_field_uno);

        boton_uno = new JButton("Mostrar");
        boton_uno.setBounds(10, 60, 100, 30);
        add(boton_uno);
        boton_uno.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton_uno) {
            String cadena = text_field_uno.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setBounds(0, 0, 300, 150);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }

}
