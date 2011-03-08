/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by 
 * Appcelerator. It should not be modified by hand.
 */
package com.koocode;

import org.mozilla.javascript.Scriptable;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollModuleInfo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public final class KoocodetabprojectApplication extends TiApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		
		appInfo = new KoocodetabprojectAppInfo(this);
		postAppInfo();
		stylesheet = new ApplicationStylesheet();
		postOnCreate();
	}
	
	@Override
	protected void bootModules(TiContext context) {
		// Locale module
		modules.add(new ti.modules.titanium.locale.LocaleModule(context));
		// Media module
		modules.add(new ti.modules.titanium.media.MediaModule(context));
		// App module
		modules.add(new ti.modules.titanium.app.AppModule(context));
		// Analytics module
		modules.add(new ti.modules.titanium.analytics.AnalyticsModule(context));
		// JSON module
		modules.add(new ti.modules.titanium.json.JSONModule(context));
		// API module
		modules.add(new ti.modules.titanium.api.APIModule(context));
		// UI module
		modules.add(new ti.modules.titanium.ui.UIModule(context));
		// Filesystem module
		modules.add(new ti.modules.titanium.filesystem.FilesystemModule(context));
		// Android module
		modules.add(new ti.modules.titanium.android.AndroidModule(context));
		
		// Custom modules
		KrollModuleInfo moduleInfo;
		
		moduleInfo = new KrollModuleInfo(
			"titanium-barcode", "com.mwaysolutions.barcode", "bc88d841-a015-45a8-8d95-31a4fa924c35", "0.2",
			"Barcode module", "M-WAY Solutions GmbH", "Apache v2 license",
			"Copyright (c) 2011 M-WAY Solutions GmbH");
		KrollModule.addModuleInfo(moduleInfo);
		org.appcelerator.titanium.TiVerify verify = new org.appcelerator.titanium.TiVerify(context.getActivity(), this);
		verify.verify();
	}
	
	@Override
	public KrollModule requireModule(TiContext context, KrollModuleInfo info) {
		KrollModule module = super.requireModule(context, info);
		if (module != null) {
			return module;
		}
		
		String id = info.getId();
		if ("com.mwaysolutions.barcode".equals(id)) {
			module = new com.mwaysolutions.barcode.TitaniumBarcodeModule(context);
		}
		
		if (module != null) {
			modules.add(module);
			return module;
		}
		return null;
	}
}