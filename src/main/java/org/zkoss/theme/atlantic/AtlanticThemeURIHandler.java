/* AtlanticThemeURIHandler.java

		Purpose:
		
		Description:
		
		History:
				Wed Mar 03 17:12:39 CST 2021, Created by leon

Copyright (C) 2021 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.theme.atlantic;

import static org.zkoss.theme.atlantic.AtlanticThemeWebAppInit.ATLANTIC_NAME;
import org.zkoss.html.StyleSheet;
import org.zkoss.lang.Library;
import org.zkoss.web.fn.ThemeFns;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.util.ThemeURIHandler;
import org.zkoss.zk.ui.util.ThemeURIModifier;

/**
 * AtlanticThemeURIHandler is a ThemeURIHandler to provide theme uri which is needed for atlantic theme.
 *
 * @author leon
 * @since 9.6.0
 */
public class AtlanticThemeURIHandler implements ThemeURIHandler {
	/** Library property key. */
	private static final String DONT_USE_GOOGLE_FONT = "org.zkoss.theme.atlantic.useGoogleFont.disabled";

	@Override
	public void modifyThemeURIs(Execution exec, ThemeURIModifier modifier) {
		// DONT_USE_GOOGLE_FONT is false by default
		// ZK-4801: the google font should only be added when atlantic theme is active
		if (!Boolean.parseBoolean(Library.getProperty(DONT_USE_GOOGLE_FONT)) && ATLANTIC_NAME.equals(ThemeFns.getCurrentTheme())) {
			//ZK-2931 can't start the url with "//", encodeURL will prepend
			//current context path if no scheme were given
			modifier.add(new StyleSheet("https://fonts.googleapis.com/css?family=Open+Sans", "text/css"));
		}
	}
}
