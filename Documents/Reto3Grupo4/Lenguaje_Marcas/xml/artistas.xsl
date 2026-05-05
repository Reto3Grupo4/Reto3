<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <div class="artistas-contenedor">
            <h1>Artistas Destacados</h1>
            <xsl:for-each select="artistas/artista">
                <article class="artista-carta">
                    <img src="{imagen}" alt="{nombre}"/>
                    <h2><xsl:value-of select="nombre"/></h2>
                    <p><strong>Género:</strong> <xsl:value-of select="genero"/></p>
                    <div class="info-album">
                        <p><strong>Titulo:</strong> <xsl:value-of select="album/titulo"/></p>
                        <p><strong>Año:</strong> <xsl:value-of select="album/año"/></p>
                        <p class="reproducciones"><strong>Reproducciones:</strong> <xsl:value-of select="album/reproducciones"/></p>
                    </div>
                </article>
            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>