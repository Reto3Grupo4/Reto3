use destruyespotify;

/*Creación del rol de administrador*/
CREATE ROLE IF NOT EXISTS 'DBADMIN';
GRANT ALL PRIVILEGES ON destruyespotify.* TO 'DBADMIN';

/*Creación del Usuario */
CREATE USER IF NOT EXISTS 
'AdminSpoty'@'localhost' IDENTIFIED BY '12345678aB+';



/*Asignación del rol creado anteriormente*/
GRANT 'DBADMIN' TO 'AdminSpoty'@'localhost';
SET DEFAULT ROLE 'DBADMIN' TO 'AdminSpoty'@'localhost';
show grants for 'AdminSpoty'@'localhost';

FLUSH PRIVILEGES;

CREATE ROLE IF NOT EXISTS 'EmpleSpoty';
GRANT select ON destruyespotify.audio TO 'EmpleSpoty';
GRANT select ON destruyespotify.artista TO 'EmpleSpoty';
GRANT select ON destruyespotify.podcast TO 'EmpleSpoty';
GRANT select ON destruyespotify.playlist TO 'EmpleSpoty';
GRANT select ON destruyespotify.cancion TO 'EmpleSpoty';
GRANT select ON destruyespotify.album TO 'EmpleSpoty';
GRANT select ON destruyespotify.cancion TO 'EmpleSpoty';
GRANT select ON destruyespotify.playlist_canciones TO 'EmpleSpoty';
GRANT select ON destruyespotify.podcaster TO 'EmpleSpoty';

GRANT UPDATE ON destruyespotify.



CREATE USER IF NOT EXISTS 
'EmpleSpoty'@'localhost' IDENTIFIED BY '12345678aB+';