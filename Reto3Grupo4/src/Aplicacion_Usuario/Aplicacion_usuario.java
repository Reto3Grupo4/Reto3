package Aplicacion_Usuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class Aplicacion_usuario extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cl;
	private JPanel Ventana_Login;
	private JPanel Ventana_Registro;
	private JPanel Ventana_Menu;
	private JTextField txtUsuario;
	private JPasswordField pf_Clave;
	private JTextField txtNombre;
	private JTextField txtUsuario_2;
	private JTextField txtApellidos;
	private JPasswordField pfClave_2;
	private JPasswordField pfConfirmar;
	private JTextField txtFecNac;
	private JTextField txtFecRegistro;
	private JTextField txtPremium;
	private JButton btnRegistrar;
	private JButton btnLogin;
	private JButton btnAtras;
	private JButton btnGuardar;
	

	private String usuarioRegistrado;
	private String claveRegistrada;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion_usuario frame = new Aplicacion_usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aplicacion_usuario() {
		setTitle("Aplicacion Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		cl = new CardLayout();
		contentPane.setLayout(cl);
		setContentPane(contentPane);
		
		Ventana_Login = new JPanel();
		Ventana_Login.setLayout(null);
		Ventana_Login.setBorder(new TitledBorder(null, "Ventana Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(Ventana_Login, "login");
		
		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(88, 91, 46, 14);
		Ventana_Login.add(lblUsuario_1);
		
		JLabel lblClave_1 = new JLabel("Clave:");
		lblClave_1.setBounds(88, 123, 46, 14);
		Ventana_Login.add(lblClave_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(156, 88, 86, 20);
		Ventana_Login.add(txtUsuario);
		
		pf_Clave = new JPasswordField();
		pf_Clave.setBounds(156, 120, 85, 20);
		Ventana_Login.add(pf_Clave);
		
		JList list_1 = new JList();
		list_1.setBounds(187, 136, 1, 1);
		Ventana_Login.add(list_1);
		
		JComboBox cbVerificar_1 = new JComboBox();
		cbVerificar_1.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Empleado", "Administrador"}));
		cbVerificar_1.setToolTipText("");
		cbVerificar_1.setBounds(156, 163, 86, 22);
		Ventana_Login.add(cbVerificar_1);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(71, 215, 89, 23);
		Ventana_Login.add(btnLogin);
		
		btnRegistrar = new JButton("Registrate");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(234, 215, 89, 23);
		Ventana_Login.add(btnRegistrar);
		
		Ventana_Registro = new JPanel();
		Ventana_Registro.setBorder(new TitledBorder(null, "Ventana Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(Ventana_Registro, "registro");
		Ventana_Registro.setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(this);
		btnAtras.setBounds(10, 25, 89, 23);
		Ventana_Registro.add(btnAtras);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(65, 85, 46, 14);
		Ventana_Registro.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(121, 82, 86, 20);
		Ventana_Registro.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtUsuario_2 = new JTextField();
		txtUsuario_2.setColumns(10);
		txtUsuario_2.setBounds(121, 115, 197, 20);
		Ventana_Registro.add(txtUsuario_2);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(217, 85, 46, 14);
		Ventana_Registro.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(273, 82, 86, 20);
		Ventana_Registro.add(txtApellidos);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(65, 118, 46, 14);
		Ventana_Registro.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(65, 149, 46, 14);
		Ventana_Registro.add(lblClave);
		
		pfClave_2 = new JPasswordField();
		pfClave_2.setBounds(121, 146, 197, 20);
		Ventana_Registro.add(pfClave_2);
		
		JLabel lblConfirmar = new JLabel("Confirmar:");
		lblConfirmar.setBounds(48, 180, 63, 14);
		Ventana_Registro.add(lblConfirmar);
		
		pfConfirmar = new JPasswordField();
		pfConfirmar.setBounds(121, 177, 197, 20);
		Ventana_Registro.add(pfConfirmar);
		
		JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");
		lblFechaNac.setBounds(22, 211, 89, 14);
		Ventana_Registro.add(lblFechaNac);
		
		txtFecNac = new JTextField();
		txtFecNac.setBounds(121, 208, 197, 20);
		Ventana_Registro.add(txtFecNac);
		txtFecNac.setColumns(10);
		
		JLabel lblFecRegistro = new JLabel("Fecha Registro:");
		lblFecRegistro.setBounds(32, 245, 79, 14);
		Ventana_Registro.add(lblFecRegistro);
		
		txtFecRegistro = new JTextField();
		txtFecRegistro.setBounds(121, 239, 197, 20);
		Ventana_Registro.add(txtFecRegistro);
		txtFecRegistro.setColumns(10);
		
		JLabel lblPremium = new JLabel("Premium mega:");
		lblPremium.setBounds(32, 276, 79, 14);
		Ventana_Registro.add(lblPremium);
		
		txtPremium = new JTextField();
		txtPremium.setBounds(121, 270, 197, 20);
		Ventana_Registro.add(txtPremium);
		txtPremium.setColumns(10);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(65, 312, 46, 14);
		Ventana_Registro.add(lblIdioma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Euskara"}));
		comboBox.setBounds(121, 308, 110, 22);
		Ventana_Registro.add(comboBox);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(32, 374, 89, 23);
		Ventana_Registro.add(btnGuardar);
		
		JButton btnComprarPremium = new JButton("Comprar Premium");
		btnComprarPremium.setBounds(196, 374, 122, 23);
		Ventana_Registro.add(btnComprarPremium);
		
		Ventana_Menu = new JPanel();
		Ventana_Menu.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ventana Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(Ventana_Menu, "menu");
		Ventana_Menu.setLayout(null);
		
		JButton btnAtras_2 = new JButton("Atras");
		btnAtras_2.setBounds(10, 24, 89, 23);
		Ventana_Menu.add(btnAtras_2);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(301, 24, 89, 23);
		Ventana_Menu.add(btnPerfil);
		
		JLabel lblEscoger = new JLabel("ESCOGE");
		lblEscoger.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEscoger.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscoger.setBounds(167, 28, 57, 14);
		Ventana_Menu.add(lblEscoger);
		
		JButton btnDescubrirMusica = new JButton("Descubrir musica");
		btnDescubrirMusica.setBounds(130, 88, 126, 23);
		Ventana_Menu.add(btnDescubrirMusica);
		
		JButton btnDescubrirPodcast = new JButton("Descubrir podcast");
		btnDescubrirPodcast.setBounds(130, 122, 126, 23);
		Ventana_Menu.add(btnDescubrirPodcast);
		
		JButton btnMisPlaylist = new JButton("Mis Playlist");
		btnMisPlaylist.setBounds(130, 156, 126, 23);
		Ventana_Menu.add(btnMisPlaylist);
		
		JPanel Ventana_Artistas = new JPanel();
		contentPane.add(Ventana_Artistas, "artistas");
		Ventana_Artistas.setLayout(null);
		
		JButton btnAtras_3 = new JButton("Atras");
		btnAtras_3.setBounds(10, 11, 89, 23);
		Ventana_Artistas.add(btnAtras_3);
		
		JButton btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setBounds(314, 11, 89, 23);
		Ventana_Artistas.add(btnPerfil_1);
		
		JLabel lblListaArtistas = new JLabel("Lista de artistas");
		lblListaArtistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaArtistas.setBounds(142, 25, 118, 14);
		Ventana_Artistas.add(lblListaArtistas);
		
		JTextArea txtAreaListaArtistas = new JTextArea();
		txtAreaListaArtistas.setBounds(71, 61, 255, 193);
		Ventana_Artistas.add(txtAreaListaArtistas);
		
		JPanel Ventana_Artista = new JPanel();
		contentPane.add(Ventana_Artista, "artista");
		Ventana_Artista.setLayout(null);
		
		JButton btnAtras_3_1 = new JButton("Atras");
		btnAtras_3_1.setBounds(10, 11, 89, 23);
		Ventana_Artista.add(btnAtras_3_1);
		
		JButton btnPerfil_2 = new JButton("Perfil");
		btnPerfil_2.setBounds(325, 11, 89, 23);
		Ventana_Artista.add(btnPerfil_2);
		
		JPanel pnlListaDisco = new JPanel();
		pnlListaDisco.setBorder(new TitledBorder(null, "Lista Disco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListaDisco.setBounds(10, 55, 227, 464);
		Ventana_Artista.add(pnlListaDisco);
		pnlListaDisco.setLayout(null);
		
		JTextArea txtAreaDiscos = new JTextArea();
		txtAreaDiscos.setBounds(10, 21, 207, 166);
		pnlListaDisco.add(txtAreaDiscos);
		
		JPanel pnlInformacion = new JPanel();
		pnlInformacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlInformacion.setBounds(247, 55, 247, 464);
		Ventana_Artista.add(pnlInformacion);
		pnlInformacion.setLayout(null);
		
		JTextArea txtAreaInformacion = new JTextArea();
		txtAreaInformacion.setBounds(10, 21, 207, 166);
		pnlInformacion.add(txtAreaInformacion);

		cl.show(contentPane, "login");
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		    if (evento.getSource() == btnRegistrar) {
		        cl.show(contentPane, "registro");
		    }

		    if (evento.getSource() == btnAtras) {
		        cl.show(contentPane, "login");
		    }

		    if (evento.getSource() == btnLogin) {
		        String usuario = txtUsuario.getText().trim();
		        String clave = String.valueOf(pf_Clave.getPassword()).trim();

		        if (usuario.isEmpty() || clave.isEmpty()) {
		        	JOptionPane.showMessageDialog(this, "Introduce usuario y contraseña");
		        } else if(usuario.equals(usuarioRegistrado) && clave.equals(claveRegistrada)){
		        	cl.show(contentPane, "menu");
		        }else {
		        	JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
		        }
		    }
		    
		    if(evento.getSource()== btnGuardar) {
		    	String usuario = txtUsuario_2.getText().trim();
		    	String clave = String.valueOf(pfClave_2.getPassword()).trim();
		    	String confirmar = String.valueOf(pfConfirmar.getPassword()).trim();
		    	
		    	if (usuario.isEmpty() || clave.isEmpty()) {
		    	    JOptionPane.showMessageDialog(this, "Rellena los campos");
		    	} else if (!clave.equals(confirmar)) {
		    	    JOptionPane.showMessageDialog(this, "Las claves no coinciden");
		    	} else {
		    	    usuarioRegistrado = usuario;
		    	    claveRegistrada = clave;
		    	    
		    	    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente");

		    	    cl.show(contentPane, "login");
		    }
		}
	}
}
