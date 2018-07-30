package com.belladati.extensions;

import java.util.List;

/**
 * Interface defining methods for working with current Extension instance. 
 * @author BellaDati Inc.
 */
public interface ExtensionService {

	/**
	 * Retrieve parameter value specified by name
	 * @param name parameter name
	 * @return parameter value
	 */
	String getParameter(String name);

	/**
	 * Retrieves the list of parameter names
	 * @return {@link List} of parameter names
	 */
	List<String> getParameterNames();

}
