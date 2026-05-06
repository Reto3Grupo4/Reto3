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
as select	nombreArtistico, sum(Nreproducciones) as 'mas_escuchado'
from		Audio A join Artista AR on A.IDArtista = AR.IDArtista
group by nombreArtistico;

select * from masEscuchado
order by mas_escuchado Desc;

select Nreproducciones from Audio
order by Nreproducciones desc;