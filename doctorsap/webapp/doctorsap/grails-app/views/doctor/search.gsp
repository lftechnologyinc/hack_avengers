
<%@ page import="doctorsap.Doctor" %>
<%@ page import="doctorsap.Hospital" %>
<%@ page import="doctorsap.Specialty" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'doctor.label', default: 'Doctor')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div id="list-doctor" class="content scaffold-list" role="main">
			
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<% println('<tr><th>Full Name</th><th>Education</th><th>License Number</th><th>Specialty</th><th>Hospital</th></tr>')
					if(doctorInstanceList.size()>0){
						for(def list : doctorInstanceList){ 
								println('<tr><td>'+list.getAt(0)+'</td><td>'+list.getAt(1)+'</td><td>'+list.getAt(2)+'</td><td>'+list.getAt(3)+'</td><td>'+list.getAt(4)+'</td></tr>')
						}
					}else{
							println('<tr><td>No Doctors Found</td></tr>')
					}%>
					<tr>
				</thead>
			</table>
			<div class="pagination">
				<g:paginate total="${doctorInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
