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
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;


import POJOS.Cancion;
import POJOS.Cliente;
import POJOS.Podcast;
import conexionBD.conexion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextArea;

/*Imports para la conexion con la Base de Datos*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;


public class Aplicacion extends JFrame implements ActionListener, MouseListener{
	
	private static final long serialVersionUID = 1L;
	private CardLayout cl_aplicacion_usuario;
	private JPanel Aplicacion_usuario;
	private JPanel panelLogin;
	private JPanel panelRegistro;
	private JPanel panelMenu;
	private JPanel panelArtistas;
	private JPanel panelArtista;
	private JPanel pnlListaDisco; 
	private JPanel pnlInformacion;
	private JPanel panelAlbum; 
	private JPanel pnlListaCanciones;
	private JPanel panelInformacionAlbums;
	private JPanel panelReproduccion;
	private JPanel panelPlaylists;
	private JPanel panelPodcasters;
	private JPanel panelPodcasts;
	private JPanel panelAdministracion;
	private JPanel panelMenuEstadisticas;
	private JPanel panelEstadisticas;
	private JPanel panelTablaEstadisticas;
	private JPanel panelAdministrarMusica;
	private JPanel panelModificarMusica;
	public JTextField txtUsuario;
	public JPasswordField pf_Clave;
	private JTextField txtNombreRegistro;
	public JTextField txtUsuario_2;
	private JTextField txtApellidos;
	public JPasswordField pfClave_2;
	public JPasswordField pfConfirmar;
	private JTextArea txtAreaInformacion;
	private JTextArea txtAreaInfoAlbum;
	private JLabel lblFotoReproduccion;
	private JLabel lblInfoAudioReproducido;
	private JLabel lblFotoArtista;
	private JLabel lblFotoAlbum;
	private JLabel lblUsuarioLogin;
	private JLabel lblClaveLogin;
	private JLabel lblNombreRegistro;
	private JLabel lblApellidosRegistro;
	private JLabel lblUsuarioRegistro;
	private JLabel lblClaveRegistro;
	private JLabel lblConfirmarRegistro;
	private JLabel lblFechaNacRegistro; 
	private JLabel lblFecRegistro_PRegistro;
	private JLabel lblPremiumRegistro;
	private JLabel lblIdiomaRegistro;
	private JLabel lblEscoger;
	private JLabel lblListaArtistas;
	private JLabel lblPodcasters;
	private JLabel lblIDCliente;
	private JLabel lblApellidoPerfil;
	private JLabel lblUsuarioPerfil;
	private JLabel lblAdministracion;
	private JTextField txtFecNac;
	private JTextField txtFecRegistro;
	private JButton btnComprarPremiumRegistro;
	private JButton btnRegistrar;
	private JButton btnLogin;
	private JButton btnAtrasRegistro;
	private JButton btnAtrasMenu;
	private JButton btnAtrasArtistas;
	private JButton btnAtrasArtista;
	private JButton btnAtrasAlbums;
	private JButton btnAtrasReproduccion;
	private JButton btnAtrasPlaylists;
	private JButton btnAtrasPodcasters;
	private JButton btnAtrasPodcasts;
	private JButton btnAtrasPerfil;
	private JButton btnGuardar;
	private JButton btnDescubrirMusica;
	private JButton btnDescubrirPodcast;
	private JButton btnCrearPlaylist;
	private JButton btnBorrarPlaylist;
	private JButton btnImportar;
	private JButton btnExportar;
	private JButton btnMisPlaylists;
	private JButton btnMenu;
	private JButton btnCancionAnterior;
	private JButton btnSiguienteCancion;
	private JButton btnIniciar;
	private JButton btnFavorito;
	private JButton btnPerfilMenu;
	private JButton btnPerfilArtistas;
	private JButton btnPerfilPlaylists;
	private JButton btnPerfilPodcasters;
	private JButton btnPerfilPodcasts;
	private JButton btnPerfilArtista;
	private JButton btnPerfilReproduccion;
	private JButton btnGuardarPerfil;
	private JButton btnCerrarPerfil;
	private JButton btnAtrasAdministracion;
	private JButton btnGestionarMusica;
	private JButton btnGestionarPodcast;
	private JButton btnEstadisticas;
	private JButton btnPerfilAdministrarMusica;
	private JButton btnPerfilAñadirMusica;
	private JButton btnAtrasAdministarAñadirMusica;
	
	private JScrollPane scrollListaArtistas;
	private JScrollPane scrollListaDiscos; 
	private JScrollPane scrollListaAlbums;
	private JScrollPane scrollPlaylists;
	private JScrollPane scrollListaPodcasters; 
	private JScrollPane scrollListaPodcasts;
	private JCheckBox chckbxPremiumRegistro;
	private JComboBox cBIdioma;
	private JComboBox cbVerificar;
	
	private JList<String> listaArtistas; 
	private DefaultListModel<String> modeloArtistas;
	
	private JList<String> listaDiscos;
	private DefaultListModel<String> modeloDiscos;

	private JList<String> listaCanciones;
	private DefaultListModel<String> modeloCanciones;
	
	private JList<String> listaPlaylist;
	private DefaultListModel<String> modeloPlaylist;
	
	private JList<String> listaPodcasters;
	private DefaultListModel<String> modeloPodcasters;

	private JList<String> listaPodcasts;
	private DefaultListModel<String> modeloPodcasts;
	
	public String usuarioRegistrado;
	public String claveRegistrada;
	
	private String panelAnterior;
	
	private String audioReproduciendo = "";
	private String tipoEstadistica = "";
	
	public String usuarioARegistrar;
	public String claveARegistrar;
	public String claveAConfirmar;
	private JLabel lblListaDePodcasters;
	private JPanel panelPerfil;
	private Cliente clienteLogueado;
	private JLabel lblNombrePerfil;
	private JTextField txtNombrePerfil;
	private JTextField txtIDCliente;
	private JTextField txtApellidoPerfil;
	private JTextField txtUsuarioPerfil;
	private JButton btnEditarPerfil;
	private JButton btnPerfilAlbums;
	
	private ArrayList<Podcast> cargarPodcasts = new ArrayList<Podcast>();
	private ArrayList<Cancion> cargarCanciones = new ArrayList<Cancion>();
	private JTable tablaEstadisticas;
	private JButton btnAtrasMenuEstadisticas;
	private JLabel lblMenuEstadisticas;
	private JButton btnTopCanciones;
	private JButton btnTopPodcast;
	private JButton btnTopReproducciones;
	private JButton btnTopPlaylist;
	private JButton btnAtrasEstadisticas;
	private JButton btnSemanas;
	private JButton btnMeses;
	private JButton btnAnos;
	private JPanel panelAdministrarAñadirMusica;
	private JTextField txtNombreAdministrarAñadirMusica;
	private JTextField txtDuracionAdministrarAñadirCancion;
	private JTextField txtArchivoAdministrarAñadirCancion;
	private JButton btnAtrasAdministrarMusica;
	private JButton btnAñadirMusica;
	private JButton btnEliminarMusica;
	private JButton btnModificarMusica;
	private JButton btnConfirmarAñadirMusica;
	private JPanel panelEliminarMusica;
	private JLabel lblNombreEliminarMusica;
	private JButton btnAtrasEliminarMusica;
	private JButton btnPerfilEliminarMusica;
	private JTextField txtNombreEliminarMusica;
	private JButton btnConfirmarEliminarMusica;
	private JButton btnAtrasModificarMusica;
	private JButton btnPerfilModificarMusica;
	private JTextField txtNombreModificarMusica;
	private JTextField txtDuracionModificarCancion;
	private JTextField txtArchivoModificarCancion;
	private JButton btnConfirmarModificarMusica;
	private JLabel lblNReproduccionesModificar;
	private JTextField txtNReproduccionesModificar;
	private JTextField txtIDAudioModificarCancion;
	private JLabel lblIDAudioModificar;
	private JLabel lblBusquedaModificar;
	
	
	
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

	
	public void configurarVentana() {
	
		setTitle("Aplicacion Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 576);
		Aplicacion_usuario = new JPanel();
		Aplicacion_usuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		cl_aplicacion_usuario = new CardLayout();
		Aplicacion_usuario.setLayout(cl_aplicacion_usuario);
		setContentPane(Aplicacion_usuario);
		
	}
	
	public void crearPanelLogin(){
		
		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBorder(new TitledBorder(null, "Ventana Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(panelLogin, "login");
		
		lblUsuarioLogin = new JLabel("Usuario:");
		lblUsuarioLogin.setBounds(181, 52, 46, 14);
		panelLogin.add(lblUsuarioLogin);
		
		lblClaveLogin = new JLabel("Clave:");
		lblClaveLogin.setBounds(181, 83, 46, 14);
		panelLogin.add(lblClaveLogin);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(236, 49, 86, 20);
		panelLogin.add(txtUsuario);
		
		pf_Clave = new JPasswordField();
		pf_Clave.setBounds(237, 80, 85, 20);
		panelLogin.add(pf_Clave);
		
		cbVerificar = new JComboBox();
		cbVerificar.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Empleado", "Administrador"}));
		cbVerificar.setToolTipText("");
		cbVerificar.setBounds(236, 111, 86, 22);
		panelLogin.add(cbVerificar);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(133, 169, 89, 23);
		panelLogin.add(btnLogin);
		
		btnRegistrar = new JButton("Registrate");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(347, 169, 89, 23);
		panelLogin.add(btnRegistrar);
		
	}
	
	public void crearPanelRegistro() {
		
		panelRegistro = new JPanel();
		panelRegistro.setBorder(new TitledBorder(null, "Ventana Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(panelRegistro, "registro");
		panelRegistro.setLayout(null);
		
		btnAtrasRegistro = new JButton("Atras");
		btnAtrasRegistro.addActionListener(this);
		btnAtrasRegistro.setBounds(10, 25, 89, 23);
		panelRegistro.add(btnAtrasRegistro);
		
		lblNombreRegistro = new JLabel("Nombre:");
		lblNombreRegistro.setBounds(65, 85, 46, 14);
		panelRegistro.add(lblNombreRegistro);
		
		txtNombreRegistro = new JTextField();
		txtNombreRegistro.setBounds(121, 82, 86, 20);
		panelRegistro.add(txtNombreRegistro);
		txtNombreRegistro.setColumns(10);
		
		txtUsuario_2 = new JTextField();
		txtUsuario_2.setColumns(10);
		txtUsuario_2.setBounds(121, 115, 197, 20);
		panelRegistro.add(txtUsuario_2);
		
		lblApellidosRegistro = new JLabel("Apellidos:");
		lblApellidosRegistro.setBounds(217, 85, 46, 14);
		panelRegistro.add(lblApellidosRegistro);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(273, 82, 86, 20);
		panelRegistro.add(txtApellidos);
		
		lblUsuarioRegistro = new JLabel("Usuario:");
		lblUsuarioRegistro.setBounds(65, 118, 46, 14);
		panelRegistro.add(lblUsuarioRegistro);
		
		lblClaveRegistro = new JLabel("Clave:");
		lblClaveRegistro.setBounds(65, 149, 46, 14);
		panelRegistro.add(lblClaveRegistro);
		
		pfClave_2 = new JPasswordField();
		pfClave_2.setBounds(121, 146, 197, 20);
		panelRegistro.add(pfClave_2);
		
		lblConfirmarRegistro = new JLabel("Confirmar:");
		lblConfirmarRegistro.setBounds(48, 180, 63, 14);
		panelRegistro.add(lblConfirmarRegistro);
		
		pfConfirmar = new JPasswordField();
		pfConfirmar.setBounds(121, 177, 197, 20);
		panelRegistro.add(pfConfirmar);
		
		lblFechaNacRegistro = new JLabel("Fecha Nacimiento:");
		lblFechaNacRegistro.setBounds(22, 211, 89, 14);
		panelRegistro.add(lblFechaNacRegistro);
		
		txtFecNac = new JTextField();
		txtFecNac.setBounds(121, 208, 197, 20);
		panelRegistro.add(txtFecNac);
		txtFecNac.setColumns(10);
		
		lblFecRegistro_PRegistro = new JLabel("Fecha Registro:");
		lblFecRegistro_PRegistro.setBounds(32, 245, 79, 14);
		panelRegistro.add(lblFecRegistro_PRegistro);
		
		txtFecRegistro = new JTextField();
		txtFecRegistro.setBounds(121, 239, 197, 20);
		panelRegistro.add(txtFecRegistro);
		txtFecRegistro.setColumns(10);
		
		lblPremiumRegistro = new JLabel("Quieres Premium?");
		lblPremiumRegistro.setBounds(22, 275, 89, 14);
		panelRegistro.add(lblPremiumRegistro);
		
		lblIdiomaRegistro = new JLabel("Idioma:");
		lblIdiomaRegistro.setBounds(65, 312, 46, 14);
		panelRegistro.add(lblIdiomaRegistro);
		
		cBIdioma = new JComboBox();
		cBIdioma.setModel(new DefaultComboBoxModel(new String[] {"ES", "EU", "EN", "FR", "DE", "CA", "GA", "AR"}));
		cBIdioma.setBounds(121, 308, 46, 22);
		panelRegistro.add(cBIdioma);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(32, 374, 89, 23);
		panelRegistro.add(btnGuardar);
		
		btnComprarPremiumRegistro = new JButton("Comprar Premium");
		btnComprarPremiumRegistro.setBounds(196, 374, 122, 23);
		panelRegistro.add(btnComprarPremiumRegistro);
		
		chckbxPremiumRegistro = new JCheckBox("");
		chckbxPremiumRegistro.setBounds(121, 275, 21, 23);
		panelRegistro.add(chckbxPremiumRegistro);
	}
	
	public void crearPanelMenu() {
		panelMenu = new JPanel();
		panelMenu.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ventana Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Aplicacion_usuario.add(panelMenu, "menu");
		panelMenu.setLayout(null);
		
		btnAtrasMenu = new JButton("Atras");
		btnAtrasMenu.addActionListener(this);
		btnAtrasMenu.setBounds(10, 24, 89, 23);
		panelMenu.add(btnAtrasMenu);
		
		btnPerfilMenu = new JButton();
		btnPerfilMenu.addActionListener(this);
		btnPerfilMenu.setBounds(505, 24, 89, 23);
		panelMenu.add(btnPerfilMenu);
		
		lblEscoger = new JLabel("ESCOGE");
		lblEscoger.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEscoger.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscoger.setBounds(277, 26, 57, 14);
		panelMenu.add(lblEscoger);
		
		btnDescubrirMusica = new JButton("Descubrir musica");
		btnDescubrirMusica.addActionListener(this);
		btnDescubrirMusica.setBounds(230, 76, 126, 23);
		panelMenu.add(btnDescubrirMusica);
		
		btnDescubrirPodcast = new JButton("Descubrir podcast");
		btnDescubrirPodcast.addActionListener(this);
		btnDescubrirPodcast.setBounds(230, 110, 126, 23);
		panelMenu.add(btnDescubrirPodcast);
		
		btnMisPlaylists = new JButton("Mis Playlist");
		btnMisPlaylists.addActionListener(this);
		btnMisPlaylists.setBounds(230, 144, 126, 23);
		panelMenu.add(btnMisPlaylists);
	}
	
	public void crearPanelArtistas() {
		
		panelArtistas = new JPanel();
		Aplicacion_usuario.add(panelArtistas, "artistas");
		panelArtistas.setLayout(null);
		
		btnAtrasArtistas = new JButton("Atras");
		btnAtrasArtistas.addActionListener(this);
		btnAtrasArtistas.setBounds(10, 11, 89, 23);
		panelArtistas.add(btnAtrasArtistas);
		
		btnPerfilArtistas = new JButton("");
		btnPerfilArtistas.addActionListener(this);
		btnPerfilArtistas.setBounds(525, 11, 89, 23);
		panelArtistas.add(btnPerfilArtistas);
		
		lblListaArtistas = new JLabel("Lista de artistas");
		lblListaArtistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaArtistas.setBounds(256, 20, 118, 14);
		panelArtistas.add(lblListaArtistas);
		
		modeloArtistas = new DefaultListModel<>();
		listaArtistas = new JList<>(modeloArtistas);
		scrollListaArtistas = new JScrollPane(listaArtistas);
		scrollListaArtistas.setBounds(190, 118, 265, 193);
		panelArtistas.add(scrollListaArtistas);
		
		listaArtistas.setBounds(190, 118, 253, 191);
		listaArtistas.addMouseListener(this);
		listaArtistas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
	}
	
	public void crearPanelArtista() {
	
		panelArtista = new JPanel();
		Aplicacion_usuario.add(panelArtista, "artista");
		panelArtista.setLayout(null);
		
		btnAtrasArtista = new JButton("Atras");
		btnAtrasArtista.addActionListener(this);
		btnAtrasArtista.setBounds(10, 11, 89, 23);
		panelArtista.add(btnAtrasArtista);
		
		btnPerfilArtista = new JButton("Perfil");
		btnPerfilArtista.addActionListener(this);
		btnPerfilArtista.setBounds(325, 11, 89, 23);
		panelArtista.add(btnPerfilArtista);
		
		pnlListaDisco = new JPanel();
		pnlListaDisco.setBorder(new TitledBorder(null, "Lista Disco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListaDisco.setBounds(10, 55, 315, 464);
		panelArtista.add(pnlListaDisco);
		pnlListaDisco.setLayout(null);
		
		pnlInformacion = new JPanel();
		pnlInformacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlInformacion.setBounds(335, 55, 289, 464);
		panelArtista.add(pnlInformacion);
		pnlInformacion.setLayout(null);
		
		
		modeloDiscos = new DefaultListModel<>();
		listaDiscos = new JList<>(modeloDiscos);
		listaDiscos.addMouseListener(this);
		listaDiscos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		scrollListaDiscos = new JScrollPane(listaDiscos);
		scrollListaDiscos.setBounds(10, 21, 269, 169);
		pnlListaDisco.add(scrollListaDiscos);
		
		txtAreaInformacion = new JTextArea();
		txtAreaInformacion.setBounds(26, 25, 240, 166);
		pnlInformacion.add(txtAreaInformacion);
		
		lblFotoArtista = new JLabel("imagen");
		lblFotoArtista.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoArtista.setBounds(10, 198, 253, 251);
		pnlInformacion.add(lblFotoArtista);
		
	}
	public void crearPanelAlbums() {
		panelAlbum = new JPanel();
		Aplicacion_usuario.add(panelAlbum, "album");
		panelAlbum.setLayout(null);
		
		btnAtrasAlbums = new JButton("Atras");
		btnAtrasAlbums.addActionListener(this);
		btnAtrasAlbums.setBounds(10, 11, 89, 23);
		panelAlbum.add(btnAtrasAlbums);
		
		pnlListaCanciones = new JPanel();
		pnlListaCanciones.setLayout(null);
		pnlListaCanciones.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista Canciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlListaCanciones.setBounds(0, 38, 299, 464);
		panelAlbum.add(pnlListaCanciones);
		
		modeloCanciones = new DefaultListModel<>();
		listaCanciones = new JList<>(modeloCanciones);
		listaCanciones.addMouseListener(this);
		listaCanciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		scrollListaAlbums = new JScrollPane(listaCanciones);
		scrollListaAlbums.setBounds(10, 21, 258, 169);
		pnlListaCanciones.add(scrollListaAlbums);
		
		
		panelInformacionAlbums = new JPanel();
		panelInformacionAlbums.setLayout(null);
		panelInformacionAlbums.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion Albums", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelInformacionAlbums.setBounds(309, 38, 305, 464);
		panelAlbum.add(panelInformacionAlbums);
		
		txtAreaInfoAlbum = new JTextArea();
		txtAreaInfoAlbum.setEditable(false);
		txtAreaInfoAlbum.setBounds(10, 21, 268, 166);
		panelInformacionAlbums.add(txtAreaInfoAlbum);
		
		lblFotoAlbum = new JLabel("Imagen");
		lblFotoAlbum.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoAlbum.setBounds(20, 198, 258, 242);
		panelInformacionAlbums.add(lblFotoAlbum);
		
		btnPerfilAlbums = new JButton("Perfil");
		btnPerfilAlbums.addActionListener(this);
		btnPerfilAlbums.setBounds(525, 11, 89, 23);
		panelAlbum.add(btnPerfilAlbums);
	}
	public void crearPanelReproduccion() {
		
		panelReproduccion = new JPanel();
		Aplicacion_usuario.add(panelReproduccion, "reproduccion");
		panelReproduccion.setLayout(null);
		
		lblFotoReproduccion = new JLabel("Imagen del Album");
		lblFotoReproduccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoReproduccion.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblFotoReproduccion.setBounds(185, 50, 250, 250);
		panelReproduccion.add(lblFotoReproduccion);
		
		btnAtrasReproduccion = new JButton("Atras");
		btnAtrasReproduccion.addActionListener(this);
		btnAtrasReproduccion.setBounds(10, 11, 89, 23);
		panelReproduccion.add(btnAtrasReproduccion);
		
		btnPerfilReproduccion = new JButton("Perfil");
		btnPerfilReproduccion.setBounds(525, 11, 89, 23);
		btnPerfilReproduccion.addActionListener(this);
		panelReproduccion.add(btnPerfilReproduccion);
		
		btnMenu = new JButton("Menu");
		btnMenu.addActionListener(this);
		btnMenu.setBounds(129, 329, 89, 23);
		panelReproduccion.add(btnMenu);
		
		btnCancionAnterior = new JButton("<");
		btnCancionAnterior.addActionListener(this);
		btnCancionAnterior.setBounds(228, 329, 41, 23);
		panelReproduccion.add(btnCancionAnterior);
		
		btnIniciar = new JButton("Play");
		btnIniciar.addActionListener(this);
		btnIniciar.setBounds(282, 329, 66, 23);
		panelReproduccion.add(btnIniciar);
		
		btnSiguienteCancion = new JButton(">");
		btnSiguienteCancion.addActionListener(this);
		btnSiguienteCancion.setBounds(362, 329, 41, 23);
		panelReproduccion.add(btnSiguienteCancion);
		
		btnFavorito = new JButton("Favorito");
		btnFavorito.addActionListener(this);
		btnFavorito.setBounds(413, 329, 89, 23);
		panelReproduccion.add(btnFavorito);
		
		lblInfoAudioReproducido = new JLabel("Informacion de la cancion");
		lblInfoAudioReproducido.setVerticalAlignment(SwingConstants.TOP);
		lblInfoAudioReproducido.setBounds(52, 405, 525, 86);
		panelReproduccion.add(lblInfoAudioReproducido);
	}
	
	public void crearPanelPlaylist() {
		panelPlaylists = new JPanel();
		Aplicacion_usuario.add(panelPlaylists, "playlists");
		panelPlaylists.setLayout(null);
		
		btnAtrasPlaylists = new JButton("Atras");
		btnAtrasPlaylists.addActionListener(this);
		btnAtrasPlaylists.setBounds(10, 11, 89, 23);
		panelPlaylists.add(btnAtrasPlaylists);
		
		modeloPlaylist = new DefaultListModel<>();
		listaPlaylist = new JList<>(modeloPlaylist);
		scrollPlaylists = new JScrollPane(listaPlaylist);
		scrollPlaylists.setBounds(10, 50, 250, 350);
		panelPlaylists.add(scrollPlaylists);
		
		btnPerfilPlaylists = new JButton("Perfil");
		btnPerfilPlaylists.setBounds(397, 11, 79, 23);
		btnPerfilPlaylists.addActionListener(this);
		panelPlaylists.add(btnPerfilPlaylists);
		
		btnCrearPlaylist = new JButton("Crear nueva");
		btnCrearPlaylist.setBounds(318, 153, 158, 37);
		btnCrearPlaylist.addActionListener(this);
		panelPlaylists.add(btnCrearPlaylist);
		
		btnBorrarPlaylist = new JButton("Borrar");
		btnBorrarPlaylist.setBounds(318, 201, 158, 37);
		btnBorrarPlaylist.addActionListener(this);
		panelPlaylists.add(btnBorrarPlaylist);
		
		btnImportar = new JButton("Importar");
		btnImportar.setBounds(318, 249, 158, 37);
		btnImportar.addActionListener(this);
		panelPlaylists.add(btnImportar);
		
		btnExportar = new JButton("Exportar");
		btnExportar.setBounds(318, 297, 158, 37);
		btnExportar.addActionListener(this);
		panelPlaylists.add(btnExportar);
	}
	
	public void crearPanelPodcasters() {
		
		panelPodcasters = new JPanel();
		panelPodcasters.setBorder(new TitledBorder(null, "Descubrir Podcasts", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(panelPodcasters, "podcasters");
		panelPodcasters.setLayout(null);
		
		btnAtrasPodcasters = new JButton("Atras");
		btnAtrasPodcasters.addActionListener(this);
		btnAtrasPodcasters.setBounds(10, 34, 89, 23);
		panelPodcasters.add(btnAtrasPodcasters);
		
		btnPerfilPodcasters = new JButton("Perfil");
		btnPerfilPodcasters.addActionListener(this);
		btnPerfilPodcasters.setBounds(415, 34, 79, 23);
		panelPodcasters.add(btnPerfilPodcasters);
		
		modeloPodcasters = new DefaultListModel<String>();
		listaPodcasters = new JList<>(modeloPodcasters);
		listaPodcasters.addMouseListener(this);
		scrollListaPodcasters = new JScrollPane(listaPodcasters);
		scrollListaPodcasters.setBounds(89, 107, 338, 250);
		panelPodcasters.add(scrollListaPodcasters);
		
		scrollListaPodcasters.setViewportView(listaPodcasters);
		
		lblPodcasters = new JLabel("Lista de Podcasters disponibles");
		lblPodcasters.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasters.setBounds(147, 82, 200, 14);
		panelPodcasters.add(lblPodcasters);
	}
	
	public void crearPanelPodcasts() {
		panelPodcasts = new JPanel();
		Aplicacion_usuario.add(panelPodcasts, "podcasts");
		panelPodcasts.setLayout(null);
		
		btnAtrasPodcasts = new JButton("Atras");
		btnAtrasPodcasts.addActionListener(this);
		btnAtrasPodcasts.setBounds(10, 36, 89, 23);
		panelPodcasts.add(btnAtrasPodcasts);
		
		btnPerfilPodcasts = new JButton("Perfil");
		btnPerfilPodcasts.setBounds(535, 36, 79, 23);
		btnPerfilPodcasts.addActionListener(this);
		panelPodcasts.add(btnPerfilPodcasts);
		
		lblListaDePodcasters = new JLabel("Lista de Podcasts disponibles");
		lblListaDePodcasters.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDePodcasters.setBounds(230, 72, 200, 14);
		panelPodcasts.add(lblListaDePodcasters);
		
		modeloPodcasts = new DefaultListModel<String>();
		listaPodcasts = new JList<>(modeloPodcasts);
		listaPodcasts.addMouseListener(this);
		listaPodcasts.setBounds(121, 116, 256, 297);
		
		scrollListaPodcasts = new JScrollPane(listaPodcasts);
		scrollListaPodcasts.setBounds(121, 116, 425, 297);
		panelPodcasts.add(scrollListaPodcasts);
	}
	
	public void crearPanelPerfil() {
		panelPerfil = new JPanel();
		Aplicacion_usuario.add(panelPerfil, "perfil");
		panelPerfil.setLayout(null);
		
		lblNombrePerfil = new JLabel("Nombre:");
		lblNombrePerfil.setBounds(151, 107, 47, 14);
		panelPerfil.add(lblNombrePerfil);
		
		txtNombrePerfil = new JTextField();
		txtNombrePerfil.setBounds(208, 104, 86, 20);
		panelPerfil.add(txtNombrePerfil);
		txtNombrePerfil.setColumns(10);
		
		lblIDCliente = new JLabel("ID:");
		lblIDCliente.setBounds(171, 75, 27, 14);
		panelPerfil.add(lblIDCliente);
		
		txtIDCliente = new JTextField();
		txtIDCliente.setColumns(10);
		txtIDCliente.setBounds(208, 72, 86, 20);
		panelPerfil.add(txtIDCliente);
		
		lblApellidoPerfil = new JLabel("Apellido:");
		lblApellidoPerfil.setBounds(151, 138, 47, 14);
		panelPerfil.add(lblApellidoPerfil);
		
		txtApellidoPerfil = new JTextField();
		txtApellidoPerfil.setColumns(10);
		txtApellidoPerfil.setBounds(208, 135, 86, 20);
		panelPerfil.add(txtApellidoPerfil);
		
		txtUsuarioPerfil = new JTextField();
		txtUsuarioPerfil.setColumns(10);
		txtUsuarioPerfil.setBounds(208, 166, 86, 20);
		panelPerfil.add(txtUsuarioPerfil);
		
		lblUsuarioPerfil = new JLabel("Usuario:");
		lblUsuarioPerfil.setBounds(151, 169, 47, 14);
		panelPerfil.add(lblUsuarioPerfil);
		
		btnGuardarPerfil = new JButton("Guardar Cambios");
		btnGuardarPerfil.addActionListener(this);
		btnGuardarPerfil.setBounds(171, 339, 124, 23);
		btnGuardarPerfil.setVisible(false);
		panelPerfil.add(btnGuardarPerfil);
		
		btnCerrarPerfil = new JButton("Cerrar Sesion");
		btnCerrarPerfil.setBounds(291, 305, 124, 23);
		panelPerfil.add(btnCerrarPerfil);
		
		btnEditarPerfil = new JButton("Editar Perfil");
		btnEditarPerfil.addActionListener(this);
		btnEditarPerfil.setBounds(68, 305, 116, 23);
		panelPerfil.add(btnEditarPerfil);
		
		btnAtrasPerfil = new JButton("Atras");
		btnAtrasPerfil.addActionListener(this);
		btnAtrasPerfil.setBounds(10, 11, 89, 23);
		panelPerfil.add(btnAtrasPerfil);
	}
	
	public void crearPanelAdministracion() {
		panelAdministracion = new JPanel();
		Aplicacion_usuario.add(panelAdministracion, "administracion");
		panelAdministracion.setLayout(null);
		
		btnAtrasAdministracion = new JButton("Atras");
		btnAtrasAdministracion.addActionListener(this);
		btnAtrasAdministracion.setBounds(181, 139, 89, 23);
		panelAdministracion.add(btnAtrasAdministracion);
		
		lblAdministracion = new JLabel("Menu Administracion");
		lblAdministracion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdministracion.setBounds(280, 143, 201, 14);
		panelAdministracion.add(lblAdministracion);
		
		btnGestionarMusica = new JButton("Gestionar Musica");
		btnGestionarMusica.addActionListener(this);
		btnGestionarMusica.setBounds(191, 173, 260, 23);
		panelAdministracion.add(btnGestionarMusica);
		
		btnGestionarPodcast = new JButton("Gestionar Podcast");
		btnGestionarPodcast.setBounds(191, 207, 260, 23);
		panelAdministracion.add(btnGestionarPodcast);
		
		btnEstadisticas = new JButton("Estadisticas");
		btnEstadisticas.addActionListener(this);
		btnEstadisticas.setBounds(191, 241, 260, 23);
		panelAdministracion.add(btnEstadisticas);
	}
	
	public void crearPanelMenuEstadisticas(){
		panelMenuEstadisticas = new JPanel();
		Aplicacion_usuario.add(panelMenuEstadisticas, "menu estadisticas");
		panelMenuEstadisticas.setLayout(null);
		
		btnAtrasMenuEstadisticas = new JButton("Atras");
		btnAtrasMenuEstadisticas.addActionListener(this);
		btnAtrasMenuEstadisticas.setBounds(155, 142, 89, 23);
		panelMenuEstadisticas.add(btnAtrasMenuEstadisticas);
		
		lblMenuEstadisticas = new JLabel("Estadisticas");
		lblMenuEstadisticas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenuEstadisticas.setBounds(249, 144, 132, 21);
		panelMenuEstadisticas.add(lblMenuEstadisticas);
		
		btnTopCanciones = new JButton("Top Canciones Gustados");
		btnTopCanciones.addActionListener(this);
		btnTopCanciones.setBounds(165, 176, 191, 23);
		panelMenuEstadisticas.add(btnTopCanciones);
		
		btnTopPodcast = new JButton("Top Podcast Gustados");
		btnTopPodcast.addActionListener(this);
		btnTopPodcast.setBounds(165, 210, 191, 23);
		panelMenuEstadisticas.add(btnTopPodcast);
		
		btnTopReproducciones = new JButton("Top Reproducciones");
		btnTopReproducciones.addActionListener(this);
		btnTopReproducciones.setBounds(165, 244, 191, 23);
		panelMenuEstadisticas.add(btnTopReproducciones);
		
		btnTopPlaylist = new JButton("Top Playlist");
		btnTopPlaylist.addActionListener(this);
		btnTopPlaylist.setBounds(165, 279, 191, 23);
		panelMenuEstadisticas.add(btnTopPlaylist);
	}
	
	public void crearPanelEstadisticas() {
		panelEstadisticas = new JPanel();
		Aplicacion_usuario.add(panelEstadisticas, "estadisticas");
		panelEstadisticas.setLayout(null);
		
		btnAtrasEstadisticas = new JButton("Atras");
		btnAtrasEstadisticas.addActionListener(this);
		btnAtrasEstadisticas.setBounds(10, 11, 89, 23);
		panelEstadisticas.add(btnAtrasEstadisticas);
		
		btnSemanas = new JButton("Semanas");
		btnSemanas.setBounds(224, 11, 89, 23);
		panelEstadisticas.add(btnSemanas);
		
		btnMeses = new JButton("Meses");
		btnMeses.setBounds(323, 11, 89, 23);
		panelEstadisticas.add(btnMeses);
		
		btnAnos = new JButton("Años");
		btnAnos.setBounds(422, 11, 89, 23);
		panelEstadisticas.add(btnAnos);
		
		panelTablaEstadisticas = new JPanel();
	    panelTablaEstadisticas.setBounds(10, 50, 600, 400);
	    
	    panelTablaEstadisticas.setLayout(new java.awt.BorderLayout()); 
	    panelEstadisticas.add(panelTablaEstadisticas);
	    
	    			
	}
	
	public void crearPanelAdministrarAñadirMusica() {
		panelAdministrarAñadirMusica = new JPanel();
	    Aplicacion_usuario.add(panelAdministrarAñadirMusica, "añadir musica");
	    panelAdministrarAñadirMusica.setLayout(null);
	    
	    btnAtrasAdministarAñadirMusica = new JButton("Atras");
	    btnAtrasAdministarAñadirMusica.addActionListener(this);
	    btnAtrasAdministarAñadirMusica.setBounds(10, 11, 89, 23);   
	    panelAdministrarAñadirMusica.add(btnAtrasAdministarAñadirMusica);
	    
	    btnPerfilAñadirMusica = new JButton("Perfil");
	    btnPerfilAñadirMusica.addActionListener(this);
	    btnPerfilAñadirMusica.setBounds(535, 11, 89, 23);
	    panelAdministrarAñadirMusica.add(btnPerfilAñadirMusica);
	    
	    JLabel lblNombreAdministarAñadirMusica = new JLabel("Nombre de la canción:");
	    lblNombreAdministarAñadirMusica.setBounds(66, 94, 139, 14);
	    panelAdministrarAñadirMusica.add(lblNombreAdministarAñadirMusica);
	    
	    txtNombreAdministrarAñadirMusica = new JTextField();
	    txtNombreAdministrarAñadirMusica.setBounds(199, 91, 233, 20);
	    panelAdministrarAñadirMusica.add(txtNombreAdministrarAñadirMusica);
	    txtNombreAdministrarAñadirMusica.setColumns(10);
	    
	    JLabel lblDuracionAdministrarAñadirCancion = new JLabel("Cuanto dura la canción? (Minutos)");
	    lblDuracionAdministrarAñadirCancion.setBounds(10, 119, 183, 14);
	    panelAdministrarAñadirMusica.add(lblDuracionAdministrarAñadirCancion);
	    
	    txtDuracionAdministrarAñadirCancion = new JTextField();
	    txtDuracionAdministrarAñadirCancion.setBounds(199, 116, 233, 20);
	    panelAdministrarAñadirMusica.add(txtDuracionAdministrarAñadirCancion);
	    txtDuracionAdministrarAñadirCancion.setColumns(10);
	    
	    JLabel lblArchivoAdministrarAñadirCancion = new JLabel("Ruta del archivo:");
	    lblArchivoAdministrarAñadirCancion.setBounds(90, 142, 103, 14);
	    panelAdministrarAñadirMusica.add(lblArchivoAdministrarAñadirCancion);
	    
	    txtArchivoAdministrarAñadirCancion = new JTextField();
	    txtArchivoAdministrarAñadirCancion.setBounds(199, 139, 233, 20);
	    panelAdministrarAñadirMusica.add(txtArchivoAdministrarAñadirCancion);
	    txtArchivoAdministrarAñadirCancion.setColumns(10);    
	    
	    btnConfirmarAñadirMusica = new JButton("Añadir musica");
	    btnConfirmarAñadirMusica.addActionListener(this);
	    btnConfirmarAñadirMusica.setBounds(233, 214, 147, 23);
	    panelAdministrarAñadirMusica.add(btnConfirmarAñadirMusica);
	}
	
	public void crearPanelEliminarMusica() {
		panelEliminarMusica = new JPanel();
	    Aplicacion_usuario.add(panelEliminarMusica, "eliminar musica");
	    panelEliminarMusica.setLayout(null);
	    
	    lblNombreEliminarMusica = new JLabel("Nombre de cancion:");
	    lblNombreEliminarMusica.setBounds(130, 139, 117, 14);
	    panelEliminarMusica.add(lblNombreEliminarMusica);
	    
	    btnAtrasEliminarMusica = new JButton("Atras");
	    btnAtrasEliminarMusica.addActionListener(this);
	    btnAtrasEliminarMusica.setBounds(10, 11, 89, 23);
	    panelEliminarMusica.add(btnAtrasEliminarMusica);
	    
	    btnPerfilEliminarMusica = new JButton("Perfil");
	    btnPerfilEliminarMusica.addActionListener(this);
	    btnPerfilEliminarMusica.setBounds(535, 11, 89, 23);
	    panelEliminarMusica.add(btnPerfilEliminarMusica);
	    
	    txtNombreEliminarMusica = new JTextField();
	    txtNombreEliminarMusica.setBounds(257, 136, 146, 20);
	    panelEliminarMusica.add(txtNombreEliminarMusica);
	    txtNombreEliminarMusica.setColumns(10);
	    
	    btnConfirmarEliminarMusica = new JButton("Eliminar");
	    btnConfirmarEliminarMusica.addActionListener(this);
	    btnConfirmarEliminarMusica.setBounds(241, 204, 89, 23);
	    panelEliminarMusica.add(btnConfirmarEliminarMusica);
	}
	
	public void crearPanelModificarMusica() {
		panelModificarMusica = new JPanel();
	    Aplicacion_usuario.add(panelModificarMusica, "modificar musica");
	    panelModificarMusica.setLayout(null);
	    
	    btnAtrasModificarMusica = new JButton("Atras");
	    btnAtrasModificarMusica.addActionListener(this);
	    btnAtrasModificarMusica.setBounds(10, 11, 89, 23);   
	    panelModificarMusica.add(btnAtrasModificarMusica);
	    
	    btnPerfilModificarMusica = new JButton("Perfil");
	    btnPerfilModificarMusica.addActionListener(this);
	    btnPerfilModificarMusica.setBounds(535, 11, 89, 23);
	    panelModificarMusica.add(btnPerfilModificarMusica);
	    
	    JLabel lblNombreModificarMusica = new JLabel("Nombre de la canción:");
	    lblNombreModificarMusica.setBounds(59, 119, 139, 14);
	    panelModificarMusica.add(lblNombreModificarMusica);
	    
	    txtNombreModificarMusica = new JTextField();
	    txtNombreModificarMusica.setBounds(199, 116, 233, 20);
	    panelModificarMusica.add(txtNombreModificarMusica);
	    txtNombreModificarMusica.setColumns(10);
	    
	    JLabel lblDuracionModificarCancion = new JLabel("Cuanto dura la canción? (Minutos)");
	    lblDuracionModificarCancion.setBounds(10, 142, 183, 14);
	    panelModificarMusica.add(lblDuracionModificarCancion);
	    
	    txtDuracionModificarCancion = new JTextField();
	    txtDuracionModificarCancion.setBounds(199, 139, 233, 20);
	    panelModificarMusica.add(txtDuracionModificarCancion);
	    txtDuracionModificarCancion.setColumns(10);
	    
	    JLabel lblArchivoModificarCancion = new JLabel("Ruta del archivo:");
	    lblArchivoModificarCancion.setBounds(86, 171, 103, 14);
	    panelModificarMusica.add(lblArchivoModificarCancion);
	    
	    txtArchivoModificarCancion = new JTextField();
	    txtArchivoModificarCancion.setBounds(199, 168, 233, 20);
	    panelModificarMusica.add(txtArchivoModificarCancion);
	    txtArchivoModificarCancion.setColumns(10);    
	    
	    btnConfirmarModificarMusica = new JButton("Modificar musica");
	    btnConfirmarModificarMusica.addActionListener(this);
	    btnConfirmarModificarMusica.setBounds(237, 230, 147, 23);
	    panelModificarMusica.add(btnConfirmarModificarMusica);
	    
	    lblNReproduccionesModificar = new JLabel("Nº Reproducciones:");
	    lblNReproduccionesModificar.setBounds(86, 202, 107, 14);
	    panelModificarMusica.add(lblNReproduccionesModificar);
	    
	    txtNReproduccionesModificar = new JTextField();
	    txtNReproduccionesModificar.setColumns(10);
	    txtNReproduccionesModificar.setBounds(199, 199, 233, 20);
	    panelModificarMusica.add(txtNReproduccionesModificar);
	    
	    txtIDAudioModificarCancion = new JTextField();
	    txtIDAudioModificarCancion.setColumns(10);
	    txtIDAudioModificarCancion.setBounds(199, 91, 233, 20);
	    panelModificarMusica.add(txtIDAudioModificarCancion);
	    
	    lblIDAudioModificar = new JLabel("IDAudio:");
	    lblIDAudioModificar.setBounds(119, 94, 107, 14);
	    panelModificarMusica.add(lblIDAudioModificar);
	    
	    lblBusquedaModificar = new JLabel("Busqueda en base a nombre");
	    lblBusquedaModificar.setBounds(251, 66, 139, 14);
	    panelModificarMusica.add(lblBusquedaModificar);
	}
	
	public void crearPanelGestionarMusica() {
		panelAdministrarMusica = new JPanel();
	    Aplicacion_usuario.add(panelAdministrarMusica, "administrar musica");
	    panelAdministrarMusica.setLayout(null);
	    
	    btnAtrasAdministrarMusica = new JButton("Atras");
	    btnAtrasAdministrarMusica.addActionListener(this);
	    btnAtrasAdministrarMusica.setBounds(10, 11, 89, 23);
	    panelAdministrarMusica.add(btnAtrasAdministrarMusica);
	    
	    btnPerfilAdministrarMusica = new JButton("Perfil");
	    btnPerfilAdministrarMusica.addActionListener(this);
	    btnPerfilAdministrarMusica.setBounds(535, 11, 89, 23);
	    panelAdministrarMusica.add(btnPerfilAdministrarMusica);
	    
	    btnAñadirMusica = new JButton("Añadir musica");
	    btnAñadirMusica.addActionListener(this);
	    btnAñadirMusica.setBounds(244, 81, 169, 23);
	    panelAdministrarMusica.add(btnAñadirMusica);
	    
	    btnEliminarMusica = new JButton("Eliminar musica");
	    btnEliminarMusica.addActionListener(this);
	    btnEliminarMusica.setBounds(244, 115, 169, 23);
	    panelAdministrarMusica.add(btnEliminarMusica);
	    
	    btnModificarMusica = new JButton("Modificar musica");
	    btnModificarMusica.addActionListener(this);
	    btnModificarMusica.setBounds(244, 149, 169, 23);
	    panelAdministrarMusica.add(btnModificarMusica);
	    
	    
	}
	public Aplicacion() {		
		configurarVentana();
		crearPanelLogin();
		crearPanelRegistro();
		crearPanelMenu();
		crearPanelArtistas();
		crearPanelArtista();
		crearPanelAlbums();
		crearPanelReproduccion();
		crearPanelPlaylist();
		crearPanelPodcasters();
		crearPanelPodcasts();
		crearPanelPerfil();
		crearPanelAdministracion();
		crearPanelGestionarMusica();
		crearPanelAdministrarAñadirMusica();
		crearPanelEliminarMusica();
		crearPanelModificarMusica();
		crearPanelMenuEstadisticas();
		crearPanelEstadisticas();
	}

	/**
	 * Create the frame.
	 */
	
	/**
	 * Metodo encargado deverificar que el registro se haga correctamente
	 * @return confirmar variable para confirmar la clave
	 */
	public boolean validarRegistro() {
			boolean validado = false;
			
			String usuario = txtUsuario_2.getText().trim();
			String clave = String.valueOf(pfClave_2.getPassword()).trim();
			String confirmar = String.valueOf(pfConfirmar.getPassword()).trim();
			String nombre = txtNombreRegistro.getText().trim();
			String apellido = txtApellidos.getText().trim();
			String fecNac = txtFecNac.getText().trim();
			String fecReg = txtFecRegistro.getText().trim();
			String premium = "";
			String idioma = "";
			idioma = cBIdioma.getSelectedItem().toString();
			
			if(chckbxPremiumRegistro.isSelected()) {
				premium = "Premium";
			}else {
				premium = "Free";
			}
			
			
			
			if (usuario.isEmpty() || clave.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Rellena los campos");
				validado = false;
			} else if (!clave.equals(confirmar)) {
				JOptionPane.showMessageDialog(this, "Las claves no coinciden");
				validado = false;
			} else {
				
				
				String consulta = "INSERT INTO Cliente (Nombre, Apellido, Idioma, Usuario, Contraseña, FechaNacimiento, FechaRegistro, Tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
				
			try {
				
				Connection con = conexion.getConnection();
				PreparedStatement sentencia = con.prepareStatement(consulta);
				
				
				
				sentencia.setString(1, nombre);
				sentencia.setString(2, apellido);
				sentencia.setString(3, idioma);
				sentencia.setString(4, usuario);
				sentencia.setString(5, clave);
				sentencia.setString(6, fecNac);
				sentencia.setString(7, fecReg);
				sentencia.setString(8, premium);
				
				
				
				int ejecucion = sentencia.executeUpdate();
				
				if(ejecucion > 0) {
				usuarioRegistrado = usuario; 
			    claveRegistrada = clave;
					
				JOptionPane.showMessageDialog(this, "Usuario registrado correctamente");
				validado = true;
				cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
				}
				sentencia.close();
				con.close();
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
		
		String consulta = "select * from Cliente where Usuario = ? and Contraseña = SHA2(?, 256)";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			sentencia.setString(1, usuario);
			sentencia.setString(2, clave);
			ResultSet resultado = sentencia.executeQuery();
											   
			
			if(resultado.next()) {
				JOptionPane.showMessageDialog(this, "¡Bienvenido, " + resultado.getString("Nombre") + "!");
				clienteLogueado = new Cliente();
				clienteLogueado.setIdCliente(resultado.getString("IDCliente"));
				clienteLogueado.setNombre(resultado.getString("Nombre"));
				clienteLogueado.setApellido(resultado.getString("Apellido"));
				clienteLogueado.setUsuario(resultado.getString("Usuario"));
				
				usuarioRegistrado = resultado.getString("Usuario");
				claveRegistrada = resultado.getString("Contraseña");
				
				btnPerfilMenu.setText(clienteLogueado.getUsuario());
				btnPerfilArtistas.setText(clienteLogueado.getUsuario());
				btnPerfilArtista.setText(clienteLogueado.getUsuario());
				btnPerfilPlaylists.setText(clienteLogueado.getUsuario());
				btnPerfilPodcasters.setText(clienteLogueado.getUsuario());
				btnPerfilPodcasts.setText(clienteLogueado.getUsuario());
				btnPerfilReproduccion.setText(clienteLogueado.getUsuario());
				btnPerfilAlbums.setText(clienteLogueado.getUsuario());
				btnPerfilAdministrarMusica.setText(clienteLogueado.getUsuario());
				btnPerfilEliminarMusica.setText(clienteLogueado.getUsuario());
				btnPerfilAñadirMusica.setText(clienteLogueado.getUsuario());
				
				validado = true;
			}
			else {
				JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
				validado = false;
			}
			
			resultado.close();
			sentencia.close();
			con.close();
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
			cargarInfoArtista(nombreLimpio);
			cargarImagenArtista(nombreLimpio);
			
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
		}
	}
	
	private void cargarImagenArtista(String nombreArtistico) {
		String consultaSQL = "select Imagen "
				+ "from Artista "
				+ "where NombreArtistico = ?";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, nombreArtistico);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				
				String rutaImagen = resultado.getString("Imagen");
				
				if(rutaImagen.startsWith("/")) {
					rutaImagen = rutaImagen.substring(1);
				}
				
				ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
				
				Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(
						lblFotoArtista.getWidth(), lblFotoArtista.getHeight(), Image.SCALE_SMOOTH);
				
				lblFotoArtista.setIcon(new ImageIcon(imagenRedimensionada));
				lblFotoArtista.setText("");
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
	private void abrirVentanaPodcasts(String seleccion) {
		if (seleccion != null) {
			
			String nombreLimpio = seleccion.split(" \\(")[0];
			
			llamarPodcasts(nombreLimpio);
			cl_aplicacion_usuario.show(Aplicacion_usuario,"podcasts");
		}
	}
	
	private void abrirPanelPerfil() {
		if(clienteLogueado != null) {
			txtIDCliente.setText(clienteLogueado.getIdCliente());
			txtNombrePerfil.setText(clienteLogueado.getNombre());
			txtApellidoPerfil.setText(clienteLogueado.getApellido());
			txtUsuarioPerfil.setText(clienteLogueado.getUsuario());
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "perfil");
		}
	}
	public void llamarArtistas() {
		modeloArtistas.clear();
		
		String consulta = "select AR.NombreArtistico, sum(A.NReproducciones) as 'Reproducciones' "
				+ "from Audio A join Artista AR on A.IDArtista = AR.IDArtista "
				+ "join Musico M on AR.IDArtista = M.IDMusico " 
				+ "group by NombreArtistico";
		
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				String nombre = resultado.getString("NombreArtistico");
				int reproducciones = resultado.getInt("Reproducciones");
				
				modeloArtistas.addElement(nombre + " (" + reproducciones + " reproducciones)");
			}
			
			resultado.close();
			sentencia.close();
			con.close();
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
			Connection con = conexion.getConnection();
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
			con.close();
		}catch(SQLException error) {
			JOptionPane.showMessageDialog(this, "Error al cargar discos: " + error.getMessage());
			error.printStackTrace();
			
		}
		
		
	}
	
	public void cargarInfoArtista(String nombreArtistico) {
		String consultaSQL = "select AR.GeneroPredom, AL.Año, AR.Descripcion "
				+ "from Artista AR join Album AL on AR.IDArtista = AL.IDMusico "
				+ "where AR.NombreArtistico = ?";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, nombreArtistico);
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				txtAreaInformacion.setText("Genero: " + resultado.getString("GeneroPredom") + "\n"
						+ "Año inicio: " + resultado.getString("Año") + "\n"
						+  "Descripcion: \n " + resultado.getString("Descripcion")
						);
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
	}
	
	private void abrirVentanaAlbum(String seleccion) {
		if(seleccion != null) {
			String tituloLimpio = seleccion.split(" - ")[0];
			
			cargarCanciones(tituloLimpio);
			cargarInfoAlbum(tituloLimpio);
			cargarImagenAlbum(tituloLimpio);
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "album");
		}
	}
	
	private void cargarImagenAlbum(String nombreAlbum) {
		String consultaSQL = "select Imagen "
				+ "from Album "
				+ "where Titulo = ?";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, nombreAlbum);
			
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				
				String rutaImagen = resultado.getString("Imagen");
				
				if(rutaImagen.startsWith("/")) {
					rutaImagen = rutaImagen.substring(1);
				}
				
				ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
				
				Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(
						lblFotoAlbum.getWidth(), lblFotoAlbum.getHeight(), Image.SCALE_SMOOTH);
				
				lblFotoAlbum.setIcon(new ImageIcon(imagenRedimensionada));
				lblFotoAlbum.setText("");
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
	
	public void cargarCanciones(String tituloAlbum) {
		modeloCanciones.clear();
		
		String consultaSQL = "select A.Nombre from Audio A join Cancion C "
				+ "on A.IDAudio = C.IDCancion "
				+ "join Album AL on C.IDAlbum = AL.IDAlbum "
				+ "where AL.Titulo = ?";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, tituloAlbum);
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				modeloCanciones.addElement(resultado.getString("Nombre"));
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
	}
	
	public void cargarInfoAlbum(String tituloAlbum) {
		String consultaSQL = "select AL.Titulo, year(AL.Año) as Anio, AL.Genero, "
				+ "(select count(*) from Cancion where IDAlbum = AL.IDAlbum) as TotalCanciones "
				+ "from Album AL where AL.Titulo = ?";
		
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, tituloAlbum);
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				txtAreaInfoAlbum.setText("Titulo: " + resultado.getString("Titulo") + "\n"
						+ "Año de salida: " + resultado.getString("Anio") + "\n"
						+  "Genero: \n " + resultado.getString("Genero")
						);
			}	
			resultado.close();
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
	}
	
	public void llamarPlaylists() {
		modeloPlaylist.clear();
		
		String consultaSQL = "select P.Titulo from Playlist P "
				+ "where IDCliente = (select IDCliente from Cliente where Usuario = ?) ";
		try {
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consultaSQL);
			sentencia.setString(1, usuarioRegistrado);
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				modeloPlaylist.addElement(resultado.getString("Titulo"));
			}
			resultado.close();
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			error.printStackTrace();
			System.out.println(error.getMessage());
		}
	}
	
	public void llamarPodcasters() {
		modeloPodcasters.clear();
		String consulta = "select AR.nombreArtistico, sum(A.NReproducciones) as 'Reproducciones' "
				+ "from Audio A join Artista AR on A.IDArtista = AR.IDArtista "
				+ "join Podcast P on AR.IDArtista = P.IDPodcaster " 
				+ "group by nombreArtistico";
		try {
			Connection conn = conexion.getConnection();
			PreparedStatement sentencia = conn.prepareStatement(consulta);
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				String nombre = resultado.getString("NombreArtistico");
				int reproducciones = resultado.getInt("Reproducciones");
				
				modeloPodcasters.addElement(nombre + " (" + reproducciones + " reproducciones)");
			}
			
			resultado.close();
			sentencia.close();
			conn.close();
		}catch(SQLException error){
			error.getMessage();
		}
		
	}
	public void llamarPodcasts(String nombrePodcaster) {
		modeloPodcasts.clear();
		String consulta =  "select P.NombrePodcast, A.Duracion, P.Colaboradores "
				+ "from Podcast P join Audio A on A.IDAudio = P.IDPodcast "
				+ "join Artista AR on A.IDArtista = AR.IDArtista "
				+ "where AR.NombreArtistico = ? ";
		try {
			Connection conn = conexion.getConnection();
			PreparedStatement sentencia = conn.prepareStatement(consulta);
			sentencia.setString(1, nombrePodcaster);
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				String nombre = resultado.getString("NombrePodcast");
				int duracion = resultado.getInt("Duracion");
				int colaboradores = resultado.getInt("Colaboradores");
				
				modeloPodcasts.addElement(nombre +" (De duracion: " + duracion + " minutos, "
						+ " hay: " + colaboradores + " colaboradores)");
				
			} 
			resultado.close();
			sentencia.close();
			resultado.close();
		}catch(SQLException error) {
			error.getMessage();
		}
	}
	
	public void abrirReproductorCancion(String nombreCancion) {
		audioReproduciendo = "cancion";
		
		if (nombreCancion == null) {
			return;	
		}
		
		String consultaSQL = "select A.Nombre, AL.Titulo, AL.Imagen, A.Duracion "
				+ "from Audio A join Cancion C on A.IDAudio = C.IDCancion "
				+ "join Album AL on C.IDAlbum = AL.IDAlbum "
				+ "where A.Nombre = ?";
		
		try {
			Connection conn = conexion.getConnection();
			PreparedStatement sentencia = conn.prepareStatement(consultaSQL);
			sentencia.setString(1, nombreCancion);
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				String infoCancionSeleccionada = " Cancion: " +resultado.getString("Nombre") + "\n" +
												 " Album: " +resultado.getString("Titulo") + "\n" +
												 " Duracion: " +resultado.getInt("Duracion");
				lblInfoAudioReproducido.setText(infoCancionSeleccionada);
				
				String rutaImagen = resultado.getString("Imagen");
				
				if(rutaImagen.startsWith("/")) {
					rutaImagen = rutaImagen.substring(1);
				}
				
				ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
				
				Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(
						lblFotoReproduccion.getWidth(), lblFotoReproduccion.getHeight(), Image.SCALE_SMOOTH);
				
				lblFotoReproduccion.setIcon(new ImageIcon(imagenRedimensionada));
				lblFotoReproduccion.setText("");
				
				cl_aplicacion_usuario.show(Aplicacion_usuario, "reproduccion");
			}
			resultado.close();
			sentencia.close();
			conn.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
			
	}
	
	public void cargarArrayPodcasts(String nombrePodcast) {
		
		String consultaSQL = " Select P.NombrePodcast, A.Duracion, A.NReproducciones, "
				+ " P.Colaboradores, AR.Imagen, AR.IDArtista, AR.NombreArtistico "
				+ "from Audio A join Podcast P on A.IDAudio = P.IDPodcast "
				+ "join Artista AR on AR.IDArtista = A.IDArtista "
				+ "where P.NombrePodcast = ?";
		
		try {
			Connection conn = conexion.getConnection();
			PreparedStatement sentencia = conn.prepareStatement(consultaSQL);
			sentencia.setString(1, nombrePodcast);
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				
				Podcast p = new Podcast();
				
				p.setNombre(resultado.getString("NombrePodcast"));
				p.setDuracion(resultado.getInt("Duracion"));
				p.setnReproducciones(resultado.getInt("NReproducciones"));
				p.setColaboradores( resultado.getInt("Colaboradores"));
				p.setImagen(resultado.getString("Imagen"));
				p.setIdArtista(resultado.getString("IDArtista"));
				p.setNombreArtistico(resultado.getString("NombreArtistico"));
				
				
				
				cargarPodcasts.add(p);
			}
			sentencia.close();
			resultado.close();
			conn.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
		
	}
	
	public void abrirReproductorPodcast(String nombrePodcast) {
		
		audioReproduciendo = "podcast";
		
		if (nombrePodcast == null) {
			return;	
		}
		
		String consultaSQL = "select P.NombrePodcast, P.Colaboradores, A.Duracion, AR.Imagen "
				+ "from Audio A join Podcast P on A.IDAudio = P.IDPodcast "
				+ "join Artista AR on AR.IDArtista = A.IDArtista "
				+ "where P.NombrePodcast = ?";
		try {
			Connection conn = conexion.getConnection();
			PreparedStatement sentencia = conn.prepareStatement(consultaSQL);
			sentencia.setString(1, nombrePodcast);
			ResultSet resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				String infoPodcastSeleccionada = " Podcast: " +resultado.getString("NombrePodcast") + "\n" +
												 " Colaboradores: " +resultado.getString("Colaboradores") + "\n" +
												 " Duracion: " +resultado.getInt("Duracion");
				lblInfoAudioReproducido.setText(infoPodcastSeleccionada);
				String rutaImagen = "";
				
				rutaImagen = resultado.getString("Imagen");
		
			if(rutaImagen != null || rutaImagen.isEmpty()) {
				
				if(rutaImagen.startsWith("/")) {
					rutaImagen = rutaImagen.substring(1);
				}
				
				ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
				
				Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(
						lblFotoReproduccion.getWidth(), lblFotoReproduccion.getHeight(), Image.SCALE_SMOOTH);
				
				lblFotoReproduccion.setIcon(new ImageIcon(imagenRedimensionada));
				lblFotoReproduccion.setText("");
			}
				
				cl_aplicacion_usuario.show(Aplicacion_usuario, "reproduccion");
			}
			sentencia.close();
			conn.close();
		}catch(SQLException error) {
			error.printStackTrace();
		}
			
	}
	
	
	
	
	
	
	public void actualizarTablaEstadisticas(String tipoTop) {
		panelTablaEstadisticas.removeAll();
		
		DefaultTableModel modeloTabla = new DefaultTableModel();
		
		if(tipoTop.equals("canciones")) {
			modeloTabla.addColumn("Posicion");
			modeloTabla.addColumn("Titulo de la cancion");
			modeloTabla.addColumn("Artista / Album");
			modeloTabla.addColumn("Duracion");
			
		}else if(tipoTop.equals("podcasts")) {
			modeloTabla.addColumn("Posicion");
			modeloTabla.addColumn("Titulo del podcast");
			modeloTabla.addColumn("Artista / Album");
			modeloTabla.addColumn("Duracion");
			
		}else if(tipoTop.equals("reproducciones")) {
			modeloTabla.addColumn("Posicion");
			modeloTabla.addColumn("Contenido");
			modeloTabla.addColumn("Tipo");
			modeloTabla.addColumn("Nº Reproducciones");
			
		}else if(tipoTop.equals("podcasts")) {
			modeloTabla.addColumn("Posicion");
			modeloTabla.addColumn("Nombre de la playlist");
			modeloTabla.addColumn("Creador");
			modeloTabla.addColumn("Total Canciones");
		}
		
		JTable tablaEstadisticas = new JTable(modeloTabla);
		
		JScrollPane scrollPanelTabla = new JScrollPane(tablaEstadisticas);
		
		panelTablaEstadisticas.add(scrollPanelTabla, BorderLayout.CENTER);
		
		panelTablaEstadisticas.revalidate();
		panelTablaEstadisticas.repaint();
	}
	
	public void añadirCancion() {
		
		String nombre =txtNombreAdministrarAñadirMusica.getText().trim();
		
		int duracion= Integer.parseInt(txtDuracionAdministrarAñadirCancion.getText());
		String archivo = txtArchivoAdministrarAñadirCancion.getText(); 
		String tipo = "Cancion";
		int nReproducciones= 1;
				
		
		if (nombre.isEmpty()){
			JOptionPane.showMessageDialog(this, "Rellena los campos"); 
			
	} else {
			
			
			String consulta = "INSERT INTO Audio(Nombre, Duracion, Archivo, Tipo, NReproducciones) VALUES (?, ?, ?, ?, ?)";
			
		try {
			
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			
			
			sentencia.setString(1, nombre);
			sentencia.setInt(2, duracion);
			sentencia.setString(3, archivo);
			sentencia.setString(4, tipo);
			sentencia.setInt(5, nReproducciones);
			
			
			int ejecucion = sentencia.executeUpdate();
			
			if(ejecucion > 0) {
				
			JOptionPane.showMessageDialog(this, "Cancion registrada correctamente");
		
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
			}else {
				JOptionPane.showMessageDialog(Aplicacion_usuario, "No se ha podido añadir la cancion deseada");
			}
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			JOptionPane.showMessageDialog(this, "Error de SQL: " + error.getMessage());
			error.printStackTrace();
		}
	}
}
	public void eliminarCancion() {
		
		String nombre = txtNombreEliminarMusica.getText().trim();
		
		
		if (nombre.isEmpty()){
			JOptionPane.showMessageDialog(this, "Rellena los campos"); 
			
	} else {
			
			
			String consulta = "DELETE FROM Audio WHERE Nombre = ?";
			
		try {
			
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			
			
			sentencia.setString(1, nombre);
			
			int ejecucion = sentencia.executeUpdate();
			
			if(ejecucion > 0) {
				
			JOptionPane.showMessageDialog(this, "Cancion eliminada correctamente");
		
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
			}else {
				JOptionPane.showMessageDialog(Aplicacion_usuario, "No se ha podido eliminar la cancion deseada");
			}
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			JOptionPane.showMessageDialog(this, "Error de SQL: " + error.getMessage());
			error.printStackTrace();
		}
	}
}
	
public void modificarCancion() {
		
		String nombre =txtNombreModificarMusica.getText().trim();
		
		int duracion= Integer.parseInt(txtDuracionModificarCancion.getText());
		String archivo = txtArchivoModificarCancion.getText(); 
		String tipo = "Cancion";
		int nReproducciones= Integer.parseInt(txtNReproduccionesModificar.getText());
		String idAudio = txtIDAudioModificarCancion.getText();
				
		
		if (nombre.isEmpty()){
			JOptionPane.showMessageDialog(this, "Rellena los campos"); 
			
	} else {
			
			
			String consulta = "UPDATE Audio SET Nombre= ?, Duracion= ?, "
					+ "Archivo= ?, Tipo= ?, NReproducciones= ?  "
					+ "WHERE IDAudio = ?";
			
		try {
			
			Connection con = conexion.getConnection();
			PreparedStatement sentencia = con.prepareStatement(consulta);
			
			
			sentencia.setString(1, nombre);
			sentencia.setInt(2, duracion);
			sentencia.setString(3, archivo);
			sentencia.setString(4, tipo);
			sentencia.setInt(5, nReproducciones);
			sentencia.setString(6, idAudio);

			
			int ejecucion = sentencia.executeUpdate();
			
			if(ejecucion > 0) {
				
			JOptionPane.showMessageDialog(this, "Cancion modificada correctamente");
		
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
			}else {
				JOptionPane.showMessageDialog(Aplicacion_usuario, "No se ha podido modificar la cancion deseada");
			}
			sentencia.close();
			con.close();
		}catch(SQLException error) {
			JOptionPane.showMessageDialog(this, "Error de SQL: " + error.getMessage());
			error.printStackTrace();
		}
	}
}
	
	@Override
	public void mouseClicked(MouseEvent evento) {
		
		if(evento.getClickCount() == 2) {
			if(evento.getSource()== listaArtistas) {
				String artistaSeleccionado = listaArtistas.getSelectedValue();
				if(artistaSeleccionado != null) {
					abrirVentanaArtista(artistaSeleccionado);
				}
			}else if (evento.getSource() == listaDiscos) {
				String discoSeleccionado = listaDiscos.getSelectedValue();
				if(discoSeleccionado != null) {
					abrirVentanaAlbum(discoSeleccionado);		
				}
			}else if(evento.getSource() == listaPodcasters) {
				String podcasterSeleccionado = listaPodcasters.getSelectedValue();
				if(podcasterSeleccionado != null) {
					abrirVentanaPodcasts(podcasterSeleccionado);
				}
			}else if(evento.getSource() == listaCanciones) {
				String seleccionCancion = listaCanciones.getSelectedValue();
				abrirReproductorCancion(seleccionCancion);
				
			}else if(evento.getSource() == listaPodcasts){
				int indice = 0;
				indice = listaPodcasts.getSelectedIndex();
					if (indice < cargarPodcasts.size()) {
						Podcast podcastSeleccionado = cargarPodcasts.get(indice);
						abrirReproductorPodcast(podcastSeleccionado.getNombre());
					}
				
					String seleccionPodcasts = listaPodcasts.getSelectedValue();
					
					if(seleccionPodcasts != null) {
						String nombrePodcast = seleccionPodcasts.split(" \\(")[0];
						abrirReproductorPodcast(nombrePodcast);
				}
			}
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
		
		if (evento.getSource() == btnAtrasRegistro || evento.getSource() == btnAtrasMenu || evento.getSource() == btnAtrasAdministracion) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		}
		
		if(evento.getSource() == btnAtrasArtistas || evento.getSource() == btnAtrasPodcasters || evento.getSource() == btnAtrasPlaylists) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "menu");
		}
		
		if (evento.getSource() == btnDescubrirPodcast) {
			llamarPodcasters();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "podcasters");
		}
		
		
		if (evento.getSource() == btnAtrasArtista) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artistas");
		}
		
		if (evento.getSource() == btnAtrasAlbums ) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
		}
		
		if (evento.getSource() == btnAtrasReproduccion ) {
			if(audioReproduciendo.equals("cancion")) {
				cl_aplicacion_usuario.show(Aplicacion_usuario, "album");
			}else if(audioReproduciendo.equals("podcast")) {
				cl_aplicacion_usuario.show(Aplicacion_usuario, "podcasts");
			}
		}
		
		
		if (evento.getSource() == btnAtrasPodcasts) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "podcasters");
			
		}
		
		if(evento.getSource() == btnAtrasPerfil) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, panelAnterior);
		}
		
		if(evento.getSource() == btnAtrasMenuEstadisticas) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
		}
		
		
		if(evento.getSource() == btnAtrasEstadisticas) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "menu estadisticas");
		}
		
		if(evento.getSource() == btnAtrasAdministracion) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		}
		
		if(evento.getSource() == btnAtrasAdministrarMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
		}
		
		if(evento.getSource() == btnAtrasAdministarAñadirMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administrar musica");
		}
		
		if (evento.getSource() == btnLogin) {
			if(validarLogin()) {
				String cbSeleccion= cbVerificar.getSelectedItem().toString();
				
				if(cbSeleccion.equals("Administrador")) {
					cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
				}else if(cbSeleccion.equals("Empleado")) {
					cl_aplicacion_usuario.show(Aplicacion_usuario, "administracion");
				}else if(cbSeleccion.equals("Cliente")) {
					cl_aplicacion_usuario.show(Aplicacion_usuario, "menu");
				}
			}
		}
		
		if(evento.getSource()== btnGuardar) {
			validarRegistro();
		}
		
		if(evento.getSource() == btnDescubrirMusica) {
			llamarArtistas();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artistas");
		}
		
		if(evento.getSource() == btnMisPlaylists) {
			llamarPlaylists();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "playlists");
		}
		
		
		if(evento.getSource() == btnPerfilMenu ) {
			panelAnterior = "menu";
			abrirPanelPerfil();
		
		}
		if (evento.getSource() == btnPerfilArtistas ) {
			panelAnterior = "artistas";
			abrirPanelPerfil();
		}
			
		if(evento.getSource() == btnPerfilArtista) {
			panelAnterior = "artista";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilAlbums) {
			panelAnterior = "album";
			abrirPanelPerfil();
		}
		if(evento.getSource() == btnPerfilPlaylists) {
			panelAnterior = "playlists";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilPodcasts) {
			panelAnterior = "podcasts";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilPodcasters) {
			panelAnterior = "podcasters";
			abrirPanelPerfil();
			
		}
		
		
		if(evento.getSource() == btnPerfilReproduccion) {
			panelAnterior = "reproduccion";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilAdministrarMusica) {
			panelAnterior = "administrar musica";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilAñadirMusica) {
			panelAnterior = "añadir musica";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnPerfilEliminarMusica) {
			panelAnterior = "eliminar musica";
			abrirPanelPerfil();
		}
		
		if(evento.getSource() == btnTopCanciones){
		    tipoEstadistica = "canciones";
		    cl_aplicacion_usuario.show(Aplicacion_usuario, "estadisticas");
		}

		if(evento.getSource() == btnTopPodcast){
		    tipoEstadistica = "podcasts";
		    cl_aplicacion_usuario.show(Aplicacion_usuario, "estadisticas");
		}

		if(evento.getSource() == btnTopReproducciones){
		    tipoEstadistica = "reproducciones";
		    cl_aplicacion_usuario.show(Aplicacion_usuario, "estadisticas");
		}

		if(evento.getSource() == btnTopPlaylist){
		    tipoEstadistica = "playlist";
		    cl_aplicacion_usuario.show(Aplicacion_usuario, "estadisticas");
		}
		
		
		if(evento.getSource() == btnIniciar) {
			JOptionPane.showMessageDialog(this, "Iniciando reproduccion");
		}
		
		if(evento.getSource() == btnCancionAnterior) {
			 if(audioReproduciendo.equals("cancion")) {
				 int indice =0;
				 indice = listaCanciones.getSelectedIndex();
				 if(indice > 0) {
					 indice = indice -1;
					 listaCanciones.setSelectedIndex(indice);
					 Cancion cancion = cargarCanciones.get(indice);
					 abrirReproductorPodcast(cancion.getNombre());
					 String podcast = modeloPodcasts.getElementAt(indice);
				     abrirReproductorPodcast(podcast);
				 }
			 }else if(audioReproduciendo.equals("podcast")) {
				 int indice =0;
				 indice = listaPodcasts.getSelectedIndex();
				 if(indice > 0) {
					 indice = indice -1;
					 listaPodcasts.setSelectedIndex(indice);
					 Podcast p = cargarPodcasts.get(indice);
					 abrirReproductorPodcast(p.getNombre());
					 String podcast = modeloPodcasts.getElementAt(indice);
					 abrirReproductorPodcast(podcast);
			 }
		}
	}
		
		if(evento.getSource() == btnSiguienteCancion) {
			
		}
		
		if(evento.getSource() == btnFavorito) {
			
		}
		
		if (evento.getSource() == btnEditarPerfil) {
			btnGuardarPerfil.setVisible(true);
			btnEditarPerfil.setVisible(false);
		}
		if(evento.getSource() == btnGuardarPerfil) {
			boolean vacio = false;
			
			btnEditarPerfil.setVisible(true);
			btnGuardarPerfil.setVisible(false);
			
			String nuevoNombre = txtNombrePerfil.getText().trim();
			String nuevoApellido = txtApellidoPerfil.getText().trim();
			String nuevoUsuario = txtUsuarioPerfil.getText().trim();
			
			if(nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevoUsuario.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios");
				vacio = true;
			}
			
			String consultaSQL = "Update Cliente set Nombre = ?, Apellido = ?, Usuario = ? where IDCliente = ?";
			
			try {
				Connection con = conexion.getConnection();
				PreparedStatement sentencia = con.prepareStatement(consultaSQL);
				
				sentencia.setString(1, nuevoNombre);
				sentencia.setString(2, nuevoApellido);
				sentencia.setString(3, nuevoUsuario);
				sentencia.setString(4, clienteLogueado.getIdCliente());
				
				int resultado = sentencia.executeUpdate();
				
				if(resultado > 0) {
					clienteLogueado.setNombre(nuevoNombre);
					clienteLogueado.setApellido(nuevoApellido);
					clienteLogueado.setUsuario(nuevoUsuario);
					
					btnPerfilMenu.setText(nuevoUsuario);
					
					JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");

				}
				
				sentencia.close();
				
			}catch(SQLException error) {
				error.printStackTrace();
			}
		}
	
		if(evento.getSource() == btnEstadisticas) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "estadisticas");
		}
		
		if(evento.getSource() == btnGestionarMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "administrar musica");
		}
		
		if (evento.getSource() == btnAñadirMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "añadir musica");
		}
		
		if(evento.getSource() == btnEliminarMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "eliminar musica");
		}
		
		if(evento.getSource() == btnModificarMusica) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "modificar musica");
		}
		
		if(evento.getSource() == btnConfirmarAñadirMusica) {
			añadirCancion();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "añadir musica");
		}
		
		if(evento.getSource() == btnConfirmarEliminarMusica) {
			eliminarCancion();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "eliminar musica");
		}
		
		if(evento.getSource() == btnConfirmarModificarMusica) {
			modificarCancion();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "modificar musica");
		}
		
		}	
	}
