use destruyeSpotify;

/*Creación del rol de administrador*/
CREATE ROLE IF NOT EXISTS 'DBADMIN';
GRANT ALL PRIVILEGES ON destruyeSpotify.* TO 'DBADMIN';

/*Creación del Usuario */
CREATE USER IF NOT EXISTS 
'AdminSpoty'@'localhost' IDENTIFIED BY '12345678Ab+';

/*Asignación del rol creado anteriormente*/
GRANT 'DBADMIN' TO 'AdminSpoty'@'localhost';
SET DEFAULT ROLE 'DBADMIN' TO 'AdminSpoty'@'localhost';
show grants for 'AdminSpoty'@'localhost';

FLUSH PRIVILEGES;

CREATE ROLE IF NOT EXISTS 'EmpleSpoty';
GRANT select, update ON destruyeSpotify.Audio TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Artista TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Podcast TO 'EmpleSpoty';
GRANT select, update ON destruyeSpotify.Playlist TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Cancion TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Album TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Cancion TO 'EmpleSpoty';
GRANT select, update ON destruyeSpotify.Playlist_Canciones TO 'EmpleSpoty';
GRANT select ON destruyeSpotify.Podcaster TO 'EmpleSpoty';

CREATE USER IF NOT EXISTS 
'Empleado'@'localhost' IDENTIFIED BY '12345678Ab+';

GRANT 'EmpleSpoty' TO 'Empleado'@'localhost';
SET DEFAULT ROLE 'EmpleSpoty' TO 'Empleado'@'localhost';
show grants for 'Empleado'@'localhost';

FLUSH PRIVILEGES;

CREATE ROLE IF NOT EXISTS 'CLIENTEFree_ROLE';
GRANT select ON destruyeSpotify.Artista TO 'CLIENTEFree_ROLE';
GRANT select, insert ON destruyeSpotify.Playlist TO 'CLIENTEFree_ROLE';
GRANT select, insert ON destruyeSpotify.Playlist_Canciones TO 'CLIENTEFree_ROLE';
GRANT select ON destruyeSpotify.Album TO 'CLIENTEFree_ROLE';
GRANT select ON destruyeSpotify.Cancion TO 'CLIENTEFree_ROLE';
GRANT select, insert, delete ON destruyeSpotify.Favoritos TO 'CLIENTEFree_ROLE'; 

CREATE USER IF NOT EXISTS 
'ClienteFree'@'localhost' IDENTIFIED BY '12345678Ab+';
GRANT 'CLIENTEFree_ROLE' TO 'ClienteFree'@'localhost';
SET DEFAULT ROLE 'CLIENTEFree_ROLE' TO 'ClienteFree'@'localhost';
show grants for 'ClienteFree'@'localhost';

FLUSH PRIVILEGES;
revoke 'CLIENTEFree_ROLE' from 'ClienteFree'@'localhost';
CREATE ROLE IF NOT EXISTS 'CLIENTEPremium_ROLE';
 
CREATE USER IF NOT EXISTS 
'ClientePremium'@'localhost' IDENTIFIED BY '1234';
GRANT 'CLIENTE_ROLE' TO 'ClientePremium'@'localhost';
SET DEFAULT ROLE 'CLIENTE_ROLE' TO 'ClientePremium'@'localhost';
show grants for 'ClientePremium'@'localhost';

FLUSH PRIVILEGES;