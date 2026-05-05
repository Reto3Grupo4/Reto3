<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <div class= "canciones_contenedor">
            <h1>Canciones</h1>
                <xsl:for-each select="Canciones/cancion">
                    <div class= "cancion_datos">
                        <h2><xsl:value-of select="titulo"/></h2>
                        <h3><xsl:value-of select="artista"/></h3>
                        <p><xsl:value-of select="album"/></p>
                        <p><xsl:value-of select="genero"/></p>
                        <p><xsl:value-of select="duracion"/></p>
                    </div>
                </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>