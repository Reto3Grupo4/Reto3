<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <div class= "podcast_contenedor">
            <h1>Podcasts</h1>
                <xsl:for-each select="podcasts/podcast">
                    <div class= "podcast_datos">
                        <h2><xsl:value-of select="titulo"/></h2>
                        <h3><xsl:value-of select="podcaster"/></h3>
                        <p><xsl:value-of select="colaboradores"/></p>
                        <p><xsl:value-of select="genero"/></p>
                        <p><xsl:value-of select="duracion"/></p>
                    </div>
                </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>