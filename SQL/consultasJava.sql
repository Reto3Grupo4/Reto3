use DestruyeSpotify;
select	AR.nombreArtistico,
		sum(A.Nreproducciones) as 'reproducciones'
from	Audio A join Artista AR 
					on A.IDArtista = AR.IDArtista
				join Musico M 
					on AR.IDArtista = M.IDMusico
group by nombreArtistico;


select AL.Titulo, year(AL.Año), count(C.IDCancion)
from Album AL left join Cancion C on AL.IDAlbum = C.IDAlbum
where IDMusico = ?
group by AL.Titulo, AL.Año, AL.Genero;


select P.Titulo from Playlist P 
where IDCliente = (select IDCliente From Cliente where Usuario = 'carlosg');


insert into Cancion (IDCancion) values