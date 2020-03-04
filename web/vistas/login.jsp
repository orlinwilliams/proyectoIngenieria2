<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8"/>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Iniciar sesi�n|AvisosHN</title>
        <!-- Favicon-->
        <link rel="icon" href="faviconOtros/favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body class="login-page">
        <div class="login-box">
            <div class="logo">
                <a href="javascript:void(0);">Avisos<b>HN</b></a>
                <small>Tu sitio de compra y venta favorito</small>
            </div>
            <div class="card">
                <div class="body">
                    <form id="sign_in" method="POST">
                        <div class="msg">Ingresa tus datos para iniciar sesi�n</div>
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="material-icons">person</i>
                            </span>
                            <div class="form-line">
                                <input type="text" class="form-control" id="correo" name="correo" placeholder="Correo electr�nico" required autofocus>
                            </div>
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="material-icons">lock</i>
                            </span>
                            <div class="form-line">
                                <input type="password" class="form-control" id="password" name="password" placeholder="Contrase�a" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-8 p-t-5">
                                <input type="checkbox" name="rememberme" id="Recuerdame" class="filled-in chk-col-pink">
                                <label for="rememberme">Remember Me</label>
                            </div>
                            <div class="col-xs-4">
                                <input class="btn btn-block bg-pink waves-effect" onclick="validar();" value="Ingresar">
                            </div>
                        </div>
                        <div class="row m-t-15 m-b--20">
                            <div class="col-xs-6">
                                <a href="registro.jsp">Registrate ahora!</a>
                            </div>
                            <div class="col-xs-6 align-right">
                                <a href="forgot-password.html">�Olvidaste tu contrase�a?</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Jquery Core Js -->
        <script src="/plugins/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core Js -->
        <script src="/plugins/bootstrap/js/bootstrap.js"></script>

        <!-- Waves Effect Plugin Js -->
        <script src="/plugins/node-waves/waves.js"></script>

        <!-- Validation Plugin Js -->
        <script src="/plugins/jquery-validation/jquery.validate.js"></script>

        <!-- Custom Js -->
        <script src="js/admin.js"></script>
        <script src="js/pages/examples/sign-in.js"></script>
        
        <script>
            function validar(){
                var correo = $("#correo").val();
                var contrase�a = $("#password").val();
                
                if(isValidEmail(correo) && isValidContrase�a(contrase�a)){
                    alert("los campos ingresados son validos");
                    let datos = '{"correo":"'+correo+'","contrase�a":"'+contrase�a+'"}';
                    var json = JSON.parse(datos);
                    $.get("loginController.jsp",json,function (respuesta){
                        alert(respuesta);
                    });
                }else{
                    alert("los campos ingresados no son validos");
                }
                
            }
            
            function isValidEmail(correo) { 
                let estado = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/.test(correo);
                if (!estado) {
                    alert("El correo ingresado no es valido");
                }
                return estado; 
            }
            function isValidContrase�a(password) { 
                let estado = /^(?=.*\d)(?=.*[\u0021-\u002b\u003c-\u0040])(?=.*[A-Z])(?=.*[a-z])\S{8,16}$/.test(password);
                if (!estado) {
                    alert("La contrase�a ingresada no es valida");
                }
                return estado; 
            }
            
        </script>
    </body>

</html>