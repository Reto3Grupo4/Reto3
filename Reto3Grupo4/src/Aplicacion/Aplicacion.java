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

import Enums.IdiomaE;
import Enums.TipoCliente;
import POJOS.Cliente;
import POJOS.Podcast;
import conexionBD.conexion;

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
import javax.swing.JTextArea;

/*Imports para la conexion con la Base de Datos*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;


public class Aplicacion extends JFrame implements ActionListener, MouseListener{
	
	private static final long serialVersionUID = 1L;
	private JPanel Aplicacion_usuario;
	private CardLayout cl_aplicacion_usuario;
	private JPanel panelLogin;
	private JPanel panelRegistro;
	private JPanel panelMenu;
	public JTextField txtUsuario;
	public JPasswordField pf_Clave;
	private JTextField txtNombre;
	public JTextField txtUsuario_2;
	private JTextField txtApellidos;
	public JPasswordField pfClave_2;
	public JPasswordField pfConfirmar;
	private JTextArea txtAreaInformacion;
	private JTextArea txtAreaInfoAlbum;
	private JLabel lblFotoReproduccion;
	private JLabel lblInfoAudioReproducido;
	private JLabel lblFotoArtista;

	private JTextField txtFecNac;
	private JTextField txtFecRegistro;
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
	
	private JCheckBox chckbxPremium;
	private JComboBox cBIdioma;
	
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
		setBounds(100, 100, 650, 795);
		Aplicacion_usuario = new JPanel();
		Aplicacion_usuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		cl_aplicacion_usuario = new CardLayout();
		Aplicacion_usuario.setLayout(cl_aplicacion_usuario);
		setContentPane(Aplicacion_usuario);
		
		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBorder(new TitledBorder(null, "Ventana Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(panelLogin, "login");
		
		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(171, 160, 46, 14);
		panelLogin.add(lblUsuario_1);
		
		JLabel lblClave_1 = new JLabel("Clave:");
		lblClave_1.setBounds(171, 191, 46, 14);
		panelLogin.add(lblClave_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(226, 157, 86, 20);
		panelLogin.add(txtUsuario);
		
		pf_Clave = new JPasswordField();
		pf_Clave.setBounds(227, 188, 85, 20);
		panelLogin.add(pf_Clave);
		
		JList list_1 = new JList();
		list_1.setBounds(187, 136, 1, 1);
		panelLogin.add(list_1);
		
		JComboBox cbVerificar_1 = new JComboBox();
		cbVerificar_1.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Empleado", "Administrador"}));
		cbVerificar_1.setToolTipText("");
		cbVerificar_1.setBounds(226, 219, 86, 22);
		panelLogin.add(cbVerificar_1);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(123, 277, 89, 23);
		panelLogin.add(btnLogin);
		
		btnRegistrar = new JButton("Registrate");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(338, 277, 89, 23);
		panelLogin.add(btnRegistrar);
		
		panelRegistro = new JPanel();
		panelRegistro.setBorder(new TitledBorder(null, "Ventana Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Aplicacion_usuario.add(panelRegistro, "registro");
		panelRegistro.setLayout(null);
		
		btnAtrasRegistro = new JButton("Atras");
		btnAtrasRegistro.addActionListener(this);
		btnAtrasRegistro.setBounds(10, 25, 89, 23);
		panelRegistro.add(btnAtrasRegistro);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(65, 85, 46, 14);
		panelRegistro.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(121, 82, 86, 20);
		panelRegistro.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtUsuario_2 = new JTextField();
		txtUsuario_2.setColumns(10);
		txtUsuario_2.setBounds(121, 115, 197, 20);
		panelRegistro.add(txtUsuario_2);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(217, 85, 46, 14);
		panelRegistro.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(273, 82, 86, 20);
		panelRegistro.add(txtApellidos);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(65, 118, 46, 14);
		panelRegistro.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setBounds(65, 149, 46, 14);
		panelRegistro.add(lblClave);
		
		pfClave_2 = new JPasswordField();
		pfClave_2.setBounds(121, 146, 197, 20);
		panelRegistro.add(pfClave_2);
		
		JLabel lblConfirmar = new JLabel("Confirmar:");
		lblConfirmar.setBounds(48, 180, 63, 14);
		panelRegistro.add(lblConfirmar);
		
		pfConfirmar = new JPasswordField();
		pfConfirmar.setBounds(121, 177, 197, 20);
		panelRegistro.add(pfConfirmar);
		
		JLabel lblFechaNac = new JLabel("Fecha Nacimiento:");
		lblFechaNac.setBounds(22, 211, 89, 14);
		panelRegistro.add(lblFechaNac);
		
		txtFecNac = new JTextField();
		txtFecNac.setBounds(121, 208, 197, 20);
		panelRegistro.add(txtFecNac);
		txtFecNac.setColumns(10);
		
		JLabel lblFecRegistro = new JLabel("Fecha Registro:");
		lblFecRegistro.setBounds(32, 245, 79, 14);
		panelRegistro.add(lblFecRegistro);
		
		txtFecRegistro = new JTextField();
		txtFecRegistro.setBounds(121, 239, 197, 20);
		panelRegistro.add(txtFecRegistro);
		txtFecRegistro.setColumns(10);
		
		JLabel lblPremium = new JLabel("Quieres Premium?");
		lblPremium.setBounds(22, 275, 89, 14);
		panelRegistro.add(lblPremium);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(65, 312, 46, 14);
		panelRegistro.add(lblIdioma);
		
		cBIdioma = new JComboBox();
		cBIdioma.setModel(new DefaultComboBoxModel(new String[] {"ES", "EU", "EN", "FR", "DE", "CA", "GA", "AR"}));
		cBIdioma.setBounds(121, 308, 46, 22);
		panelRegistro.add(cBIdioma);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(32, 374, 89, 23);
		panelRegistro.add(btnGuardar);
		
		JButton btnComprarPremium = new JButton("Comprar Premium");
		btnComprarPremium.setBounds(196, 374, 122, 23);
		panelRegistro.add(btnComprarPremium);
		
		chckbxPremium = new JCheckBox("");
		chckbxPremium.setBounds(121, 275, 21, 23);
		panelRegistro.add(chckbxPremium);
		
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
		
		JLabel lblEscoger = new JLabel("ESCOGE");
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
		
		JPanel panelArtistas = new JPanel();
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
		
		JLabel lblListaArtistas = new JLabel("Lista de artistas");
		lblListaArtistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaArtistas.setBounds(256, 20, 118, 14);
		panelArtistas.add(lblListaArtistas);
		
		modeloArtistas = new DefaultListModel<>();
		JScrollPane scrollListaArtistas = new JScrollPane();
		scrollListaArtistas.setBounds(190, 118, 265, 193);
		panelArtistas.add(scrollListaArtistas);
		listaArtistas = new JList<>(modeloArtistas);
		
		listaArtistas.setBounds(190, 118, 253, 191);
		listaArtistas.addMouseListener(this);
		listaArtistas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panelArtista = new JPanel();
		Aplicacion_usuario.add(panelArtista, "artista");
		panelArtista.setLayout(null);
		
		btnAtrasArtista = new JButton("Atras");
		btnAtrasArtista.addActionListener(this);
		btnAtrasArtista.setBounds(10, 11, 89, 23);
		panelArtista.add(btnAtrasArtista);
		
		btnPerfilArtista = new JButton("Perfil");
		btnPerfilArtista.setBounds(405, 11, 89, 23);
		btnPerfilArtista.addActionListener(this);
		panelArtista.add(btnPerfilArtista);
		
		JPanel pnlListaDisco = new JPanel();
		pnlListaDisco.setBorder(new TitledBorder(null, "Lista Disco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlListaDisco.setBounds(10, 38, 234, 464);
		panelArtista.add(pnlListaDisco);
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
		panelArtista.add(pnlInformacion);
		pnlInformacion.setLayout(null);
		
		txtAreaInformacion = new JTextArea();
		txtAreaInformacion.setBounds(10, 25, 227, 166);
		pnlInformacion.add(txtAreaInformacion);
		
		lblFotoArtista = new JLabel("imagen");
		lblFotoArtista.setBounds(96, 293, 46, 14);
		pnlInformacion.add(lblFotoArtista);

		cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		
		JPanel panelAlbum = new JPanel();
		Aplicacion_usuario.add(panelAlbum, "album");
		panelAlbum.setLayout(null);
		
		btnAtrasAlbums = new JButton("Atras");
		btnAtrasAlbums.addActionListener(this);
		btnAtrasAlbums.setBounds(10, 11, 89, 23);
		panelAlbum.add(btnAtrasAlbums);
		
		JPanel pnlListaCanciones = new JPanel();
		pnlListaCanciones.setLayout(null);
		pnlListaCanciones.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista Canciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlListaCanciones.setBounds(0, 38, 247, 464);
		panelAlbum.add(pnlListaCanciones);
		
		modeloCanciones = new DefaultListModel<>();
		listaCanciones = new JList<>(modeloCanciones);
		listaCanciones.addMouseListener(this);
		listaCanciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JScrollPane scrollListaAlbums = new JScrollPane(listaCanciones);
		scrollListaAlbums.setBounds(10, 21, 214, 169);
		pnlListaCanciones.add(scrollListaAlbums);
		
		
		JPanel pnlInformacion_1 = new JPanel();
		pnlInformacion_1.setLayout(null);
		pnlInformacion_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion Albums", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlInformacion_1.setBounds(257, 38, 247, 464);
		panelAlbum.add(pnlInformacion_1);
		
		txtAreaInfoAlbum = new JTextArea();
		txtAreaInfoAlbum.setEditable(false);
		txtAreaInfoAlbum.setBounds(10, 21, 207, 166);
		pnlInformacion_1.add(txtAreaInfoAlbum);
		
		JLabel lblFotoAlbum = new JLabel("Imagen");
		lblFotoAlbum.setBounds(79, 298, 46, 14);
		pnlInformacion_1.add(lblFotoAlbum);
		
		btnPerfilAlbums = new JButton("Perfil");
		btnPerfilAlbums.addActionListener(this);
		btnPerfilAlbums.setBounds(475, 11, 89, 23);
		panelAlbum.add(btnPerfilAlbums);
		
		JPanel panelReproduccion = new JPanel();
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
		
		JPanel panelPlaylists = new JPanel();
		Aplicacion_usuario.add(panelPlaylists, "playlists");
		panelPlaylists.setLayout(null);
		
		btnAtrasPlaylists = new JButton("Atras");
		btnAtrasPlaylists.addActionListener(this);
		btnAtrasPlaylists.setBounds(10, 11, 89, 23);
		panelPlaylists.add(btnAtrasPlaylists);
		
		modeloPlaylist = new DefaultListModel<>();
		listaPlaylist = new JList<>(modeloPlaylist);
		JScrollPane scrollPlaylists = new JScrollPane(listaPlaylist);
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
		
		JPanel panelPodcasters = new JPanel();
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
		JScrollPane scrollListaPodcasters = new JScrollPane(listaPodcasters);
		scrollListaPodcasters.setBounds(89, 107, 338, 250);
		panelPodcasters.add(scrollListaPodcasters);
		
		scrollListaPodcasters.setViewportView(listaPodcasters);
		
		JLabel lblPodcasters = new JLabel("Lista de Podcasters disponibles");
		lblPodcasters.setHorizontalAlignment(SwingConstants.CENTER);
		lblPodcasters.setBounds(147, 82, 200, 14);
		panelPodcasters.add(lblPodcasters);
		
		JPanel panelPodcasts = new JPanel();
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
		
		JScrollPane scrollListaPodcasts = new JScrollPane(listaPodcasts);
		scrollListaPodcasts.setBounds(121, 116, 425, 297);
		panelPodcasts.add(scrollListaPodcasts);
		
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
		
		JLabel lblIDCliente = new JLabel("ID:");
		lblIDCliente.setBounds(171, 75, 27, 14);
		panelPerfil.add(lblIDCliente);
		
		txtIDCliente = new JTextField();
		txtIDCliente.setColumns(10);
		txtIDCliente.setBounds(208, 72, 86, 20);
		panelPerfil.add(txtIDCliente);
		
		JLabel lblApellidoPerfil = new JLabel("Apellido:");
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
		
		JLabel lblUsuarioPerfil = new JLabel("Usuario:");
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
			String premium = "";
			String idioma = "";
			idioma = cBIdioma.getSelectedItem().toString();
			
			if(chckbxPremium.isSelected()) {
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
			cargarInfoArtista(nombreLimpio);
			
			
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
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
		}catch(SQLException error) {
			error.printStackTrace();
		}
	}
	
	private void abrirVentanaAlbum(String seleccion) {
		if(seleccion != null) {
			String tituloLimpio = seleccion.split(" - ")[0];
			
			cargarCanciones(tituloLimpio);
			cargarInfoAlbum(tituloLimpio);
			
			cl_aplicacion_usuario.show(Aplicacion_usuario, "album");
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
		}catch(SQLException error) {
			error.getMessage();
		}
	}
	
	public void abrirReproductorCancion(String nombreCancion) {
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
				p.setColaboradores(resultado.getInt("Colaboradores"));
				p.setImagen(resultado.getString("Imagen"));
				p.setIdArtista(resultado.getString("IDArtista"));
				p.setNombreArtistico(resultado.getString("NombreArtistico"));
				
				cargarPodcasts.add(p);
			}
		}catch(SQLException error) {
			error.printStackTrace();
		}
		
	}
	
	public void abrirReproductorPodcast(String nombrePodcast) {
		
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
		}catch(SQLException error) {
			error.printStackTrace();
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
		
		if (evento.getSource() == btnAtrasRegistro || evento.getSource() == btnAtrasMenu) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "login");
		}
		
		if(evento.getSource() == btnAtrasArtistas || evento.getSource() == btnAtrasPodcasters) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "menu");
		}
		
		if (evento.getSource() == btnDescubrirPodcast) {
			llamarPodcasters();
			cl_aplicacion_usuario.show(Aplicacion_usuario, "podcasters");
		}
		
		
		if (evento.getSource() == btnAtrasArtista) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artistas");
		}
		
		if (evento.getSource() == btnAtrasAlbums || evento.getSource() == btnAtrasPlaylists) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "artista");
		}
		
		if (evento.getSource() == btnAtrasReproduccion ) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "album");
		}
		
		
		if (evento.getSource() == btnAtrasPodcasts) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, "podcasters");
		}
		
		if(evento.getSource() == btnAtrasPerfil) {
			cl_aplicacion_usuario.show(Aplicacion_usuario, panelAnterior);
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
		
		
		if(evento.getSource() == btnIniciar) {
			JOptionPane.showMessageDialog(this, "Iniciando reproduccion");
		}
		
		if(evento.getSource() == btnCancionAnterior) {
			 int indice =0;
			 indice = listaPodcasts.getSelectedIndex();
			 if(indice > 0) {
				 indice = indice -1;
				 listaPodcasts.setSelectedIndex(indice);
				 Podcast p = cargarPodcasts.get(indice);
				 abrirReproductorPodcast(p.getNombre());
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
	
	
	}	
}