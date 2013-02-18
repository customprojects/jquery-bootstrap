package grails.plugin.jquerybootstrap

class JQueryBootstrapTagLib {
	
	static namespace = 'jb'
	
	def resources = {
		out << "<link href=\"${g.resource(dir: 'bootstrap/css', file: 'bootstrap.min.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
		out << "<link href=\"${g.resource(dir: 'bootstrap/css', file: 'bootstrap-responsive.min.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
		out << "<link href=\"${g.resource(dir: 'css', file: 'jquery-ui-1.9.2.custom.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
		out << "<script src=\"${g.resource(dir: 'js', file: 'jquery-1.9.1.min.js', plugin: 'jquery-bootstrap')}\"></script>\n"
		out << "<script src=\"${g.resource(dir: 'bootstrap/js', file: 'bootstrap.min.js', plugin: 'jquery-bootstrap')}\"></script>\n"
		out << "<script src=\"${g.resource(dir: 'bootstrap/js', file: 'jquery-ui-1.9.2.custom.min.js', plugin: 'jquery-bootstrap')}\"></script>\n"
	}
	
	def btn = {attrs->
		out << "<input type=\"button\" class=\"btn\" value=\"${attrs.label}\" id=\"${attrs.id}\">"
	}
	
	def btnPrimary = {attrs->
		out << "<input type=\"button\" class=\"btn btn-primary\" value=\"${attrs.label}\" id=\"${attrs.id}\">"
	}
		
	def btnSuccess = {attrs->
		out << "<input type=\"button\" class=\"btn btn-success\" value=\"${attrs.label}\" id=\"${attrs.id}\">"
	}
	
	def btnDanger = {attrs->
		out << "<input type=\"button\" class=\"btn btn-danger\" value=\"${attrs.label}\" id=\"${attrs.id}\">"
	}
	
	def dialog = {attrs, body->
		out << "<div id=\"${attrs.id}\" title=\"${attrs.title}\">"
		out << body()
		out << "</div>"
		out << """
			<script>
				\$(function(){
					\$('#${attrs.id}').dialog({
						autoOpen: ${!attrs.autoOpen?'false':'true'}
						${!attrs.modal?',modal: false':',modal:'+attrs.modal}
						${!attrs.width?'':',width: '+attrs.width}
						${!attrs.height?'':',height: '+attrs.height}
					});
				});
			</script>
"""
	}
}
