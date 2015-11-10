package org.zkoss.theme.atlantic;

import java.util.Collection;
import java.util.List;

import org.zkoss.html.StyleSheet;
import org.zkoss.lang.Library;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zul.theme.StandardThemeProvider;

public class AtlanticCEThemeProvider extends StandardThemeProvider {

	/** Library property key. */
	private static final String DONT_USE_GOOGLE_FONT = "org.zkoss.theme.atlantic.useGoogleFont.disabled";
	
	@Override
	public Collection<Object> getThemeURIs(Execution exec, List<Object> uris) {
		if (!Boolean.parseBoolean(Library.getProperty(DONT_USE_GOOGLE_FONT))) { //false by default
			//ZK-2931 can't start the url with "//", encodeURL will prepend
			//current context path if no scheme were given 
			uris.add(new StyleSheet(exec.getScheme() + "://fonts.googleapis.com/css?family=Open+Sans", "text/css"));
		}
		return super.getThemeURIs(exec, uris);
	}
}
