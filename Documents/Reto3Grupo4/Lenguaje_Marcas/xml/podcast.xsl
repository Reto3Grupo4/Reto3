<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
    <html>
        <head>
            <meta charset="UTF-8" />
            <title>Podcasts - Aleph App</title>
            <link rel="stylesheet" href="../estilos.css"/>
        </head>
        <body>
            <header>
                <h1>Podcasts</h1>
                <p>Explora nuestros podcasts</p>
            </header>
            
            <main class="podcast_contenedor">
                <xsl:for-each select="podcasts/podcast">
                    <div class="podcast_datos">
                        <h2><xsl:value-of select="titulo"/></h2>
                        <h3><xsl:value-of select="podcaster"/></h3>
                        <p><strong>Colaboradores:</strong> <xsl:value-of select="colaboradores"/></p>
                        <p><strong>Género:</strong> <xsl:value-of select="genero"/></p>
                        <p><xsl:value-of select="duracion"/></p>
                    </div>
                </xsl:for-each>
            </main>

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