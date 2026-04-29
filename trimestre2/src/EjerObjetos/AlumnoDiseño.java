package EjerObjetos;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AlumnoDiseño extends JFrame {

    private static final long serialVersionUID = 1L;

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    private JTextField txtNombre, txtSexo, txtEdad, txtAltura, txtPeso, txtBuscar;
    private JButton btnAgregar, btnProcesar, btnMostrarTodos, btnBuscar;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JTextArea txtResultado;

    public AlumnoDiseño() {
        setTitle("Gestión de Alumnos");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        // Campos de entrada
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        panel.add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 120, 25);
        panel.add(txtNombre);

        JLabel lblSexo = new JLabel("Sexo (H/M):");
        lblSexo.setBounds(250, 20, 80, 25);
        panel.add(lblSexo);
        txtSexo = new JTextField();
        txtSexo.setBounds(330, 20, 50, 25);
        panel.add(txtSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(400, 20, 50, 25);
        panel.add(lblEdad);
        txtEdad = new JTextField();
        txtEdad.setBounds(450, 20, 50, 25);
        panel.add(txtEdad);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(520, 20, 50, 25);
        panel.add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setBounds(570, 20, 50, 25);
        panel.add(txtAltura);

        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(20, 60, 50, 25);
        panel.add(lblPeso);
        txtPeso = new JTextField();
        txtPeso.setBounds(70, 60, 50, 25);
        panel.add(txtPeso);

        // Botones
        btnAgregar = new JButton("Agregar Alumno");
        btnAgregar.setBounds(150, 60, 150, 25);
        panel.add(btnAgregar);

        btnProcesar = new JButton("Procesar Datos");
        btnProcesar.setBounds(320, 60, 150, 25);
        panel.add(btnProcesar);

        btnMostrarTodos = new JButton("Mostrar Todos");
        btnMostrarTodos.setBounds(500, 60, 150, 25);
        panel.add(btnMostrarTodos);

        JLabel lblBuscar = new JLabel("Buscar por nombre:");
        lblBuscar.setBounds(20, 100, 150, 25);
        panel.add(lblBuscar);
        txtBuscar = new JTextField();
        txtBuscar.setBounds(160, 100, 120, 25);
        panel.add(txtBuscar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(300, 100, 100, 25);
        panel.add(btnBuscar);

        // Tabla para mostrar alumnos
        tabla = new JTable();
        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Sexo", "Edad", "Altura", "Peso"}, 0);
        tabla.setModel(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tabla);
        scrollTabla.setBounds(20, 140, 630, 200);
        panel.add(scrollTabla);

        // Área de resultados
        txtResultado = new JTextArea();
        txtResultado.setBounds(20, 350, 630, 100);
        txtResultado.setEditable(false);
        panel.add(txtResultado);

        // Eventos
        btnAgregar.addActionListener(e -> agregarAlumno());
        btnMostrarTodos.addActionListener(e -> mostrarTodos());
        btnProcesar.addActionListener(e -> procesarDatos());
        btnBuscar.addActionListener(e -> buscarAlumno());

        setVisible(true);
    }

    private void agregarAlumno() {
        try {
            String nombre = txtNombre.getText();
            char sexo = txtSexo.getText().charAt(0);
            int edad = Integer.parseInt(txtEdad.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double peso = Double.parseDouble(txtPeso.getText());

            Alumno a = new Alumno(nombre, sexo, edad, altura, peso);
            alumnos.add(a);

            txtResultado.setText("Alumno agregado: " + nombre);

            txtNombre.setText(""); txtSexo.setText(""); txtEdad.setText("");
            txtAltura.setText(""); txtPeso.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos. Revise los campos.");
        }
    }

    private void mostrarTodos() {
        modeloTabla.setRowCount(0); // limpiar tabla
        for (Alumno a : alumnos) {
            modeloTabla.addRow(new Object[]{a.getNombre(), a.getSexo(), a.getEdad(), a.getAltura(), a.getPeso()});
        }
    }

    private void procesarDatos() {
        int sumaEdadHombres = 0, contHombres = 0, contAltura = 0;
        for (Alumno a : alumnos) {
            if (a.getSexo().equalsIgnoreCase("Hombre")) {
                sumaEdadHombres += a.getEdad();
                contHombres++;
            }
            if (a.getAltura() > 1.65) contAltura++;
        }
        double promedioEdad = (contHombres > 0) ? (double) sumaEdadHombres / contHombres : 0;
        txtResultado.setText("Promedio edad hombres: " + promedioEdad + "\nAlumnos con altura > 1.65: " + contAltura);
    }

    private void buscarAlumno() {
        String nombreBuscado = txtBuscar.getText();
        boolean encontrado = false;
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                txtResultado.setText(a.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) txtResultado.setText("Alumno no encontrado.");
    }

    public static void main(String[] args) {
        new AlumnoDiseño();
    }
}