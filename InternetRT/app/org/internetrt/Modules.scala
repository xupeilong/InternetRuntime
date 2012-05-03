package org.internetrt
import org.internetrt.core.Components
import org.internetrt.core._


/**
 * This object control all the connections in the website 
 */
object SiteInternetRuntime extends InternetRuntime{
	val components = new Components 
		  				with StubSignalSystemComponent
						with StubConfigurationSystemComponent
						with StubIOManagerComponent{}
}
