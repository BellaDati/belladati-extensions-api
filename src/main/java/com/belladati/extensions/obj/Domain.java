package com.belladati.extensions.obj;

import java.util.List;

/**
 * Interface representing domain and available fields.
 * @author BellaDati Inc.
 */
public interface Domain {

	/**
	 * Returns internal ID of the domain
	 * @return id of the domain
	 */
	Integer getId();

	/**
	 * Returns name of the domain
	 * @return name of the domain
	 */
	String getName();

	/**
	 * Retrieves domain parameter specified by name
	 * @param name parameter name
	 * @return parameter value
	 */
	String getParameter(String name);

	/**
	 * Returns list of domain parameter names
	 * @return {@link List} of domain parameter names
	 */
	List<String> getParameterNames();

}
