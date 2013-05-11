<%@ page import="doctorsap.Specialty" %>



<div class="fieldcontain ${hasErrors(bean: specialtyInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="specialty.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${specialtyInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: specialtyInstance, field: 'tags', 'error')} ">
	<label for="tags">
		<g:message code="specialty.tags.label" default="Tags" />
		
	</label>
	<g:textField name="tags" value="${specialtyInstance?.tags}"/>
</div>

