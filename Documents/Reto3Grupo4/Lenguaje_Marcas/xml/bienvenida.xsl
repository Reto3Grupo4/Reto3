<?xml version=“1.0”?>
<xsl:stylesheet version=“1.0” xmlns:xsl= "http://www.w3.org/1999/XSL/Transform" >
    <xsl:template match="/">
        <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Bienvenida</title>
                <link rel="stylesheet" href="estilos.css">
            </head>
            <body>
                <header>
                    <h1>Bienvenid@ a Nuestra App</h1>
                </header>
                <p>Gracias por iniciar sesión, disfruta de tu música favorita y descubre nuevos artistas.</p>
                <h3>¿Qué quieres hacer ahora?</h3>
                <section>
                    <a href="menu.html" class="btn-menu">Ir al Menu</a>
                    </br>
                    <a href="index.html">Volver a la página principal</a>
                </section> 

                <footer>
                    <p>&copy; 2026 Nuestra App. Todos los derechos reservados.</p>
                </footer>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>