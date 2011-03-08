package com.koocode;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public final class KoocodetabprojectAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";
	
	public KoocodetabprojectAppInfo(TiApplication app) {
		TiProperties properties = app.getSystemProperties();
					
					properties.setString("ti.deploytype", "development");
	}
	
	public String getId() {
		return "com.koocode";
	}
	
	public String getName() {
		return "KoocodeTabProject";
	}
	
	public String getVersion() {
		return "1.0";
	}
	
	public String getPublisher() {
		return "matteo";
	}
	
	public String getUrl() {
		return "www.koocode.com";
	}
	
	public String getCopyright() {
		return "2011 by matteo";
	}
	
	public String getDescription() {
		return "No description provided";
	}
	
	public String getIcon() {
		return "default_app_logo.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "2551688a-db57-4055-8209-c3aec8873d86";
	}
	
	public boolean isFullscreen() {
		return false;
	}
	
	public boolean isNavBarHidden() {
		return false;
	}
}
