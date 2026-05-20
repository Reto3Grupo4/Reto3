create database if not exists DestruyeSpotify1;
use DestruyeSpotify;
create table Artista(
IDArtista char(5) primary key,
NombreArtistico char(20) not null unique,
GeneroPredom char(20),
Imagen varchar(255),
Descripcion varchar(255) not null
);

create table Podcaster(
IDPodcaster char(5) primary key,
constraint fk_Artista_Podcaster foreign key(IDPodcaster)
references Artista (IDArtista) on update cascade
);

create table Musico(
IDMusico char(5) primary key,
Descripcion enum ('Solista', 'Grupo') not null,
constraint fk_Artista1 foreign key (IDMusico) 
references Artista (IDArtista) on update cascade
);

create table Podcast (
IDPodcast char(5) primary key,
NombrePodcast varchar(45) not null,
Colaboradores int,
IDPodcaster char(5) not null,
constraint fk_Audio foreign key (IDPodcast) 
references Audio (IDAudio) on update cascade,
constraint fk_Artista foreign key (IDPodcaster) 
references Artista (IDArtista) on update cascade
);

create table Audio(
IDAudio char(5) primary key,
Nombre char(20) not null unique,
Duracion int not null,
Archivo varchar(255),
Tipo enum ('Podcast', 'Cancion') not null,
NReproducciones int not null default 0,
IDArtista char(5),
constraint fk_audio_artista foreign key (IDArtista)
references Artista (IDArtista) on update cascade
);

create table Album(
IDAlbum char(10) primary key,
Titulo varchar(20) not null,
Año date not null,
Genero char(15) not null,
Imagen varchar(255),
IDMusico char(5) not null,
constraint fk_Musico foreign key (IDMusico)
references Musico (IDMusico) on update cascade
);

create table Cancion (
IDCancion char(5) primary key,
IDAlbum char(10) not null,
Artistas_invitados varchar(50),
constraint fk_Audio_canc foreign key (IDCancion)
references Audio (IDAudio) on update cascade,
constraint fk_Album_canc foreign key (IDAlbum)
references Album (IDAlbum) on update cascade
);
alter table Cancion
drop foreign key fk_Audio_canc;
Alter table Cancion
add constraint fk_Audio_canc
foreign key (IDCancion) 
references Audio(IDAudio)
on update cascade
on delete cascade;
create table Idioma(
IDIdioma enum ('ES', 'EU', 'EN', 'FR', 'DE', 'CA', 'GA', 'AR') primary key,
Descripcion char(100) not null
);

create table Cliente(
IDCliente char(5) primary key, 
Nombre varchar(15) not null,
Apellido varchar (15) not null,
Idioma enum ('ES', 'EU', 'EN', 'FR', 'DE', 'CA', 'GA', 'AR') not null,
Usuario varchar(10) not null,
Contraseña varchar(64) not null,
FechaNacimiento date not null,
FechaRegistro date not null,
Tipo enum ('Premium', 'Free') not null,
Constraint fk_Idioma foreign key (Idioma)
references Idioma (IDIdioma) on update cascade
);


create table Playlist (
IDPlaylist int unsigned primary key auto_increment,
Titulo varchar(20) not null,
FechaCreacion date not null,
IDCliente char(5) not null,
Constraint fk_client foreign key (IDCliente)
references Cliente (IDCliente) on update cascade
);


create table Playlist_Canciones(
IDCancion char(5),
IDPlaylist int unsigned auto_increment,
FechaPlaylist_Cancion date not null,
Constraint pk_Playlist primary key (IDCancion, IDPlaylist),
Constraint fk_Cancion foreign key (IDCancion)
references Cancion (IDCancion) on update cascade,
Constraint fk_Playlist foreign key (IDPlaylist)
references Playlist (IDPlaylist) on update cascade
);

create table Favoritos(
IDCliente char(5) not null,
IDAudio char(5) not null,
constraint pk_Favoritos primary key (IDCliente, IDAudio),
constraint fk_Cliente_fav foreign key (IDCliente)
references Cliente (IDCliente) on update cascade,
constraint fk_Audio_fav foreign key (IDAudio)
references Audio (IDAudio) on update cascade
);
drop table if exiSts Favoritos;


create table Premium(
IDCliente char(5) primary key,
FechaCaducidad date not null,
constraint fk_Cliente foreign key (IDCliente)
references Cliente (IDCliente) on update cascade
);

