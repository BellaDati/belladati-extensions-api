package com.belladati.extensions.obj;

import java.util.List;

/**
 * Generic version of HttpSession, used to bridge the gaps between the Servlet API and the Portlet API.
 * @author BellaDati Inc.
 */
public interface Session {

	/**
	 * Returns the value previously stored in the session.
	 * @param name name of the attribute
	 * @return value of the attribute
	 */
	Object getAttribute(String name);

	/**
	 * Returns a list of the names of all attributes stored in the session.
	 * @return {@link List} of the attribute names
	 */
	List<String> getAttributeNames();

	/**
	 * Returns a list of the names of all attributes stored in the session whose name has the provided prefix.
	 * @param name attribute name
	 * @return list of the attribute values
	 */
	List<String> getAttributeNames(String name);

	/**
	 * Returns the maximum time interval, in seconds, that the servlet container will keep this session open between client accesses.
	 * @return the maximum time interval
	 */
	int getMaxInactiveInterval();

	/**
	 * Invalidates this session then unbinds any objects bound to it. 
	 */
	void invalidate();

	/**
	 * Checks to see if the session has been invalidated.
	 * @return Checks to see if the session has been invalidated.
	 */
	boolean isInvalidated();

	/**
	 * Sets the value of an attribute.
	 * @param name name of the attribute
	 * @param value value of the attribute
	 */
	void setAttribute(String name, Object value);

	/**
	 * Specifies the time, in seconds, between client requests before the servlet container will invalidate this session.
	 * @param interval time interval in seconds
	 */
	void setMaxInactiveInterval(int interval);
}
