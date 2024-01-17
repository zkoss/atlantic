Atlantic Theme (Deprecated)
========

This project is deprecated as of release 10.0.0,
please use [ZK Theme Pack](https://www.zkoss.org/product/zkthemepack) instead.

# ZK Flat Design Theme

Usage:

1. Put atlantic.jar in WEB-INF/lib, then Atlantic will become your default theme if there is no other themes.
2. Now you can also dynamically switch between different themes by cookie or library property, please read [Switching Themes](https://www.zkoss.org/wiki/ZK_Developer%27s_Reference/Theming_and_Styling/Switching_Themes).

It does not require a server restart, but user has to refresh the browser.

Refer to this [blog](http://blog.zkoss.org/index.php/2013/10/22/zk-7-introduces-atlantic-theme-a-new-flat-design/) for more information about the theme.


# Customize This Theme
run `init.sh` can change the theme name, but you need to update some Java class code manually. 

## produce jar
run `mvn clean package` to produce a theme jar.