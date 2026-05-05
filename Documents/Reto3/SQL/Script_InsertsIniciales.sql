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
('A005', 'HistoriaCon',   'Historia',   'hc.jpg',    'Podcaster dedicado a la divulgación histórica');

-- 3. PODCASTER
INSERT INTO Podcaster (IDPodcaster) VALUES
('A004'),
('A005');

-- 4. MUSICO
INSERT INTO Musico (IDMusico, Descripcion) VALUES
('A001', 'Solista'),
('A002', 'Solista'),
('A003', 'Solista');

-- 5. AUDIO
INSERT INTO Audio (IDAudio, Nombre, Duracion, Archivo, Tipo, NReproducciones) VALUES
('AU001', 'Flow Nocturno',    210, 'flow_nocturno.mp3',  'Cancion',  120000),
('AU002', 'Tití Me Preguntó', 198, 'titi.mp3',           'Cancion',  5200000),
('AU003', 'MALAMENTE',        214, 'malamente.mp3',      'Cancion',  3100000),
('AU004', 'El Futuro de IA',  2700,'futuro_ia.mp3',      'Podcast',   450000),
('AU005', 'La Caída de Roma', 3600,'caida_roma.mp3',     'Podcast',   320000);

-- 6. PODCAST
INSERT INTO Podcast (IDPodcast, Colaboradores, IDPodcaster) VALUES
('AU004', 2, 'A004'),
('AU005', 1, 'A005');

-- 7. ALBUM
INSERT INTO Album (IDAlbum, Titulo, Año, Genero, Imagen, IDMusico) VALUES
('ALB001', 'Nombre Direccion',          '2023-11-29', 'Rap',      'sombras.jpg', 'A001'),
('ALB002', 'Un Verano Sin Ti', '2022-05-06', 'Reggaeton','uvst.jpg',    'A002'),
('ALB003', 'El Mal Querer',    '2018-11-02', 'Flamenco', 'emq.jpg',     'A003');

-- 8. CANCION
INSERT INTO Cancion (IDCancion, IDAlbum, Artistas_invitados) VALUES
('AU001', 'ALB001', NULL),
('AU002', 'ALB002', NULL),
('AU003', 'ALB003', NULL);

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