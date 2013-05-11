
<%@ page import="doctorsap.Specialty" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'specialty.label', default: 'Specialty')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-specialty" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-specialty" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'specialty.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="tags" title="${message(code: 'specialty.tags.label', default: 'Tags')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${specialtyInstanceList}" status="i" var="specialtyInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${specialtyInstance.id}">${fieldValue(bean: specialtyInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: specialtyInstance, field: "tags")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${specialtyInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
