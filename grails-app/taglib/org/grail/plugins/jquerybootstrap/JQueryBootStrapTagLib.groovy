package org.grail.plugins.jquerybootstrap

class JQueryBootStrapTagLib {
	static namespace = "jb"
	
	def cssResources = {
		out << "<link href=\"${g.resource(dir: 'bootstrap/css', file: 'bootstrap.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
		out << "<link href=\"${g.resource(dir: 'bootstrap/css', file: 'bootstrap-responsive.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
		out << "<link href=\"${g.resource(dir: 'css', file: 'jquery-ui-1.9.2.custom.css', plugin: 'jquery-bootstrap')}\" rel=\"stylesheet\">\n"
	}
	
	def jsResources = {
		out << "<script src=\"${g.resource(dir: 'js', file: 'jquery-1.9.1.min.js', plugin: 'jquery-bootstrap')}\"></script>\n"
		out << "<script src=\"${g.resource(dir: 'js', file: 'jquery-ui-1.9.2.custom.min.js', plugin: 'jquery-bootstrap')}\"></script>\n"
		out << "<script src=\"${g.resource(dir: 'bootstrap/js', file: 'bootstrap.js', plugin: 'jquery-bootstrap')}\"></script>\n"
	}
}
