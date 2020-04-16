/* varification of login*/
var username="username";
var password="password";
var errmsg="Sorry! Wrong username and password";
function checklogin(form)
{
if(form.username.value==username && form.password.value==password)
{
alert("Log in successful");
window.location=("success.html");
}
else if(form.username.value=="" && form.password.value=="")
{
alert("Please enter your username and password");
}
else if(form.username .value=="")
{
alert("Please enter your username");
}
else if(form.password.value=="")
{
alert("Please enter your password");
}
else
{
alert(errmsg);
}
}