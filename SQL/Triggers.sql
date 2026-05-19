use DestruyeSpotify;

drop Trigger encriptador; //
delimiter //
CREATE TRIGGER encriptador
BEFORE INSERT ON Cliente
FOR EACH ROW
SET NEW.Contraseña = sha2(NEW.Contraseña, 256);
end//


drop trigger creacionIDCliente;//
delimiter //
CREATE TRIGGER creacionIDCliente
BEFORE INSERT ON Cliente
FOR EACH ROW
BEGIN
	Declare ultimo_numero int;
	IF NEW.IDCliente is null OR NEW.IDCliente = '' THEN
		
        select ifnull(max(cast(substring(IDCliente, 2) as unsigned)), 0)
		INTO ultimo_numero FROM Cliente;
		SET NEW.IDCliente = concat('C', LPAD(ultimo_numero + 1, 4, '0'));
	
    END IF;
END; //


drop trigger creacionIDAudio;//
delimiter //
CREATE TRIGGER creacionIDAudio
BEFORE INSERT ON Audio
FOR EACH ROW
BEGIN
	Declare ultimo_numero int;
	IF NEW.IDAudio is null OR NEW.IDAudio = '' THEN
		
        select ifnull(max(cast(substring(IDAudio, 3) as unsigned)), 0)
		INTO ultimo_numero FROM Audio;
		SET NEW.IDAudio= concat('AU', LPAD(ultimo_numero + 1, 3, '0'));
	
    END IF;
END; //

drop trigger creacionIDArtista;//
delimiter //
CREATE TRIGGER creacionIDArtista
BEFORE INSERT ON Artista
FOR EACH ROW
BEGIN
	Declare ultimo_numero int;
	IF NEW.IDArtista is null OR NEW.IDArtista= '' THEN
		
        select ifnull(max(cast(substring(IDArtista, 2) as unsigned)), 0)
		INTO ultimo_numero FROM Artista;
		SET NEW.IDArtista= concat('A', LPAD(ultimo_numero + 1, 4, '0'));
	
    END IF;
END;//

drop trigger creacionIDAlbum;//
delimiter //
CREATE TRIGGER creacionIDAlbum
BEFORE INSERT ON Album
FOR EACH ROW
BEGIN
	Declare ultimo_numero int;
	IF NEW.IDAlbum is null OR NEW.IDAlbum= '' THEN
		
        select ifnull(max(cast(substring(IDAlbum, 4) as unsigned)), 0)
		INTO ultimo_numero FROM Album;
		SET NEW.IDAlbum= concat('ALB', LPAD(ultimo_numero + 1, 3, '0'));
	
    END IF;
END;//

