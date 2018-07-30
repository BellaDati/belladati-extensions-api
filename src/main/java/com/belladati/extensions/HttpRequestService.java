package com.belladati.extensions;

import java.util.List;

import com.belladati.extensions.obj.Session;

/**
 * Generic version of HttpServletRequest, used to encapsulate the Servlet API version, and to help bridge the differences between Servlet API and Porlet API.
 * @author BellaDati Inc.
 */
public interface HttpRequestService {

	/**
	 * Returns the value of the named attribute as an Object, or null if no attribute of the given name exists.
	 * @param name name of the attribute
	 * @return attribute value
	 */
	Object getAttribute(String name);

	/**
	 * Returns the context path.
	 * @return context path
	 */
	String getContextPath();

	/**
	 * Returns the named header as a string, or null if not found.
	 * @param name header name
	 * @return header value
	 */
	String getHeader(String name);

	/**
	 * Returns the names of all headers in the request.
	 * @return {@link List} of header names
	 */
	List<String> getHeaderNames();

	/**
	 * Returns the locale of the client as determined from the request headers.
	 * @return locale string
	 */
	String getLocale();

	/**
	 * Returns the Internet Protocol (IP) port number of the interface on which the request was received.
	 * @return local port
	 */
	int getLocalPort();

	/**
	 * Returns the name of the HTTP method with which this request was made, for example, GET, POST, or PUT.
	 * @return HTTP method
	 */
	String getMethod();

	/**
	 * Returns the query parameter value for the given name.
	 * @param name parameter name
	 * @return value of the parameter or <code>null</code>
	 */
	String getParameter(String name);

	/**
	 * Returns a list of query parameter names, in alphabetical order.
	 * @return {@link List} of parameter names
	 */
	List<String> getParameterNames();

	/**
	 * Returns the parameter values for the given name.
	 * @param name array of parameter values
	 * @return array of {@link String}s
	 */
	String[] getParameters(String name);

	/**
	 * Returns the path portion of the request, which starts with a "/" and contains everything up to the start of the query parameters.
	 * @return path of the request
	 */
	String getPath();

	/**
	 * Returns the fully qualified name of the client or the last proxy that sent the request.
	 * @return remote host
	 */
	String getRemoteHost();

	/**
	 * Returns the host name of the server to which the request was sent.
	 * @return server name
	 */
	String getServerName();

	/**
	 * Returns the port number to which the request was sent.
	 * @return server port
	 */
	int getServerPort();

	/**
	 * Gets the {@link Session}
	 * @param create determines whether to create session if it does not exist
	 * @return {@link Session} object
	 */
	Session getSession(boolean create);

	/**
	 * Checks whether the requested session ID is still valid.
	 * @return determines whether requested session ID is still valid
	 */
	boolean isRequestedSessionIdValid();

	/**
	 * Returns a boolean indicating whether this request was made using a secure channel, such as HTTPS.
	 * @return whether is connection secured
	 */
	boolean isSecure();

	/**
	 * Returns true if the request originated on the client using XmlHttpRequest (the core of any Ajax behavior).
	 * @return Returns true if the request originated on the client using XmlHttpRequest (the core of any Ajax behavior). 
	 */
	boolean isXHR();

	/**
	 * Stores an attribute in this request.
	 * @param name attribute name
	 * @param value attribute value
	 */
	void setAttribute(String name, Object value);

}
