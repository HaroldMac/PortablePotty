<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Portable Potty</title>
	
	<base href="/">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/x-icon" href="images/profilePicture.png">
	<style type="text/css">
	
	html {
	  height: 100%;
	  box-sizing: border-box;
	  background-color: #595959;
	  color: #fcfcfc;

	}
	
	*,
	*:before,
	*:after {
	  box-sizing: inherit;
	}
	
	/**
	 * Header Styles
	 */
	
	nav {
		list-style-type: none;
		font-family: "Times New Roman", Times, serif;
		font-size: 1.25em;
	    overflow: hidden;
	    background-color: #333;
	}
	
	nav ul{
		padding: 0;
		list-style-type: none;
		margin: 0.5em 0;
		top: 0;
		width: 73.5%;
		text-align: center;
	}
	
	nav li{
		display: inline;
		float: right;
		
	
	}
	
	.active{
		background-color: #4CAF50;
	}
	
	nav li a{
		padding: 0.5em 0 0.5em 0.5em;
		display: block;
		width: 90px;
		text-align: center;
	}
	
	nav li:hover{
		background-color: #22A39F;
		color: #000000;
	}
	
	nav h1{
		font-size: 3em;
		padding: 0.5em 0.5em 0.5em 1.5em;
		margin: 0;
		text-align: center;
	}
		
	/**
	 * Body Styles
	 */
	
	
	body {
	  position: relative;
	  margin: 0;
	  padding-bottom: 9.8rem;
	  min-height: 100%;
	  font-family: "Helvetica Neue", Arial, sans-serif;
	}
	
	.body ul{
		text-align: center;
	}
	p{
		text-align: left;
	}
	
	.body {
	  margin: 0 auto;
	  padding-top: 20px;
	  max-width: 50%;
	  width: 94%;
	  text-align: center;
	}
	
	.body h1 {
	  margin-top: 0;
	}
	
	.body p {
	  text-align: center;
	  margin: 1em 1em 0.5em 1em;
	}
	
	.body table{
		border: 2px;
	}
	
	.boxes{
		text-align: right;
	}
	
	#calls {
  		font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  		border-collapse: collapse;
  		width: 100%;
	}

	#calls td, #calls th {
  		border: 1px solid #ddd;
  		padding: 0.25em;
	}

	#calls tr:nth-child(even){
		background-color: gray;
	}

	#calls tr:hover {background-color: #ddd;}

	#calls th {
  		padding-top: 12px;
  		padding-bottom: 12px;
  		text-align: center;
  		background-color: #333;
	}
	
	#doneCallsButton{
		border: outset;
		font-size: 2em;
		color: #fcfcfc;
		cursor: pointer;
		position: relative;
		margin: 0.25em;	
		font-family: "Helvetica Neue", Arial, sans-serif;
	}
	
	#doneCallsButton {
		box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
	}
	
		
	/**
	 * Footer Styles
	 */
	
	.footer {
	  position: absolute;
	  right: 0;
	  bottom: 0;
	  left: 0;
	  padding: 1rem;
	  background-color: #333;
	  text-align: center;
	}
	
	#container {
	   height:100%;
	}
	
	/**
	 * Header Responsive Styles
	 */

	if (/mobile/i.test(navigator.userAgent)) {
		nav ul{
			position: absolute;
			width: 100%;
		}
	
		nav li a{
			text-align: center;
			padding: 0;
		}
		
		nav H1{
			font-size: 2em;
			text-align: center;
			padding: 0.5em;
		}
		
		.body {
	  		max-width: 100%;
	  	}
	  	
	  	html {
	  		width: 100%;
	  		right: 0;
	  		position: relative;
		}
	
	}
	
	@media screen and (max-width: 800px){
	
		nav ul{	
			position: absolute;
			width: 100%;
		}
	
		nav li a{
			text-align: center;
			padding: 0;
		}
		
		nav H1{
			font-size: 2em;
			text-align: center;
			padding: 0.5em;
		}
		.body {
	  		max-width: 100%;
	  	}
	  	
	  	html {
	  		width: 100%;
	  		right: 0;
	  		position: relative;
		}
	}			
	
	
	
	
	/* Style the tab */
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
	
	
	
	
	
	</style>
		
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
		<h2>The Portable Potty Worker App</h2>
		
		
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
