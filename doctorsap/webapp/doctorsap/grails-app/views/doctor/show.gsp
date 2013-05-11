
<%@ page import="doctorsap.Doctor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'doctor.label', default: 'Doctor')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-doctor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-doctor" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list doctor">
			
				<g:if test="${doctorInstance?.fullName}">
				<li class="fieldcontain">
					<span id="fullName-label" class="property-label"><g:message code="doctor.fullName.label" default="Full Name" /></span>
					
						<span class="property-value" aria-labelledby="fullName-label"><g:fieldValue bean="${doctorInstance}" field="fullName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${doctorInstance?.liscenceNo}">
				<li class="fieldcontain">
					<span id="liscenceNo-label" class="property-label"><g:message code="doctor.liscenceNo.label" default="Liscence No" /></span>
					
						<span class="property-value" aria-labelledby="liscenceNo-label"><g:fieldValue bean="${doctorInstance}" field="liscenceNo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${doctorInstance?.eduction}">
				<li class="fieldcontain">
					<span id="eduction-label" class="property-label"><g:message code="doctor.eduction.label" default="Eduction" /></span>
					
						<span class="property-value" aria-labelledby="eduction-label"><g:fieldValue bean="${doctorInstance}" field="eduction"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${doctorInstance?.specialty}">
				<li class="fieldcontain">
					<span id="specialty-label" class="property-label"><g:message code="doctor.specialty.label" default="Specialty" /></span>
					
						<span class="property-value" aria-labelledby="specialty-label"><g:link controller="specialty" action="show" id="${doctorInstance?.specialty?.id}">${doctorInstance?.specialty?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${doctorInstance?.id}" />
					<g:link class="edit" action="edit" id="${doctorInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
