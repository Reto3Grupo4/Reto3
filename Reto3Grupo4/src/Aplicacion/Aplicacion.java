package Aplicacion;

import java.awt.EventQueue;

/*Imports de la aplicacion*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;

/*Imports para la conexion con la Base de Datos*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ListModel;

public class Aplicacion extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel Aplicacion_usuario;
	private CardLayout cl_aplicacion_usuario;
	private JPanel Ventana_Login;
	private JPanel Ventana_Registro;
	private JPanel Ventana_Menu;
	public JTextField txtUsuario;
	public JPasswordField pf_Clave;
	private JTextField txtNombre;
	public JTextField txtUsuario_2;
	private JTextField txtApellidos;
	public JPasswordField pfClave_2;
	public JPasswordField pfConfirmar;

	private JTextField txtFecNac;
	private JTextField txtFecRegistro;
	private JTextField txtPremium;
	private JButton btnRegistrar;
	private JButton btnLogin;
	private JButton btnAtras;
	private JButton btnAtras_2;
	private JButton btnAtras_3;
	private JButton btnAtras_4;
	private JButton btnAtras_5;
	private JButton btnGuardar;
	private JButton btnDescubrirMusica;
	private JList<String> listaArtistas; 
	private DefaultListModel<String> modeloArtistas;
	
	private JList<String> listaDiscos;
	private DefaultListModel<String> modeloDiscos;



	public String usuarioRegistrado;
	public String claveRegistrada;
	
	public String usuarioARegistrar;
	public String claveARegistrar;
	public String claveAConfirmar;
	
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}
	
	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}
	
	public JPasswordField getPf_Clave() {
		return pf_Clave;
	}
	
	public void setPf_Clave(JPasswordField pf_Clave) {
		this.pf_Clave = pf_Clave;
	}
	
	public JPasswordField getPfConfirmar() {
		return pfConfirmar;
	}
	
	public void setPfConfirmar(JPasswordField pfConfirmar) {
		this.pfConfirmar = pfConfirmar;
	}
	public JTextField getTxtUsuario_2() {
		return txtUsuario_2;
	}

	public void setTxtUsuario_2(JTextField txtUsuario_2) {
		this.txtUsuario_2 = txtUsuario_2;
	}

	public JPasswordField getPfClave_2() {
		return pfClave_2;
	}

	public void setPfClave_2(JPasswordField pfClave_2) {
		this.pfClave_2 = pfClave_2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
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
	public Aplicacion() {
		setTitle("Aplicacion Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 551);
		Aplicacion_usuario = new JPanel();
		Aplicacion_usuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		cl_aplicacion_usuario = new CardLayout();
		Aplicacion_usuario.setLayout(cl_aplicacion_usuario);
		setContentPane(Aplicacion_usuario);
		
		Ventana_Login = new JPanel();
		Ventana_Login.setLayout(null);
		Ventana_Login.setBorder(new TitledBorder(null, "Ventana Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(Ventana_Login, "login");
		
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
		Aplicacion_usuario.add(Ventana_Registro, "registro");
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
		Aplicacion_usuario.add(Ventana_Menu, "menu");
		Ventana_Menu.setLayout(null);
		
		btnAtras_2 = new JButton("Atras");
		btnAtras_2.addActionListener(this);
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
		
		btnDescubrirMusica = new JButton("Descubrir musica");
		btnDescubrirMusica.addActionListener(this);
		btnDescubrirMusica.setBounds(130, 88, 126, 23);
		Ventana_Menu.add(btnDescubrirMusica);
		
		JButton btnDescubrirPodcast = new JButton("Descubrir podcast");
		btnDescubrirPodcast.setBounds(130, 122, 126, 23);
		Ventana_Menu.add(btnDescubrirPodcast);
		
		JButton btnMisPlaylist = new JButton("Mis Playlist");
		btnMisPlaylist.setBounds(130, 156, 126, 23);
		Ventana_Menu.add(btnMisPlaylist);
		
		JPanel Ventana_Artistas = new JPanel();
		Aplicacion_usuario.add(Ventana_Artistas, "artistas");
		Ventana_Artistas.setLayout(null);
		
		btnAtras_3 = new JButton("Atras");
		btnAtras_3.addActionListener(this);
		btnAtras_3.setBounds(10, 11, 89, 23);
		Ventana_Artistas.add(btnAtras_3);
		
		JButton btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setBounds(314, 11, 89, 23);
		Ventana_Artistas.add(btnPerfil_1);
		
		JLabel lblListaArtistas = new JLabel("Lista de artistas");
		lblListaArtistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaArtistas.setBounds(142, 25, 118, 14);
		Ventana_Artistas.add(lblListaArtistas);
		
		modeloArtistas = new DefaultListModel<>();
		listaArtistas = new JList<>(modeloArtistas);
		listaArtistas.addMouseListener(this);
		listaArtistas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JScrollPane scrollLista = new JScrollPane(listaArtistas);
		scrollLista.setBounds(119, 81, 255, 193);
		Ventana_Artistas.add(scrollLista);
		
		JPanel Ventana_Artista = new JPanel();
		Aplicacion_usuario.add(Ventana_Artista, "artista");
		Ventana_Artista.setLayout(null);
		
		btnAtras_4 = new JButton("Atras");
		btnAtras_4.addActionListener(this);
		btnAtras_4.setBounds(10, 11, 89, 23);
		Ventana_Artista.add(btnAtras_4);
		
		JButton btnPerfil_2 = new JButton("Perfil");
		btnPerfil_2.setBounds(325, 11, 89, 23);
		Ventana_Artista.add(btnPerfil_2);
		
		JPanel pnlListaDisco = new JPanel();
		pnlListaDisco.setBorder(new TitledBorder(null, "Lista Disco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListaDisco.setBounds(10, 38, 234, 464);
		Ventana_Artista.add(pnlListaDisco);
		pnlListaDisco.setLayout(null);
		
		modeloDiscos = new DefaultListModel<>();
		listaDiscos = new JList<>(modeloDiscos);
		listaDiscos.addMouseListener(this);
		listaDiscos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JScrollPane scrollListaDiscos = new JScrollPane(listaDiscos);
		scrollListaDiscos.setBounds(10, 21, 214, 169);
		pnlListaDisco.add(scrollListaDiscos);
		
		
		
		
		
		JPanel pnlInformacion = new JPanel();
		pnlInformacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlInformacion.setBounds(247, 38, 247, 464);
		Ventana_Artista.add(pnlInformacion);
		pnlInformacion.setLayout(null);
		
		JTextArea txtAreaInformacion = new JTextArea();
		txtAreaInformacion.setBounds(10, 25, 227, 166);
		pnlInformacion.add(txtAreaInformacion);

		cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		
		JPanel Ventana_Album = new JPanel();
		Aplicacion_usuario.add(Ventana_Album, "name_121079825793600");
		Ventana_Album.setLayout(null);
		
		btnAtras_5 = new JButton("Atras");
		btnAtras_5.addActionListener(this);
		btnAtras_5.setBounds(10, 11, 89, 23);
		Ventana_Album.add(btnAtras_5);
		
		JPanel pnlListaAlbum = new JPanel();
		pnlListaAlbum.setLayout(null);
		pnlListaAlbum.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista Albums", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlListaAlbum.setBounds(0, 38, 227, 464);
		Ventana_Album.add(pnlListaAlbum);
		
		
		JPanel pnlInformacion_1 = new JPanel();
		pnlInformacion_1.setLayout(null);
		pnlInformacion_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion Albums", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlInformacion_1.setBounds(257, 38, 247, 464);
		Ventana_Album.add(pnlInformacion_1);
		
		JTextArea txtAreaInformacion_1 = new JTextArea();
		txtAreaInformacion_1.setBounds(10, 21, 207, 166);
		pnlInformacion_1.add(txtAreaInformacion_1);
		
		
	}
	
	/**
	 * Metodo encargado deverificar que el registro se haga correctamente
	 * @return confirmar variable para confirmar la clave
	 */
	public boolean validarRegistro() {
			boolean validado = false;
			
			String usuario = txtUsuario_2.getText().trim();
			String clave = String.valueOf(pfClave_2.getPassword()).trim();
			String confirmar = String.valueOf(pfConfirmar.getPassword()).trim();
			String nombre = txtNombre.getText().trim();
			String apellido = txtApellidos.getText().trim();
			String fecNac = txtFecNac.getText().trim();
			String fecReg = txtFecRegistro.getText().trim();
			
			if (usuario.isEmpty() || clave.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Rellena los campos");
				validado = false;
			} else if (!clave.equals(confirmar)) {
				JOptionPane.showMessageDialog(this, "Las claves no coinciden");
				validado = false;
			} else {
				
				String consulta = "INSERT INTO Cliente (IDCliente, Nombre, Apellido, Idioma, Usuario, Contraseña, FechaNacimiento, FechaRegistro, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
			try {
				
				Connection con = conexionBD.conexion.getConnection();
				PreparedStatement sentencia = con.prepareStatement(consulta);
				
				
				
				sentencia.setString(1, usuario.length()>5 ? usuario.substring(0,5): usuario);
				sentencia.setString(2, nombre);
				sentencia.setString(3, apellido);
				sentencia.setString(4, "ES");
				sentencia.setString(5, usuario);
				sentencia.setString(6, clave);
				sentencia.setString(7, fecNac);
				sentencia.setString(8, fecReg);
				sentencia.setString(9, "Free");
				
				int ejecucion = sentencia.executeUpdate();
				
				if(ejecucion > 0) {
				usuarioRegistrado = usuario; 
			    claveRegistrada = clave;
					
				JOptionPane.showMessageDialog(this, "Usuario registrado correctamente");
				validado = true;
				cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
				}
			}catch(SQLException error) {
				JOptionPane.showMessageDialog(this, "Error de SQL: " + error.getMessage());
				error.printStackTrace();
			}
		}
		
		return validado;
		
	}
	/**
	 * Metodo encargado de verificar si el usuario y la clave estan registradas
	 * @return clave variable para sacar la clave registrada
	 */
	public boolean validarLogin() {
		boolean validado = false;
		String usuario = txtUsuario.getText().trim();
		String clave = String.valueOf(pf_Clave.getPassword()).trim();
		
	
		if (usuario.isEmpty() || clave.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Introduce usuario y contraseña");
			validado = false;
		} 
		
		String consulta = "select * from Cliente where Usuario = ? and Contraseña = ?";
		
		try {
			Connection con = conexionBD.conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			sentencia.setString(1, usuario);
			sentencia.setString(2, clave);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				JOptionPane.showMessageDialog(this, "¡Bienvenido, " + resultado.getString("Nombre") + "!");
				
				usuarioRegistrado = resultado.getString("Usuario");
				claveRegistrada = resultado.getString("Contraseña");
				
				cl_aplicacion_usuario.show(Aplicacion_usuario, "menu");
				validado = true;
			}
			else {
				JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
				validado = false;
			}
			
			resultado.close();
			sentencia.close();
			
		} catch (SQLException error) {
	        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
	        error.printStackTrace();
	    }
		
		return validado;
	}
	
	private void abrirVentanaArtista(String seleccion) {
		if(seleccion != null) {
			
			String nombreLimpio = seleccion.split(" \\(")[0];

			llamarDiscos(nombreLimpio);
			
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
		}
	}
	
	public void llamarArtistas() {
		modeloArtistas.clear();
		
		String consulta = "select AR.nombreArtistico, sum(A.Nreproducciones) as 'Reproducciones' "
				+ "from Audio A join Artista AR on A.IDArtista = AR.IDArtista "
				+ "join Musico M on AR.IDArtista = M.IDMusico " 
				+ "group by nombreArtistico";
		
		try {
			Connection con = conexionBD.conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				String nombre = resultado.getString("NombreArtistico");
				int reproducciones = resultado.getInt("Reproducciones");
				
				modeloArtistas.addElement(nombre + " (" + reproducciones + " reproducciones)");
			}
			
			resultado.close();
			sentencia.close();
			
		}catch(SQLException error) {
			error.printStackTrace();
		}
	}
	
	public void llamarDiscos(String nombreArtistico) {
		modeloDiscos.clear();
		
		String consulta = "select AL.Titulo, year(AL.Año) as Anio, count(C.IDCancion) as NumCanciones "
				+ "from Album AL left join Artista AR on AL.IDMusico = AR.IDArtista "
				+ "left join Cancion C on AL.IDAlbum = C.IDAlbum "
				+ "where AR.NombreArtistico = ? "
				+ "group by AL.Titulo, AL.Año";
		
		try {
			Connection con = conexionBD.conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			sentencia.setString(1, nombreArtistico);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				String fila = resultado.getString("Titulo") + " - " +
							  resultado.getString("Anio") + " - " +
							  resultado.getString("NumCanciones") + " canciones";
				
				modeloDiscos.addElement(fila);
			}
			
			resultado.close();
			sentencia.close();
		}catch(SQLException error) {
			JOptionPane.showMessageDialog(this, "Error al cargar discos: " + error.getMessage());
			error.printStackTrace();
			
		}
		
		
	}
	
	

	@Override
	public void mouseClicked(MouseEvent evento) {
		
		if(evento.getClickCount() == 2) {
			String artistaSeleccionado = listaArtistas.getSelectedValue();
			abrirVentanaArtista(artistaSeleccionado);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	


/**
 * Metodo dedicado a realizar una accion al pulsar botones
 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource() == btnRegistrar) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "registro");
		}
		
		if (evento.getSource() == btnAtras) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		}
		
		if (evento.getSource() == btnAtras_2) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		}
		
		if (evento.getSource() == btnAtras_3) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "menu");
		}
		
		if (evento.getSource() == btnAtras_4) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artistas");
		}
		
		if (evento.getSource() == btnAtras_5) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
		}
		
		
		if (evento.getSource() == btnLogin) {
			validarLogin();
		}
		
		if(evento.getSource()== btnGuardar) {
			validarRegistro();
		}
		
		if(evento.getSource() == btnDescubrirMusica) {
			llamarArtistas();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artistas");
		}
		
	}	
}