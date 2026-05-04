function validarLogin(){
    const usuarioValido = 'usuario';
    const contrasenaValida = 'contraseña';
    const nombreUsuario = document.getElementById(usuarioValido).value;
    const contrasena = document.getElementById(contrasenaValida).value;
    if(nombreUsuario === usuarioValido && contrasena === contrasenaValida){
        alert('¡Bienvenido, ' + nombreUsuario + '!');
        window.location.href = 'bienvenida.html';
    }
}