use DestruyeSpotify;


delimiter //
create procedure ActualizarPefil()
begin
	declare v_id_cliente char(5);
    declare v_nombre varchar(15);
    declare v_apellido varchar(15);
    declare v_idioma enum('ES','EU','EN','FR','DE','CA','GA','AR');
    update Cliente
    set Nombre = v_nombre,
		Apellido = v_apellido,
        Idioma = v_idioma
	where IDCliente = v_id_cliente;
end //

delimiter ;

delimiter //
create procedure CancionesMasEscuchadas(in v_limite int)
begin
	select 
		A.Nombre as Cancion, AR.NombreArtistico as Artista,
        count(A.NReproducciones) as 'Reproducciones totales'
	from Audio A join Artista AR on A.IDArtista = AR.IDArtista
    group by A.IDAudio
    order by 'Reproducciones totales' desc
    limit v_limite;
end //

delimiter //

create procedure GestionarArtista(in v_opcion varchar(10))
begin 
declare v_id_artista int;
declare v_nombre varchar(100);
declare v_descripcion varchar(255);
declare v_imagen varchar(255);
declare v_tipo varchar(20);
case v_opcion when 'insert' then 
					insert into Artista(NombreArtistico, Descripcion, Imagen)
					values(v_nombre, v_descripcion, v_imagen);
					if v_tipo = 'Musico' then
						insert into Musico(IDMusico) values(last_insert_id());
					elseif v_tipo = 'Podcaster' then
						insert into Podcaster(IDPodcaster) values(last_insert_id());
					end if;
			when 'update' then
					update Artista
                    set NombreArtistico = v_nombre,
						Descripcion = v_descripcion,
                        Imagen = v_imagen
					where IDArtista = v_id_artista;
			when 'delete' then
					delete from Musico where IDMusico = v_id_artista;
                    delete from Podcaster where IDPodcaster = v_id_artista;
                    delete from Artista where IDArtista = v_id_artista;
end case;
end //

delimiter ;

call GestionarArtista()				
				