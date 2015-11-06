var e = document.getElementById("main");

var color = 0;

setInterval(function () {
	color = color + 1 % 360;
	        e.style.backgroundColor = "hsl(" + color + ", 100%, 50%)";
	    }, 50);
