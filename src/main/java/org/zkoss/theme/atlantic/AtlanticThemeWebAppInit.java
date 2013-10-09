package org.zkoss.theme.atlantic;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zul.theme.Themes;

public class AtlanticThemeWebAppInit implements WebAppInit {

	private final static String ATLANTIC_NAME = "atlantic";
	private final static String ATLANTIC_DISPLAY = "Atlantic";
	private final static int ATLANTIC_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		Themes.register(ATLANTIC_NAME, ATLANTIC_DISPLAY, ATLANTIC_PRIORITY);
	}

}
