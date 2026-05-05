use destruyeSpotify;
create view clienteSecured 
as select	IDCliente, 
			Nombre, 
            Apellido, 
            Idioma, 
            Usuario, 
            FechaNacimiento, 
            FechaRegistro, 
            Tipo
from Cliente;

Select * from clienteSecured;

drop view masEscuchado;

create view masEscuchado
as select	nombreArtistico, Nreproducciones as 'mas_escuchado'
from		Audio A join Artista AR on A.IDArtista = AR.IDArtista
order by Nreproducciones desc;

select * from masEscuchado;

select Nreproducciones from Audio
order by Nreproducciones desc;