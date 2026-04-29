create database if not exists destruyeSpotify;
use destruyespotify;
create table artista(
IDArtista varchar(5) primary key,
NombreArtistico char(20) not null unique,
GeneroPredom char(20),
Imagen varchar(255),
Descripcion varchar(255) not null
);

create table podcaster(
IDPodcaster varchar(5) primary key,
constraint fk_artista_podcaster foreign key(IDPodcaster)
references artista (IDArtista) on update cascade
);

create table Musico(
IDMusico varchar(5) primary key,
Descripcion enum ('Solista', 'Grupo') not null,
constraint fk_artista1 foreign key (IDMusico) 
references artista (IDArtista) on update cascade
);

create table podcast (
IDPodcast varchar(5) primary key,
Colaboradores int,
IDPodcaster varchar(5) not null,
constraint fk_audio foreign key (IDPodcast) 
references audio (IDAudio) on update cascade,
constraint fk_artista foreign key (IDPodcaster) 
references artista (IDArtista) on update cascade
);

create table audio(
IDAudio varchar(5) primary key,
Nombre char(20) not null unique,
Duracion int not null,
Archivo varchar(255),
Tipo enum ('Podcast', 'Cancion') not null,
NReproducciones int not null default 0
);

create table Album(
IDAlbum varchar(10) primary key,
Titulo varchar(20) not null,
Año date not null,
Genero char(15) not null,
Imagen varchar(255),
IDMusico varchar(5) not null,
constraint fk_musico foreign key (IDMusico)
references Musico (IDMusico) on update cascade
);

create table cancion (
IDCancion varchar(5) primary key,
IDAlbum varchar(10) not null,
Artistas_invitados varchar(50),
constraint fk_audio_canc foreign key (IDCancion)
references Audio (IDAudio) on update cascade,
constraint fk_Album_canc foreign key (IDAlbum)
references Album (IDAlbum) on update cascade
);

create table idioma(
IDIdioma enum ('ES', 'EU', 'EN', 'FR', 'DE', 'CA', 'GA', 'AR') primary key,
Descripcion char(100) not null
);

create table cliente(
IDCliente varchar(5) primary key, 
Nombre char(15) not null,
Apellido char (15) not null,
Idioma enum ('ES', 'EU', 'EN', 'FR', 'DE', 'CA', 'GA', 'AR') not null,
Usuario char(10) not null,
Contraseña varchar(64) not null,
FechaNacimiento date not null,
FechaRegistro date not null,
Tipo enum ('Premium', 'Free') not null,
Constraint fk_idioma foreign key (Idioma)
references idioma (IDIdioma) on update cascade
);


create table playlist (
IDPlaylist int unsigned primary key,
Titulo varchar(20) not null,
FechaCreacion date not null,
IDCliente varchar(5) not null,
Constraint fk_client foreign key (IDCliente)
references cliente (IDCliente) on update cascade
);


create table playlist_canciones(
IDCancion varchar(5),
IDPlaylist int unsigned,
FechaPlayList_cancion date not null,
Constraint pk_playlist primary key (IDCancion, IDPlaylist),
Constraint fk_cancion foreign key (IDCancion)
references cancion (IDCancion) on update cascade,
Constraint fk_playlist foreign key (IDPlaylist)
references Playlist (IDPlaylist) on update cascade
);

create table favoritos(
IDCliente varchar(5) primary key,
IDAudio varchar(5) not null,
constraint fk_cliente_fav foreign key (IDCliente)
references Cliente (IDCliente) on update cascade,
constraint fk_audio_fav foreign key (IDAudio)
references Audio (IDAudio) on update cascade
);

create table premium(
IDCliente varchar(5) primary key,
FechaCaducidad date not null,
constraint fk_cliente foreign key (IDCliente)
references Cliente (IDCliente) on update cascade
);