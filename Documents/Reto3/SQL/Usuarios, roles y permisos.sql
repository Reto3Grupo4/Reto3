use destruyespotify;

/*Creación del rol de administrador*/
CREATE ROLE IF NOT EXISTS 'DBADMIN';
GRANT ALL PRIVILEGES ON destruyespotify.* TO 'DBADMIN';

/*Creación del Usuario */
CREATE USER IF NOT EXISTS 
'AdminSpoty'@'localhost' IDENTIFIED BY '1234';

/*Asignación del rol creado anteriormente*/
GRANT 'DBADMIN' TO 'AdminSpoty'@'localhost';
SET DEFAULT ROLE 'DBADMIN' TO 'AdminSpoty'@'localhost';
show grants for 'AdminSpoty'@'localhost';

FLUSH PRIVILEGES;

CREATE ROLE IF NOT EXISTS 'EmpleSpoty';
GRANT select, update ON destruyespotify.audio TO 'EmpleSpoty';
GRANT select ON destruyespotify.artista TO 'EmpleSpoty';
GRANT select ON destruyespotify.podcast TO 'EmpleSpoty';
GRANT select, update ON destruyespotify.playlist TO 'EmpleSpoty';
GRANT select ON destruyespotify.cancion TO 'EmpleSpoty';
GRANT select ON destruyespotify.album TO 'EmpleSpoty';
GRANT select ON destruyespotify.cancion TO 'EmpleSpoty';
GRANT select, update ON destruyespotify.playlist_canciones TO 'EmpleSpoty';
GRANT select ON destruyespotify.podcaster TO 'EmpleSpoty';

CREATE USER IF NOT EXISTS 
'Empleado'@'localhost' IDENTIFIED BY '1234';

GRANT 'EmpleSpoty' TO 'Empleado'@'localhost';
SET DEFAULT ROLE 'EmpleSpoty' TO 'Empleado'@'localhost';
show grants for 'Empleado'@'localhost';

FLUSH PRIVILEGES;

CREATE ROLE IF NOT EXISTS 'CLIENTEFree_ROLE';
GRANT select ON destruyespotify.artista TO 'CLIENTE_ROLE';
GRANT select, insert ON destruyespotify.playlist TO 'CLIENTE_ROLE';
GRANT select, insert ON destruyespotify.playlist_canciones TO 'CLIENTE_ROLE';
GRANT select ON destruyespotify.album TO 'CLIENTE_ROLE';
GRANT select ON destruyespotify.cancion TO 'CLIENTE_ROLE';
GRANT select, insert ON destruyespotify.favoritos TO 'CLIENTE_ROLE'; 

CREATE USER IF NOT EXISTS 
'ClienteFree'@'localhost' IDENTIFIED BY '1234';
GRANT 'CLIENTE_ROLE' TO 'ClienteFree'@'localhost';
SET DEFAULT ROLE 'CLIENTE_ROLE' TO 'ClienteFree'@'localhost';
show grants for 'ClienteFree'@'localhost';

FLUSH PRIVILEGES;

CREATE USER IF NOT EXISTS 
'ClientePremium'@'localhost' IDENTIFIED BY '1234';
GRANT 'CLIENTE_ROLE' TO 'ClientePremium'@'localhost';
SET DEFAULT ROLE 'CLIENTE_ROLE' TO 'ClientePremium'@'localhost';
show grants for 'ClientePremium'@'localhost';

FLUSH PRIVILEGES;