<html xmlns:th="http://www.thymeleaf.org">
		

	<head ><title>page-2</title></head>
	
	
	<body  style="background-color: darkgray;color: black;">
	
	
	<h1 align="center"> BMI Result.</h1>
	
			<table align="center">
				<% response.setHeader("reset","40"); %>
			
			<tr>
			<td>Name  </td><td>${validUser.name}</td>
			</tr>
			
			<tr>
			<td>Gender  </td><td>${validUser.gender}</td>
			</tr>
			
			<tr>
			<td>Height  </td><td>${validUser.height} Cm</td>
			</tr>
			
			<tr>
			<td>Weight  </td><td>${validUser.weight} Kg</td>
			</tr>
			
			<tr>
			<td>BMI Calculation  </td><td>${bmi}</td>
			</tr>
			
			<tr>
			<td>BMI Status  </td><td>${BMIstatus}</td>
			</tr>
			</table>
			<br>
			<table align="center">
			<tr>
			<td>
			<button  type="button" name="back" onclick="history.
			back()">Back</button>
			</td>
			</tr>
			</table>
			<ul>
			<li>Empower Your Body,Empower Your Journey.</li>
			<li>Work for it,not just wish for it.</li>
		    <li>Celebrate Victories,Big and Small.</li>
			<li>Don't count the days.Make the days count.
			                 -Muhammad Ali.</li> 
			</ul>
			<br>
			<br>
			<br>
			<br>
			<br>
			
			<h3 align="center">Thanks for Using BMI Calculator.<h3>
			<hr>
			
	</body>
			
	
</html>

