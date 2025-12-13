package EjerFicheros;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class GestionMensajes extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<String> mensajes;

    public GestionMensajes() {
        super("Gestión de Mensajes");
        mensajes = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 260);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ===== PANEL CENTRAL (4 botones) =====
        JPanel panelCentral = new JPanel(new GridLayout(2, 2, 15, 15));

        JButton btnCargar = new JButton("Cargar Mensaj...");
        JButton btnGuardar = new JButton("Guardar Mensajes");
        JButton btnAnadir = new JButton("Añadir Mensa...");
        JButton btnImprimir = new JButton("Imprimir Mens...");

        panelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        panelCentral.add(btnCargar);
        panelCentral.add(btnGuardar);
        panelCentral.add(btnAnadir);
        panelCentral.add(btnImprimir);

        // ===== PANEL INFERIOR (Salir) =====
        JPanel panelInferior = new JPanel();
        JButton btnSalir = new JButton("Salir");
        panelInferior.add(btnSalir);

        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // ===== ACCIONES =====
        btnCargar.addActionListener(e -> cargarMensajes());
        btnGuardar.addActionListener(e -> guardarMensajes());
        btnAnadir.addActionListener(e -> anadirMensaje());
        btnImprimir.addActionListener(e -> imprimirMensajes());
        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    // ===== MÉTODOS =====

    private void cargarMensajes() {
        mensajes.clear();
        File archivo = new File("Mensajes.txt");

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this,
                    "No existe el archivo Mensajes.txt");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                mensajes.add(linea);
            }
            JOptionPane.showMessageDialog(this,
                    "Se han cargado " + mensajes.size() + " mensajes.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error al leer el archivo.");
        }
    }

    private void guardarMensajes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Mensajes.txt"))) {
            for (String m : mensajes) {
                bw.write(m);
                bw.newLine();
            }
            JOptionPane.showMessageDialog(this,
                    "Los mensajes han sido guardados correctamente.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error al guardar los mensajes.");
        }
    }

    private void anadirMensaje() {
        String mensaje = JOptionPane.showInputDialog(this,
                "Introduce el mensaje:");

        if (mensaje != null && !mensaje.trim().isEmpty()) {
            mensajes.add(mensaje.trim());
        }
    }

    private void imprimirMensajes() {
        if (mensajes.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No hay mensajes para mostrar.");
            return;
        }

        StringBuilder texto = new StringBuilder();
        for (String m : mensajes) {
            texto.append(m).append("\n");
        }

        JOptionPane.showMessageDialog(this,
                texto.toString(),
                "Listado de mensajes",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GestionMensajes::new);
    }
}
