<%@ page import="doctorsap.Hospital" %>



<div class="fieldcontain ${hasErrors(bean: hospitalInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="hospital.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${hospitalInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: hospitalInstance, field: 'contact', 'error')} required">
	<label for="contact">
		<g:message code="hospital.contact.label" default="Contact" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="contact" required="" value="${hospitalInstance?.contact}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: hospitalInstance, field: 'location', 'error')} required">
	<label for="location">
		<g:message code="hospital.location.label" default="Location" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="location" required="" value="${hospitalInstance?.location}"/>
</div>

