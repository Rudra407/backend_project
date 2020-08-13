 <html>

<link rel="shortcut icon" type="image/png" href="/static/images/favicon.ico"/>

    <head>

        <script
          src="https://code.jquery.com/jquery-3.5.1.min.js"
          integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
          crossorigin="anonymous"></script>

        <style>
            @import url('https://fonts.googleapis.com/css2?family=Lato:wght@400;700;900&display=swap');

            * {
              margin: 0;
              padding: 0;
            }

            html {
              font-family: 'Lato', Arial, Helvetica, sans-serif;
              font-size: 10px;
              font-weight: 400;
            }

            body {
              min-height: 100vh;
              min-width: 100vw;
              background-image: -webkit-linear-gradient(45deg, #00acee 0%, #00acee 100%);
              background-image: -moz-linear-gradient(45deg, #00acee 0%, #00acee 100%);
              background-image: linear-gradient(45deg, #00acee 0%, #00acee 100%);
              display: flex;
              justify-content: center;
              align-items: center;
            }

            #signup-box {
              background-color: #fff;
              border-radius: 30px;
              -webkit-box-shadow: 0px 0px 76px 0px rgba(0, 0, 0, 0.20);
              -moz-box-shadow: 0px 0px 76px 0px rgba(0, 0, 0, 0.20);
              box-shadow: 0px 0px 76px 0px rgba(0, 0, 0, 0.20);
              text-align: center;
              height: 100%;
              max-width: 422px;
              width: 45%;
              margin: 30px 0;
            }

            #signup-box h1 {
              color: #00acee;
              font-size: 1.8rem;
              font-weight: 900;
              margin-top: 40px;
            }

            #signup-box p {
              color: #222;
              font-size: 1.6rem;
              margin: 5px 0 30px 0;
              padding: 0 15%;
            }

            #signup-form {
              width: 70%;
              margin: auto;
              text-align: left;
              font-size: 14px;
            }

            #signup-form label {
              color: #222;
              font-weight: 700;
              padding-left: 10px;
            }

            #signup-form input {
              height: 35px;
              width: calc(100% - 10px);
              border: 1px solid #b4b4b4;
              border-radius: 5px;
              margin: 6px 0 20px 0;
              padding-left: 10px;
              outline: none;
            }

            #signup-form input::placeholder {
              color: #b4b4b4;
            }

            #signup-form button {
              background-image: -webkit-linear-gradient(-45deg, #00acee 0%, #00acee 100%);
              background-image: -moz-linear-gradient(-45deg, #00acee 0%, #00acee 100%);
              background-image: linear-gradient(-45deg, #00acee 0%, #00acee 100%);
              border: none;
              border-radius: 30px;
              color: #fff;
              cursor: pointer;
              outline: none;
              height: 45px;
              width: 100px;
              display: block;
              margin: auto;
              margin-bottom: 40px;

              font-size: 1.6rem;
              font-weight: 600;
            }

            #signup-form button:hover {
              background-image: -webkit-linear-gradient(45deg, #00acee 0%, #00acee 100%);
              background-image: -moz-linear-gradient(45deg, #00acee 0%, #00acee 100%);
              background-image: linear-gradient(45deg, #00acee 0%, #00acee 100%);
              -webkit-box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.3);
              -moz-box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.3);
              box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.3);
            }

            @media screen and (max-width: 800px) {
              #signup-box {
                width: 70%;
              }
            }

            @media screen and (max-width: 600px) {
              #signup-box {
                max-width: none;
                width: 100%;
                border-radius: unset;
                box-shadow: none;
              }
            }
        </style>
    </head>

    <body>
        <section id="signup-box">
          <h1>Create your  account</h1>
          <p>Welcome to the social network of youth!. Get connected.</p>
          <form id="signup-form">
            <label for="name">Name</label><br>
            <input id = "signup-name" type="text" name="name" placeholder="Your name"><br>
            <label for="email">Email</label><br>
            <input id = "signup-email" type="email" name="email" placeholder="Fill your email"><br>
            <label for="password">Password</label><br>
            <input id = "signup-password" type="password" name="name" placeholder="Fill your password"><br>

            <p style = "color:red; display:none" id = "signup-error">hhgfhgf</p>

            <button type="button" id = "btn-signup">Sign UP</button>
          </form>
        </section>

        <script>

            function validateSignupForm(){
                var name = $("#signup-name").val();
                var email = $("#signup-email").val();
                var password = $("#signup-password").val();

                var error = "";

                //if name is empty
                if(!name){
                    error += "Name is empty.";
                }
                if(!email){
                    error += "Email is empty.";
                }
                if(!password){
                    error += "Password is empty.";
                }
                if(password.length <= 6){
                    error += "Password length must be greater than 6 characters."
                }

                $("#signup-error").html(error);

                if(error.length > 0){
                    return false;
                }

                return true;
            }

            $("#btn-signup").click(function(){

                var isFormValid = validateSignupForm();

                if(isFormValid){
                    $("#signup-error").hide();

                    var name = $("#signup-name").val();
                    var email = $("#signup-email").val();
                    var password = $("#signup-password").val();

                    var user = {
                        "name" : name,
                        "email" : email,
                        "password" : password
                    };

                    $.ajax({
                        type: "POST",
                        url: "/signup",
                        data: JSON.stringify(user),
                        success: function(response){
                            if(!!response){
                                alert(response.message);
                            }
                        },
                        contentType: 'application/json'
                    });
                }else{
                    $("#signup-error").show();

                }

            });

        </script>

    </body>
 </html>