use destruyespotify;

CREATE TRIGGER encriptador
BEFORE INSERT ON cliente
FOR EACH ROW
SET NEW.Contraseña = sha2(NEW.Contraseña, 256);

