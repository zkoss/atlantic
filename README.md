Atlantic Theme
========

ZK Flat Design Theme

Usage:

1. Put atlantic.jar in WEB-INF/lib, then Atlantic will become your default theme if there is no other themes.
2. Now you can also dynamically switch between different themes by cookie or library property
	* Use library-property in in WEB-INF/zk.xml

			<library-property>
				<name>org.zkoss.theme.preferred</name>
				<value>atlantic</value>
			</library-property>
	* Use cookie to switch theme, add a cookie

			zktheme=atlantic

It does not require a server restart, but user has to refresh the browser.

Refer to this [blog](http://blog.zkoss.org/index.php/2013/10/22/zk-7-introduces-atlantic-theme-a-new-flat-design/) for more information about the theme.
