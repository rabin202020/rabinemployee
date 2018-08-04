<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h1>Employees List</h1>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
   <!-- 
    $(document).ready(function() {
    	
		var deleteLink = $("a:contains('Delete')");
      
		$(deleteLink).click(function(event) {
    	  
			$.ajax({
				url: $(event.target).attr("href"),
			  	type: "DELETE",
			  	
			  	beforeSend: function(xhr) {
			  		xhr.setRequestHeader("Accept", "application/json");
			  		xhr.setRequestHeader("Content-Type", "application/json");
			  	},
			  	
			  /* 	success: function(smartphone) {
			  		var respContent = "";
			  		var rowToDelete = $(event.target).closest("tr");
			  		
			  		rowToDelete.remove();
			  		
			  		respContent += "<span class='success'>Smartphone was deleted: [";
			  		respContent += smartphone.producer + " : ";
			  		respContent += smartphone.model + " : " ;
			  		respContent += smartphone.price + "]</span>";
			  		
			  		$("#sPhoneFromResponse").html(respContent);   		
			  	} */
			});
  
			event.preventDefault();
		});
       
});   
</script>   -->
<table border="2" width="70%" cellpadding="2">  
<tr>
	<th>id</th><th>firstName</th><th>lastName</th><th>userName</th><th>password</th>
	</tr>
</head>

<body style="color: green;">
	<c:forEach var="sEmployee" items="${employee}">
		<tr>
			<td>${sEmployee.id}</td>
			<td>${sEmployee.firstName}</td>
			<td>${sEmployee.lastName}</td>
			<td>${sEmployee.userName}</td>
			<td>${sEmployee.password}</td>
			<td><a href="<c:url value='/edit/${sEmployee.id}' />">Edit</a><br /></td>				
			<td><a href="<c:url value='/employee/${sEmployee.id}' />">Delete</a><br /></td>
							
		</tr>
	</c:forEach>
	</table>  
	

	Login success
    <form method="post" action="/findbyuserName">
      <tr>
			<br /><td>Enter UserName</td>
			<td><input type="text" name="userName" value="" /></td>
			<table id="table" border=1>
			  <tr>
			<br /><td><input type="submit" value="getEmployee"></td><br />
		</tr>
			
		</tr>

	<br> <a href="/home/logout">Logout</a><br />
	<a href="exportUser.jsp">ImportExcelFormat</a>
</body>
</html>