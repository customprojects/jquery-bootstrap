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
This plugin provide a tag lib class with 2 tags: cssResources and jsResources<br>
cssResources: Load all needed styles for jquery-ui and bootstrap.<br>
jsResources: Load all needed js files.<br>
<br>

Make sure your layout be as follows<br>
```html
<html>
    <head>
    <!-- ... -->
    <title><g:layoutTitle default="Grails"/></title><br>
		<!-- ... -->
    <jb:cssResources/>
	</head>
	<body>
    <!-- ... -->
	  <jb:jsResources/>
    <!-- your js code here -->
	</body>
</html>
```
Then you can begin use all components provides by jquery and bootstrap.<br>
In future versions add a complete tag lib to display all twitter bootstrap components
