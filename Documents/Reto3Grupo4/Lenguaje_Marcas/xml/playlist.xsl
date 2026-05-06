<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8" />
                <title>Playlists - Aleph App</title>
                <link rel="stylesheet" href="../estilos.css"/>
            </head>
            <body>
                <header>
                    <h1>Playlists</h1>
                    <p>Explora nuestras playlists y encuentra la perfecta para cada momento.</p>
                </header>
            <div class= "playlist_contenedor">
                <xsl:for-each select="PlayLists/PlayList">
                    <div class= "playlist_datos">
                        <h2><xsl:value-of select="IDPlayList"/></h2>
                        <h2><xsl:value-of select="titulo"/></h2>
                        <p><strong>Fecha de Creación:</strong> <xsl:value-of select="fechaCreacion"/></p>
                        <p><strong>IDCliente:</strong> <xsl:value-of select="IDCliente"/></p>
                    </div>
                </xsl:for-each>
            </div>
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