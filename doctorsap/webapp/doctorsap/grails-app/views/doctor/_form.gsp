<%@ page import="doctorsap.Doctor" %>



<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'fullName', 'error')} required">
	<label for="fullName">
		<g:message code="doctor.fullName.label" default="Full Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullName" required="" value="${doctorInstance?.fullName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'liscenceNo', 'error')} required">
	<label for="liscenceNo">
		<g:message code="doctor.liscenceNo.label" default="Liscence No" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="liscenceNo" required="" value="${doctorInstance?.liscenceNo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'eduction', 'error')} ">
	<label for="eduction">
		<g:message code="doctor.eduction.label" default="Eduction" />
		
	</label>
	<g:textField name="eduction" value="${doctorInstance?.eduction}"/>
</div>
<fieldset class="embedded"><legend><g:message code="doctor.specialty.label" default="Specialty" /></legend>
<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'specialty.id', 'error')} required">
	<label for="specialty.id">
		<g:message code="doctor.specialty.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="id" type="number" value="${specialtyInstance.id}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'specialty.name', 'error')} required">
	<label for="specialty.name">
		<g:message code="doctor.specialty.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${specialtyInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'specialty.tags', 'error')} ">
	<label for="specialty.tags">
		<g:message code="doctor.specialty.tags.label" default="Tags" />
		
	</label>
	<g:textField name="tags" value="${specialtyInstance?.tags}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'specialty.version', 'error')} required">
	<label for="specialty.version">
		<g:message code="doctor.specialty.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="version" type="number" value="${specialtyInstance.version}" required=""/>
</div>
</fieldset>
