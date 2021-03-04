/* AtlanticThemeURIHandler.java

		Purpose:
		
		Description:
		
		History:
				Wed Mar 03 17:12:39 CST 2021, Created by leon

Copyright (C) 2021 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.theme.atlantic;

import org.zkoss.html.StyleSheet;
import org.zkoss.lang.Library;
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
		if (!Boolean.parseBoolean(Library.getProperty(DONT_USE_GOOGLE_FONT))) { //false by default
			//ZK-2931 can't start the url with "//", encodeURL will prepend
			//current context path if no scheme were given
			modifier.add(new StyleSheet(exec.getScheme() + "://fonts.googleapis.com/css?family=Open+Sans", "text/css"));
		}
	}
}
