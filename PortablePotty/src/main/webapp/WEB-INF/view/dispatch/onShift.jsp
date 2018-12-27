<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Portable Potty</title>
	
	<base href="/">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/x-icon" href="images/profilePicture.png">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<link rel="stylesheet" type="text/css" href="/css/dispatcher-onshift-style.css">
	
		
</head>
<body>
	<div id="header">
		<nav>		
			<ul>		
				<li>Welcome, ${employee}</li>
				<li><a href="/login.html">Sign In</a></li>
				
			</ul>
			<br>
		<H1>Portable Potty</H1>	
		</nav>
		
	</div>
	
	<div class="body">
		<h2>Dispatcher Control</h2>
		
		Day: ${days}
		<form action="/dispatch/onShift" method="POST" id="dayForm">
			<input type="submit" value="Go!">
		</form>
		<br>
		
		<div class="tab">
			${drivers}

		</div>
		
		${runList}


		
		
		
		
		
		
		<a href="/dispatch/endShift.html"><button id="doneCallsButton">Done Calls</button></a>
	</div>	

	

	<div class="footer">

			<div id="contactInfo">
				<H2>Contact Me</H2>

				Email me @ <a href="mailto:harold.macdonald52@gmail.com">harold.macdonald52@gmail.com</a> <br>
				tel: (403) 606-3504 <br><br>
			</div>  
	</div>


<script>
function openDriver(evt, driverName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(driverName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>


</body>
</html>
