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

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'hospital', 'error')} required">
	<label for="hospital">
		<g:message code="doctor.hospital.label" default="Hospital" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="hospital" name="hospital.id" from="${doctorsap.Hospital.list()}" optionKey="id" required="" value="${doctorInstance?.hospital?.id}" class="many-to-one"/>
</div>

