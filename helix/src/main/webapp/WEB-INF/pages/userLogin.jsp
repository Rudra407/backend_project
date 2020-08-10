<html>
<body>

Hello User!. Login at

<br>
<br>

<div id = "time">
</div>

<br>
<br>

<div>
<marquee>"Made with love by Rudra Mishra"</marquee>
</div>

<script type = "text/javascript">
function showTime(){

document.getElementById("time").innerText = new Date().toString();

}
setInterval(showTime, 1000);

</script>

</body>

</html>