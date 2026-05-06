<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html lang="es">
            <head>
                <meta charset="UTF-8" />
                <title>Canciones - Destruye Spotify</title>
                <link rel="stylesheet" href="../estilos.css"/>
            </head>
            <body>
                <header>
                    <h1>Descubre Nuevas Canciones</h1>
                    <p>Explora nuestra colección de canciones y encuentra tu próxima favorita.</p>
                </header>
                <main class="canciones_contenedor">
                    <xsl:for-each select="canciones/cancion">
                        <article class="cancion-datos"> <h2><xsl:value-of select="titulo"/></h2>
                            <h3><xsl:value-of select="artista"/></h3>
                            <p><strong>Álbum:</strong> <xsl:value-of select="album"/></p>
                            <p><strong>Género:</strong> <xsl:value-of select="genero"/></p>
                            <span class="reproducciones">
                                <xsl:value-of select="duracion"/>
                            </span>
                        </article>
                    </xsl:for-each>
                </main>

                <section class="descarga">
                    <h2>¿Quieres descargar esta canción?</h2>
                    <p>Haz clic en el botón de abajo para descargarla.</p>
                    <a href="#" class="btn-descargar">Descargar</a>
                </section>
                <br/>
                 <section class="navegacion">
                    <a href="../menu.html" class="btn-menu">Ir al Menu</a>
                    <br/>
                    <a href="../index.html">Volver a la página principal</a>
                </section> 
                
                <footer>
                    <p>© 2026 Aleph App. Todos los derechos reservados.</p>
                </footer>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>