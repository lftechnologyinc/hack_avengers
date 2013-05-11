<%@ page import="doctorsap.Doctor" %>



<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'eduction', 'error')} ">
	<label for="eduction">
		<g:message code="doctor.eduction.label" default="Eduction" />
		
	</label>
	<g:textField name="eduction" value="${doctorInstance?.eduction}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'fullName', 'error')} ">
	<label for="fullName">
		<g:message code="doctor.fullName.label" default="Full Name" />
		
	</label>
	<g:textField name="fullName" value="${doctorInstance?.fullName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'liscenceNo', 'error')} ">
	<label for="liscenceNo">
		<g:message code="doctor.liscenceNo.label" default="Liscence No" />
		
	</label>
	<g:textField name="liscenceNo" value="${doctorInstance?.liscenceNo}"/>
</div>

