window.addEventListener('load',function (){
    formulario=document.querySelector("#add_new_jugador");
    formulario.addEventListener('submit',function(event){
        const formData={
            nombre:document.getElementById("nombreJugador"),
            apellido:document.getElementById("apellidoJugador"),
            fechaNacimiento:document.getElementById("fechaN"),
            telefono:document.getElementById("telefono"),
            correo:document.getElementById("correo"),
            usuario:document.getElementById("nombreUsario"),
            contrasenia:document.getElementById("contrasenia"),
        }

        const url='/jugadores';
        const settings={
            method:'POST',
            headers:{
                'Content-Type':'application/json',
            },
            body:JSON.stringify(formData)
        }
        fetch(url,settings)
            .then(response=>response.json())
            .then(data=>{
                let successAlert = '<div class="alert alert-success alert-dismissible">' +
                    '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                    '<strong></strong> Jugador agregado Exitosamente </div>'
                document.querySelector('#response').innerHTML=successAlert;
                document.querySelector('#response').style.display="block";
                resetUploadForm();
            })
            .catch(error=>{
                let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                    '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                    '<strong> Error intente nuevamente</strong> </div>'

                document.querySelector('#response').innerHTML = errorAlert;
                document.querySelector('#response').style.display = "block";
                resetUploadForm();})
            });
    function resetUploadForm(){
        document.querySelector('#nombreJugador').value="";
        document.querySelector('#apellidoJugador').value="";
        document.querySelector('#fechaN').value="";
        document.querySelector('#telefono').value="";
        document.querySelector('#correo').value="";
        document.querySelector('#nombreUsario').value="";
        document.querySelector('#contrasenia').value="";
    }
    (function(){
        console.log("Holas123");
    })
})