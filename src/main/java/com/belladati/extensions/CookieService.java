package com.belladati.extensions;

/**
 * Used by other services to obtain cookie values for the current request, or to write cookie values as part of the request.
 * @author BellaDati Inc.
 */
public interface CookieService {

	/**
	 * Returns the value of the first cookie whose name matches.
	 * @param name
	 * @return
	 */
	String readCookieValue(String name);

	/**
	 * Removes a previously written cookie, by writing a new cookie with a maxAge of 0.
	 * @param name name of the cookie
	 */
	void removeCookieValue(String name);

	/**
	 * Creates or updates a cookie value.
	 * @param name name of the cookie
	 * @param value cookie value
	 */
	void writeCookieValue(String name, String value);

	/**
	 * As with {@link #writeCookieValue(String, String)} but an explicit maximum age may be set.
	 * @param name name of the cookie
	 * @param value cookie value
	 * @param maxAge max age
	 */
	void writeCookieValue(String name, String value, int maxAge);

	/**
	 * As with {@link #writeCookieValue(String, String)} but an explicit domain may be set.
	 * @param name name of the cookie
	 * @param value cookie value
	 * @param path path to set
	 */
	void writeCookieValue(String name, String value, String path);

	/**
	 * As with {@link #writeCookieValue(String, String)} but an explicit domain and maximum age may be set.
	 * @param name name of the cookie
	 * @param value cookie value
	 * @param path path to set
	 * @param domain specific domain name
	 */
	void writeCookieValue(String name, String value, String path, String domain);

	/**
	 * As with {@link #writeCookieValue(String, String, String)} but an explicit domain and path may be set.
	 * @param name name of the cookie
	 * @param value cookie value
	 * @param domain specific domain name
	 */
	void writeDomainCookieValue(String name, String value, String domain);

	/**
	 * Removes a previously written cookie, by writing a new cookie with a maxAge of 0.
	 * @param name name of the cookie
	 * @param value cookie value
	 * @param domain specific domain name
	 * @param maxAge max age
	 */
	void writeDomainCookieValue(String name, String value, String domain, int maxAge);
}
