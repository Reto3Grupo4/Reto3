use destruyeSpotify;

/*Creación del rol de administrador, además de sus permisos*/
CREATE ROLE IF NOT EXISTS DBADMIN;
GRANT ALL PRIVILEGES ON destruyeSpotify.* TO DBADMIN;

/*Creación del Usuario DBADMIN, junto con sus asignaciones*/
CREATE USER IF NOT EXISTS 
'AdminSpoty'@'localhost' IDENTIFIED BY '12345678Ab+';
GRANT DBADMIN TO 'AdminSpoty'@'localhost';
SET DEFAULT ROLE DBADMIN TO 'AdminSpoty'@'localhost';
show grants for 'AdminSpoty'@'localhost';
FLUSH PRIVILEGES;

/*creacion del rol EmpleSpoty, junto con sus permisos*/
CREATE ROLE IF NOT EXISTS EmpleSpoty;
GRANT select, update ON DestruyeSpotify.Audio TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Artista TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Podcast TO EmpleSpoty;
GRANT select, update ON DestruyeSpotify.Playlist TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Cancion TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Album TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Cancion TO EmpleSpoty;
GRANT select, update ON DestruyeSpotify.Playlist_Canciones TO EmpleSpoty;
GRANT select ON DestruyeSpotify.Podcaster TO EmpleSpoty;

/*creacion de Usuario empleado, ademas de otorgación del rol EmpleSpoty*/
CREATE USER IF NOT EXISTS 
'Empleado'@'localhost' IDENTIFIED BY '12345678Ab+';
GRANT EmpleSpoty TO 'Empleado'@'localhost';
SET DEFAULT ROLE EmpleSpoty TO 'Empleado'@'localhost';
show grants for 'Empleado'@'localhost';
FLUSH PRIVILEGES;

/*creacion del rol 'Cliente_rol' junto con sus permisos*/
CREATE ROLE IF NOT EXISTS Cliente_rol;
GRANT select ON DestruyeSpotify.Artista TO Cliente_rol;
GRANT select, insert ON DestruyeSpotify.Playlist TO Cliente_rol;
GRANT select, insert ON DestruyeSpotify.Playlist_Canciones TO Cliente_rol;
GRANT select ON DestruyeSpotify.Album TO Cliente_rol;
GRANT select ON DestruyeSpotify.Cancion TO Cliente_rol;
GRANT select, insert, delete ON DestruyeSpotify.Favoritos TO Cliente_rol; 

FLUSH PRIVILEGES;
/*creacion de Usuario free, ademas de otorgación del rol Cliente_rol*/
CREATE USER IF NOT EXISTS 
'ClienteFree'@'localhost' IDENTIFIED BY '12345678Ab+';
GRANT Cliente_rol TO 'ClienteFree'@'localhost';
SET DEFAULT ROLE Cliente_rol TO 'ClienteFree'@'localhost';
show grants for 'ClienteFree'@'localhost';

FLUSH PRIVILEGES;

/*creacion de Usuario premium, ademas de otorgación del rol Cliente_rol*/
CREATE USER IF NOT EXISTS 
'ClientePremium'@'localhost' IDENTIFIED BY '12345678Ab+';
GRANT Cliente_rol TO 'ClientePremium'@'localhost';
SET DEFAULT ROLE Cliente_rol TO 'ClientePremium'@'localhost';
show grants for 'ClientePremium'@'localhost';

FLUSH PRIVILEGES;