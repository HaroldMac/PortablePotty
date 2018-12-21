<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Portable Potty</title>
	
	<base href="/">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/x-icon" href="images/profilePicture.jpg">
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
	
	#endShiftButton{
		
		background-color: red;
		border: outset;
		font-size: 2em;
		color: #fcfcfc;
		cursor: pointer;
		position: relative;
		margin: 0.25em;	
		font-family: "Helvetica Neue", Arial, sans-serif;
	}
	
	#endShiftButton {
		box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
	}

	/**
	 * Header Responsive Styles
	 */
	
	
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
	
	.boxes{
		text-align: right;
	}
	
	input[type="text"] {
	  margin-bottom: -1px;
	  border-bottom-left-radius: 0;
	  border-bottom-right-radius: 0;
	}
	
	input[type="password"] {
	  margin-bottom: 20px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}
	
	input[type="submit"] {
	  margin-bottom: 20px;
	}
	
	
	
	.formContainer{
		border: 1px solid #333;
		background-color: #555;
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
	
	
	.collapsible {
    background-color: #777;
    color: white;
    cursor: pointer;
    padding: 18px;
    width: 100%;
    border: none;
    text-align: left;
    outline: none;
    font-size: 15px;
}

.active, .collapsible:hover {
    background-color: #555;
}

.content {
    padding: 0 18px;
    display: none;
    overflow: hidden;
    background-color: light gray;
}	
	
	</style>

</head>
<body>
	<div id="header">
		<nav>		
			<ul>
				<li>Welcome, ${employee}</li>		
				<li><a href="/login">Sign In</a></li>
			</ul>
			<br>
		<H1>Portable Potty</H1>	
		</nav>
		
	</div>
	
	<div class="body">
		<h2>The Portable Potty Worker App</h2>
		<input type="checkbox" name="EOSCheckList" value="done">Re-Fueled
		<input type="checkbox" name="EOSCheckList" value="done">Sewage Dumped
		<input type="checkbox" name="EOSCheckList" value="done">Refilled Water
		<input type="checkbox" name="EOSCheckList" value="done">Refilled Supplies
		<input type="checkbox" name="EOSCheckList" value="done">Handed in Paper Work
		<input type="checkbox" name="EOSCheckList" value="done">Parked Vehicle
		<input type="checkbox" name="EOSCheckList" value="done">Site Locked<br>
		<input type="checkbox" name="EOSCheckList" value="done">Check All<br>
		Final Odometer<input type="text" name="FinalOdometer"><br>
		<a href='/'><button id="endShiftButton">End Shift</button></a>
	</div>	


	<div class="footer">

			<div id="contactInfo">
				<H2>Contact Me</H2>

				Email me @ <a href="mailto:harold.macdonald52@gmail.com">harold.macdonald52@gmail.com</a> <br>
				tel: (403) 606-3504 <br><br>
			</div>  
	</div>


</body>
</html>
