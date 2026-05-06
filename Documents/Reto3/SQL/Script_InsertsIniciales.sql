-- 1. IDIOMA
INSERT INTO Idioma (IDIdioma, Descripcion) VALUES
('ES', 'Español'),
('EN', 'Inglés'),
('FR', 'Francés'),
('DE', 'Alemán'),
('CA', 'Catalán'),
('EU', 'Euskera'),
('GA', 'Gallego'),
('AR', 'Árabe');

-- 2. ARTISTA
INSERT INTO Artista (IDArtista, NombreArtistico, GeneroPredom, Imagen, Descripcion) VALUES
('A001', 'Kaze',          'Rap',        'kaze.jpg',  'Cristian Carrión, artista de rap'),
('A002', 'Bad Bunny',     'Reggaeton',  'bdb.jpg',   'Artista puertorriqueño de reggaeton y trap latino'),
('A003', 'Rosalía',       'Flamenco',   'ros.jpg',   'Cantante española de flamenco y pop alternativo'),
('A004', 'PodcastMaster', 'Tecnología', 'pm.jpg',    'Podcaster especializado en tecnología e innovación'),
('A005', 'HistoriaCon',   'Historia',   'hc.jpg',    'Podcaster dedicado a la divulgación histórica'),
('A006','TechTalks','Tecnología','tt.jpg','Nuevo podcaster de tecnología'),
('A007','HistoryLab','Historia','hl.jpg','Nuevo divulgador histórico');
-- 3. PODCASTER
INSERT INTO Podcaster (IDPodcaster) VALUES
('A004'),
('A005'),
('A006'),
('A007');

-- 4. MUSICO
INSERT INTO Musico (IDMusico, Descripcion) VALUES
('A001', 'Solista'),
('A002', 'Solista'),
('A003', 'Solista');

-- 5. AUDIO
INSERT INTO Audio (IDAudio, Nombre, Duracion, Archivo, Tipo, NReproducciones, IDArtista) VALUES
('AU001', 'Nombre Direccion',    210, 'nombre_direccion.mp3',  'Cancion',  120000, 'A001'),
('AU002', 'Tití Me Preguntó', 198, 'titi.mp3','Cancion',  5200000, 'A002'),
('AU003', 'MALAMENTE', 214, 'malamente.mp3', 'Cancion',  3100000, 'A003'),
('AU004', 'El Futuro de IA',  2700,'futuro_ia.mp3', 'Podcast',   450000, 'A004'),
('AU005', 'La Caída de Roma', 3600,'caida_roma.mp3','Podcast',   320000, 'A005'),
('AU006','T K T',200,'tkt.mp3','Cancion',0,'A001'),
('AU007','Guapa Cabrea',200,'gc.mp3','Cancion',0,'A001'),
('AU008','La molecula de dios',200,'md.mp3','Cancion',0,'A001'),
('AU009','Compostela 12',200,'c12.mp3','Cancion',0,'A001'),
('AU010','No Ice',200,'noice.mp3','Cancion',0,'A001'),
('AU011','Record',200,'record.mp3','Cancion',0,'A001'),
('AU012','Los dos libros',200,'libros.mp3','Cancion',0,'A001'),
('AU013','Ya me conoces',200,'ymc.mp3','Cancion',0,'A001'),
('AU014','Quiero Sei$',200,'qs.mp3','Cancion',0,'A001'),
('AU015','STKS',200,'stks.mp3','Cancion',0,'A001'),
('AU016','El plan',200,'plan.mp3','Cancion',0,'A001'),
('AU017','Relajateee',200,'relax.mp3','Cancion',0,'A001'),
('AU018','Like Takis',200,'takis.mp3','Cancion',0,'A001'),
('AU019','CC-1028',200,'cc.mp3','Cancion',0,'A001'),
('AU020','4 Roses',200,'roses.mp3','Cancion',0,'A001'),
('AU021','Por decidir',200,'pd.mp3','Cancion',0,'A001'),
('AU022','La lloradita',200,'ll.mp3','Cancion',0,'A001'),
('AU023','Ta To Clin',200,'ttc.mp3','Cancion',0,'A001'),
('AU024','Cris Starr',200,'cs.mp3','Cancion',0,'A001'),
('AU025','Cuando Desperto',200,'cd.mp3','Cancion',0,'A001'),
('AU026','Salgo calle',200,'spc.mp3','Cancion',0,'A001'),
('AU027','Yo os quiero',200,'yoq.mp3','Cancion',0,'A001'),
('AU028','No quiero tu',200,'nq.mp3','Cancion',0,'A001'),
('AU029','Todo el rato',200,'ter.mp3','Cancion',0,'A001'),
('AU030','Soportando el peso',200,'sep.mp3','Cancion',0,'A001'),
('AU031','Le dedico un coro',200,'ldc.mp3','Cancion',0,'A001'),
('AU032','Antipop',200,'antipop.mp3','Cancion',0,'A001'),
('AU033','Caramelo',200,'caramelo.mp3','Cancion',0,'A002'),
('AU034','La Cancion',200,'lacancion.mp3','Cancion',0,'A002'),
('AU035','Otra Noche en Miami',200,'miami.mp3','Cancion',0,'A002'),
('AU036','Saoko',200,'saoko.mp3','Cancion',0,'A003'),
('AU037','Candy',200,'candy.mp3','Cancion',0,'A003'),
('AU038','Bizcochito',200,'bizco.mp3','Cancion',0,'A003'),
('AU039','Chicken Teriyaki',200,'ct.mp3','Cancion',0,'A003'),
('AU040','Innovacion 2030',1800,'inn2030.mp3','Podcast',0,'A004'),
('AU041','Edad Media',2000,'edad_media.mp3','Podcast',0,'A005'),
('AU042','IA y Futuro',1500,'ia_futuro.mp3','Podcast',0,'A006'),
('AU043','Roma Profunda',2000,'roma.mp3','Podcast',0,'A007');

-- 6. PODCAST
INSERT INTO Podcast (IDPodcast, NombrePodcast, Colaboradores, IDPodcaster) VALUES
('AU004', 'El futuro de IA', 2, 'A004'),
('AU005', 'La Caída de Roma', 1, 'A005'),
('AU040','Innovacion 2030',2,'A004'),
('AU041','Edad Media',1,'A005'),
('AU042','IA y Futuro',3,'A006'),
('AU043','Roma Profunda',2,'A007');
-- 7. ALBUM
INSERT INTO Album (IDAlbum, Titulo, Año, Genero, Imagen, IDMusico) VALUES
('ALB001', 'Nombre Direccion', '2023-11-29', 'Rap', 'sombras.jpg', 'A001'),
('ALB002', 'Un Verano Sin Ti', '2022-05-06', 'Reggaeton','uvst.jpg', 'A002'),
('ALB003', 'El Mal Querer', '2018-11-02', 'Flamenco', 'emq.jpg', 'A003'),
('ALB004', 'Antipop', '2021-01-01', 'Rap', 'antipop.jpg', 'A001'),
('ALB005', 'Oasis', '2019-06-28', 'Reggaeton', 'oasis.jpg', 'A002'),
('ALB006', 'Motomami', '2022-03-18', 'Pop', 'motomami.jpg', 'A003');
-- 8. CANCION
INSERT INTO Cancion (IDCancion, IDAlbum, Artistas_invitados) VALUES
('AU001','ALB001',NULL),
('AU002','ALB002',NULL),
('AU003','ALB003',NULL),
('AU006','ALB001',NULL),
('AU007','ALB001',NULL),
('AU008','ALB001',NULL),
('AU009','ALB001',NULL),
('AU010','ALB001',NULL),
('AU011','ALB001',NULL),
('AU012','ALB001',NULL),
('AU013','ALB001',NULL),
('AU014','ALB001',NULL),
('AU015','ALB001',NULL),
('AU016','ALB001',NULL),
('AU017','ALB001',NULL),
('AU018','ALB001',NULL),
('AU019','ALB001',NULL),
('AU020','ALB001',NULL),
('AU021','ALB001',NULL),
('AU022','ALB001',NULL),
('AU023','ALB001',NULL),
('AU024','ALB001',NULL),
('AU025','ALB001',NULL),
('AU026','ALB004',NULL),
('AU027','ALB004',NULL),
('AU028','ALB004',NULL),
('AU029','ALB004',NULL),
('AU030','ALB004',NULL),
('AU031','ALB004',NULL),
('AU032','ALB004',NULL),
('AU033','ALB005',NULL),
('AU034','ALB005',NULL),
('AU035','ALB005',NULL),
('AU036','ALB006',NULL),
('AU037','ALB006',NULL),
('AU038','ALB006',NULL),
('AU039','ALB006',NULL);

-- 9. CLIENTE
INSERT INTO Cliente (IDCliente, Nombre, Apellido, Idioma, Usuario, Contraseña, FechaNacimiento, FechaRegistro, Tipo) VALUES
('C001', 'Carlos',  'García',    'ES', 'carlosg',  'pass1234',  '1995-03-15', '2022-01-10', 'Premium'),
('C002', 'Laura',   'Martínez',  'EN', 'lauramtz', 'secur456',  '1998-07-22', '2023-05-18', 'Free'),
('C003', 'Pedro',   'López',     'CA', 'pedrolop', 'pedro789',  '2001-11-30', '2024-02-01', 'Premium'),
('C004', 'Amaia',   'Etxeberri', 'EU', 'amaiaetx', 'amaia000',  '1990-05-05', '2021-08-20', 'Free'),
('C005', 'Sophie',  'Dupont',    'FR', 'sophiedp', 'sophie321', '1997-09-14', '2023-11-03', 'Premium');

-- 10. PLAYLIST
INSERT INTO Playlist (IDPlaylist, Titulo, FechaCreacion, IDCliente) VALUES
(1, 'Mis Favoritas',  '2023-01-15', 'C001'),
(2, 'Workout Mix',    '2023-06-20', 'C002'),
(3, 'Relax Vibes',    '2024-01-05', 'C003'),
(4, 'Top Rap',        '2022-11-11', 'C004'),
(5, 'Chill Evening',  '2024-03-22', 'C005');

-- 11. PLAYLIST_CANCIONES
INSERT INTO Playlist_Canciones (IDCancion, IDPlaylist, FechaPlayList_cancion) VALUES
('AU001', 1, '2023-02-01'),
('AU002', 1, '2023-02-05'),
('AU003', 2, '2023-07-10'),
('AU001', 4, '2022-12-01'),
('AU003', 5, '2024-04-01');

-- 12. FAVORITOS
INSERT INTO Favoritos (IDCliente, IDAudio) VALUES
('C001', 'AU001'),
('C002', 'AU002'),
('C003', 'AU003'),
('C004', 'AU004'),
('C005', 'AU005');

-- 13. PREMIUM
INSERT INTO Premium (IDCliente, FechaCaducidad) VALUES
('C001', '2025-01-10'),
('C003', '2025-02-01'),
('C005', '2024-11-03');