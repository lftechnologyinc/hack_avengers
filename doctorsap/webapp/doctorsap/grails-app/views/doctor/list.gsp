
<%@ page import="doctorsap.Doctor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'doctor.label', default: 'Doctor')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-doctor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<g:render template="/includes/navigation"/>
		<div id="list-doctor" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="eduction" title="${message(code: 'doctor.eduction.label', default: 'Eduction')}" />
					
						<g:sortableColumn property="fullName" title="${message(code: 'doctor.fullName.label', default: 'Full Name')}" />
					
						<g:sortableColumn property="liscenceNo" title="${message(code: 'doctor.liscenceNo.label', default: 'Liscence No')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${doctorInstanceList}" status="i" var="doctorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${doctorInstance.id}">${fieldValue(bean: doctorInstance, field: "eduction")}</g:link></td>
					
						<td>${fieldValue(bean: doctorInstance, field: "fullName")}</td>
					
						<td>${fieldValue(bean: doctorInstance, field: "liscenceNo")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${doctorInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
