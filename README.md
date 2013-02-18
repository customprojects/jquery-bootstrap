Grails jQuery & Bootstrap
===============
This plugin provides a full integration of grails with latest versions of jquery, jquery-ui and twitter bootstrap
Dependency
===============
compile ":jquery-bootstrap:0.1"
Installation
===============
grails insttall-plugin jquery-bootstrap
Usage
===============
This plugin provide a tag lib class with 1 tags: resources<br>
resources: Load all needed styles and js files for jquery-ui and bootstrap.<br>
<br>

Make sure your layout be as follows<br>
```html
<!DOCTYPE html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title><g:layoutTitle default="Grails"/></title><br>
		<!-- ... -->
		<jb:resources/>
	</head>
	<body>
		<!-- ... -->
	</body>
</html>
```
Then you can begin use all components provides by jquery and bootstrap.<br>
In future versions add a complete tag lib to display all twitter bootstrap components
