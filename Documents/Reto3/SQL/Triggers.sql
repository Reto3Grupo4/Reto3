use DestruyeSpotify;

CREATE TRIGGER encriptador
BEFORE INSERT ON Cliente
FOR EACH ROW
SET NEW.Contraseña = sha2(NEW.Contraseña, 256);
drop Trigger encriptador;
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
END //