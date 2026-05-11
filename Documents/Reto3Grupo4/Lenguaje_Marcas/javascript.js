function validarLogin(){
    const usuarioValido = 'usuario';
    const contrasenaValida = 'contraseña';
    const nombreUsuario = document.getElementById(usuarioValido).value;
    const contrasena = document.getElementById(contrasenaValida).value;
    if(nombreUsuario === usuarioValido && contrasena === contrasenaValida){
        alert('¡Bienvenido, ' + nombreUsuario + '!');
        window.location.href = 'bienvenida.html';
    }else{
        alert('Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.');
    }
}

async function mostrarArtistas(){

    /*Cargar XML*/
    const respuestaXML = await fetch('xml/artistas.xml');
    const textoXML = await respuestaXML.text();
    const xml = new DOMParser().parseFromString(textoXML, 'application/xml');
    console.log(xml);

    /*Cargar XSL*/
    const respuestaXSL = await fetch('xml/artistas.xsl');
    const textoXSL = await respuestaXSL.text();
    const xsl = new DOMParser().parseFromString(textoXSL, 'application/xml');
    console.log(xsl);

    /*Transformar XML con XSL*/
    const procesador = new XSLTProcessor();
    procesador.importStylesheet(xsl);
    const resultado = procesador.transformToFragment(xml, document);
    console.log(resultado);

    document.getElementById('contenedor-xml').appendChild(resultado);  
}

mostrarArtistas();
