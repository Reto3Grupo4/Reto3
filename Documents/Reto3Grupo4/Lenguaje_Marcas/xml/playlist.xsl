<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <div class= "playlist_contenedor">
            <h1>Playlists</h1>
            <xsl:for-each select="PlayLists/PlayList">
                <div class= "playlist_datos">
                    <img src="/img/Kaze.jpg" alt="Kaze"/>
                    <h2><xsl:value-of select="IDPlayList"/></h2>
                    <h2><xsl:value-of select="titulo"/></h2>
                    <p><strong>Fecha de Creación:</strong> <xsl:value-of select="fechaCreacion"/></p>
                    <p><strong>Descripción:</strong> <xsl:value-of select="IDCliente"/></p>
                </div>
            </xsl:for-each>
        </div>
    </xsl:template>
</xsl:stylesheet>